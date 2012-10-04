package org.prathipati.internal.tools.rally;

import java.io.Console;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.axis.client.Stub;
import org.apache.commons.lang3.StringUtils;
import org.prathipati.internal.tools.rally.config.RallyConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rallydev.webservice.v1_31.domain.Defect;
import com.rallydev.webservice.v1_31.domain.DomainObject;
import com.rallydev.webservice.v1_31.domain.OperationResult;
import com.rallydev.webservice.v1_31.domain.Project;
import com.rallydev.webservice.v1_31.domain.QueryResult;
import com.rallydev.webservice.v1_31.domain.User;
import com.rallydev.webservice.v1_31.domain.Workspace;
import com.rallydev.webservice.v1_31.service.RallyService;
import com.rallydev.webservice.v1_31.service.RallyServiceServiceLocator;

public class RallyConnector {
	private static final Logger LOGGER = LoggerFactory.getLogger(RallyConnector.class);
	RallyConfig rallyConfig;
	User currentUser;
	private List<Defect> defects = new ArrayList<Defect>();
	RallyService service;

	public static void main(String s[]) throws Exception {
		try {
			Console console = System.console();
			RallyConnector rc = new RallyConnector();
			if (console != null) {
				char[] passwdArr = console.readPassword("Enter rally password: ");
				rc = new RallyConnector();
				rc.initialize(passwdArr);
				Arrays.fill(passwdArr, ' ');
			} else {
				LOGGER.info("Console unavailable .. cannot login");
			}
			//LOGGER.info("# defects found: " + rc.getDefectList().size());
			for (Defect defect : rc.getDefectList()) {
				if(defect != null) {
//					LOGGER.info(defect.getFormattedID() + ": " +  defect.getSubmittedBy()!=null ? defect.getSubmittedBy().getRefObjectName() : "" +  ": " +defect.getOwner()!=null ? defect.getOwner().getRefObjectName() : ""+ ": " + defect.getName());
//					LOGGER.info(defect.getFormattedID() + ": " +  defect.getSubmittedBy().getRefObjectName() +  ": " + defect.getOwner().getRefObjectName() + ": " + defect.getName());
				}
			}
			LOGGER.info(rc.updateDefects());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void initialize(char[] password) {
		initialize(rallyConfig.getDefaultUserName(), password);
	}
	
	public void initialize(String username, char[] password) {
		try {
			service = (new RallyServiceServiceLocator()).getRallyService(new URL(rallyConfig.getServiceUrl() + "/RallyService"));
			Stub stub = (Stub) service;
			stub.setUsername(username);
			stub.setPassword(new String(password));
			Arrays.fill(password, ' ');
			stub.setMaintainSession(true);
			currentUser = (User)service.getCurrentUser();
			LOGGER.info("Logged in as: " + currentUser.getDisplayName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public RallyConnector() {
		rallyConfig = new RallyConfig();
	}

	public List<Defect> getDefectList() throws Exception {
		try {
			Workspace ws = null;
			Project project = new Project();
			project.setRef(rallyConfig.getServiceUrl() + "/project/" + rallyConfig.getDefaultProjectId());
			QueryResult queryResult = service.query(ws, project, false, true, rallyConfig.getDefaultObjectType(), rallyConfig.getDefaultQueryString(), rallyConfig.getDefaultOrderString(), rallyConfig.isFetchFullObjects(), rallyConfig.getPageStart(), rallyConfig.getPageSize());
			if (hasErrors(queryResult)) {
				LOGGER.error("Could not query.. " + queryResult.getErrors());
			} else {
				DomainObject[] results = queryResult.getResults();
				for (DomainObject result : results) {
					Defect defect = (Defect) result;
					this.getDefects().add(defect);
				}
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return this.getDefects();
	}

	public synchronized String updateDefects() {
		StringBuffer wikiString = new StringBuffer();
		try {
			for (Defect defect : getDefects()) {
				OperationResult res = service.update(updateState(defect.getRef(), "d2q"));
				wikiString.append(defect.getFormattedID()).append(", ");
				if (res.getErrors().length > 0) {
					return res.getErrors().toString();
				}
			}
			return StringUtils.isEmpty(wikiString.toString()) ? "No defects found" :
					"Done. (" + wikiString.substring(0, wikiString.length() - 2).toString() + ")";
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			e.printStackTrace();
			return e.getMessage();
		}
	}

	private boolean hasErrors(QueryResult queryResult) {
		return queryResult.getErrors().length > 0 ? true : false;
	}

	private Defect updateState(String ref, String newState) {
		Defect defect = new Defect();
		defect.setRef(ref);
		defect.setState(RallyConfig.RALLY_STATES.get(newState, "state"));
		defect.setScheduleState(RallyConfig.RALLY_STATES.get(newState, "scheduleState"));
		if(!StringUtils.isBlank(RallyConfig.RALLY_STATES.get(newState, "resolution"))) {
			defect.setResolution(RallyConfig.RALLY_STATES.get(newState, "resolution"));
		}
		return defect;
	}

	public List<Defect> getDefects() {
		return defects;
	}

	public void setDefects(List<Defect> defects) {
		this.defects = defects;
	}

	public RallyConfig getRallyConfig() {
		return rallyConfig;
	}

	public void setRallyConfig(RallyConfig rallyConfig) {
		this.rallyConfig = rallyConfig;
	}
}
