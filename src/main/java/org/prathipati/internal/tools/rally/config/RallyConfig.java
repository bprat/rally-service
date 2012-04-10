package org.prathipati.internal.tools.rally.config;

import org.apache.commons.collections15.map.MultiKeyMap;
import org.apache.commons.configuration.XMLConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RallyConfig {
	private static final Logger LOGGER = LoggerFactory.getLogger(RallyConfig.class);
	XMLConfiguration config;
	String serviceUrl;
	String apiVersion;
	String baseServiceUrl;
	String defaultObjectType;
	String defaultQueryString;
	String rallyServiceEndpoint;
	String projectEndPoint;
	String pmtQueryString;
	String defaultOrderString;
	String defaultProjectId;
	int pageStart;
	int pageSize;
	boolean fetchFullObjects;
	String defaultUserName;
	
	@SuppressWarnings("unchecked")
	public static final MultiKeyMap<String, String> RALLY_STATES = new MultiKeyMap<String, String>() {
		private static final long serialVersionUID = -4175850725064655397L;
		{
			put("open", "state", "Open");
			put("open", "scheduleState", "In-Progress");
			put("open", "resolution", "Unresolved");
			put("ready", "state", "Ready");
			put("ready", "scheduleState", "Completed");
			put("ready", "resolution", "Resolved");
			put("d2q", "state", "Deploy to QA");
			put("d2q", "scheduleState", "Completed");
			//put("d2q", "resolution", "Resolved");
		}
	};
	
	public RallyConfig() {
		try {
			config = new XMLConfiguration("config.xml");
			apiVersion = config.getString("apiVersion");
			baseServiceUrl = config.getString("baseServiceUrl");
			defaultObjectType = config.getString("defaultObjectType");
			defaultQueryString = config.getString("defaultQueryString");
			rallyServiceEndpoint = config.getString("rallyServiceEndpoint");
			projectEndPoint = config.getString("projectEndPoint");
			pmtQueryString = config.getString("pmtQueryString");
			defaultOrderString = config.getString("defaultOrderString");
			defaultProjectId = config.getString("defaultProjectId");
			pageStart = Integer.parseInt(config.getString("pageStart"));
			pageSize = Integer.parseInt(config.getString("pageSize"));
			fetchFullObjects = Boolean.valueOf(config.getString("fetchFullObjects"));
			defaultUserName = config.getString("defaultUserName");
			serviceUrl = "https://rally1.rallydev.com/slm/webservice/" + apiVersion;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getBaseServiceUrl() {
		return baseServiceUrl;
	}

	public void setBaseServiceUrl(String baseServiceUrl) {
		this.baseServiceUrl = baseServiceUrl;
	}

	public XMLConfiguration getConfig() {
		return config;
	}

	public void setConfig(XMLConfiguration config) {
		this.config = config;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getDefaultObjectType() {
		return defaultObjectType;
	}

	public void setDefaultObjectType(String defaultObjectType) {
		this.defaultObjectType = defaultObjectType;
	}

	public String getDefaultQueryString() {
		return defaultQueryString;
	}

	public void setDefaultQueryString(String defaultQueryString) {
		this.defaultQueryString = defaultQueryString;
	}

	public String getRallyServiceEndpoint() {
		return rallyServiceEndpoint;
	}

	public void setRallyServiceEndpoint(String rallyServiceEndpoint) {
		this.rallyServiceEndpoint = rallyServiceEndpoint;
	}

	public String getProjectEndPoint() {
		return projectEndPoint;
	}

	public void setProjectEndPoint(String projectEndPoint) {
		this.projectEndPoint = projectEndPoint;
	}

	public String getPmtQueryString() {
		return pmtQueryString;
	}

	public void setPmtQueryString(String pmtQueryString) {
		this.pmtQueryString = pmtQueryString;
	}

	public String getDefaultOrderString() {
		return defaultOrderString;
	}

	public void setDefaultOrderString(String defaultOrderString) {
		this.defaultOrderString = defaultOrderString;
	}

	public String getDefaultProjectId() {
		return defaultProjectId;
	}

	public void setDefaultProjectId(String defaultProjectId) {
		this.defaultProjectId = defaultProjectId;
	}

	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public boolean isFetchFullObjects() {
		return fetchFullObjects;
	}

	public void setFetchFullObjects(boolean fetchFullObjects) {
		this.fetchFullObjects = fetchFullObjects;
	}

	public String getDefaultUserName() {
		return defaultUserName;
	}

	public void setDefaultUserName(String defaultUserName) {
		this.defaultUserName = defaultUserName;
	}
}
