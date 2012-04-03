/**
 * HierarchicalRequirement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_31.domain;

public class HierarchicalRequirement  extends com.rallydev.webservice.v1_31.domain.Requirement  implements java.io.Serializable {
    private java.util.Calendar acceptedDate;

    private java.lang.Boolean blocked;

    private com.rallydev.webservice.v1_31.domain.Blocker blocker;

    private com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] children;

    private java.lang.String defectStatus;

    private com.rallydev.webservice.v1_31.domain.Defect[] defects;

    private java.util.Calendar inProgressDate;

    private com.rallydev.webservice.v1_31.domain.Iteration iteration;

    private com.rallydev.webservice.v1_31.domain.HierarchicalRequirement parent;

    private java.lang.Double planEstimate;

    private com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] predecessors;

    private java.math.BigDecimal rank;

    private java.lang.Boolean recycled;

    private com.rallydev.webservice.v1_31.domain.Release release;

    private java.lang.String scheduleState;

    private com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] successors;

    private java.lang.Double taskActualTotal;

    private java.lang.Double taskEstimateTotal;

    private java.lang.Double taskRemainingTotal;

    private java.lang.String taskStatus;

    private com.rallydev.webservice.v1_31.domain.Task[] tasks;

    private java.lang.String testCaseStatus;

    private com.rallydev.webservice.v1_31.domain.TestCase[] testCases;

    private java.lang.String blockedDescription;

    private java.lang.String client;

    private java.lang.String completedIn;

    private java.lang.String releaseNotes;

    public HierarchicalRequirement() {
    }

    public HierarchicalRequirement(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           com.rallydev.webservice.v1_31.domain.Subscription subscription,
           com.rallydev.webservice.v1_31.domain.Workspace workspace,
           com.rallydev.webservice.v1_31.domain.Changeset[] changesets,
           java.lang.String description,
           com.rallydev.webservice.v1_31.domain.ConversationPost[] discussion,
           java.lang.String formattedID,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.String notes,
           com.rallydev.webservice.v1_31.domain.User owner,
           com.rallydev.webservice.v1_31.domain.Project project,
           com.rallydev.webservice.v1_31.domain.RevisionHistory revisionHistory,
           com.rallydev.webservice.v1_31.domain.Tag[] tags,
           com.rallydev.webservice.v1_31.domain.Attachment[] attachments,
           java.lang.String _package,
           java.util.Calendar acceptedDate,
           java.lang.Boolean blocked,
           com.rallydev.webservice.v1_31.domain.Blocker blocker,
           com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] children,
           java.lang.String defectStatus,
           com.rallydev.webservice.v1_31.domain.Defect[] defects,
           java.util.Calendar inProgressDate,
           com.rallydev.webservice.v1_31.domain.Iteration iteration,
           com.rallydev.webservice.v1_31.domain.HierarchicalRequirement parent,
           java.lang.Double planEstimate,
           com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] predecessors,
           java.math.BigDecimal rank,
           java.lang.Boolean recycled,
           com.rallydev.webservice.v1_31.domain.Release release,
           java.lang.String scheduleState,
           com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] successors,
           java.lang.Double taskActualTotal,
           java.lang.Double taskEstimateTotal,
           java.lang.Double taskRemainingTotal,
           java.lang.String taskStatus,
           com.rallydev.webservice.v1_31.domain.Task[] tasks,
           java.lang.String testCaseStatus,
           com.rallydev.webservice.v1_31.domain.TestCase[] testCases,
           java.lang.String blockedDescription,
           java.lang.String client,
           java.lang.String completedIn,
           java.lang.String releaseNotes) {
        super(
            ref,
            objectVersion,
            type,
            refObjectName,
            rallyAPIMajor,
            rallyAPIMinor,
            creationDate,
            objectID,
            subscription,
            workspace,
            changesets,
            description,
            discussion,
            formattedID,
            lastUpdateDate,
            name,
            notes,
            owner,
            project,
            revisionHistory,
            tags,
            attachments,
            _package);
        this.acceptedDate = acceptedDate;
        this.blocked = blocked;
        this.blocker = blocker;
        this.children = children;
        this.defectStatus = defectStatus;
        this.defects = defects;
        this.inProgressDate = inProgressDate;
        this.iteration = iteration;
        this.parent = parent;
        this.planEstimate = planEstimate;
        this.predecessors = predecessors;
        this.rank = rank;
        this.recycled = recycled;
        this.release = release;
        this.scheduleState = scheduleState;
        this.successors = successors;
        this.taskActualTotal = taskActualTotal;
        this.taskEstimateTotal = taskEstimateTotal;
        this.taskRemainingTotal = taskRemainingTotal;
        this.taskStatus = taskStatus;
        this.tasks = tasks;
        this.testCaseStatus = testCaseStatus;
        this.testCases = testCases;
        this.blockedDescription = blockedDescription;
        this.client = client;
        this.completedIn = completedIn;
        this.releaseNotes = releaseNotes;
    }


    /**
     * Gets the acceptedDate value for this HierarchicalRequirement.
     * 
     * @return acceptedDate
     */
    public java.util.Calendar getAcceptedDate() {
        return acceptedDate;
    }


    /**
     * Sets the acceptedDate value for this HierarchicalRequirement.
     * 
     * @param acceptedDate
     */
    public void setAcceptedDate(java.util.Calendar acceptedDate) {
        this.acceptedDate = acceptedDate;
    }


    /**
     * Gets the blocked value for this HierarchicalRequirement.
     * 
     * @return blocked
     */
    public java.lang.Boolean getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this HierarchicalRequirement.
     * 
     * @param blocked
     */
    public void setBlocked(java.lang.Boolean blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the blocker value for this HierarchicalRequirement.
     * 
     * @return blocker
     */
    public com.rallydev.webservice.v1_31.domain.Blocker getBlocker() {
        return blocker;
    }


    /**
     * Sets the blocker value for this HierarchicalRequirement.
     * 
     * @param blocker
     */
    public void setBlocker(com.rallydev.webservice.v1_31.domain.Blocker blocker) {
        this.blocker = blocker;
    }


    /**
     * Gets the children value for this HierarchicalRequirement.
     * 
     * @return children
     */
    public com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this HierarchicalRequirement.
     * 
     * @param children
     */
    public void setChildren(com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] children) {
        this.children = children;
    }


    /**
     * Gets the defectStatus value for this HierarchicalRequirement.
     * 
     * @return defectStatus
     */
    public java.lang.String getDefectStatus() {
        return defectStatus;
    }


    /**
     * Sets the defectStatus value for this HierarchicalRequirement.
     * 
     * @param defectStatus
     */
    public void setDefectStatus(java.lang.String defectStatus) {
        this.defectStatus = defectStatus;
    }


    /**
     * Gets the defects value for this HierarchicalRequirement.
     * 
     * @return defects
     */
    public com.rallydev.webservice.v1_31.domain.Defect[] getDefects() {
        return defects;
    }


    /**
     * Sets the defects value for this HierarchicalRequirement.
     * 
     * @param defects
     */
    public void setDefects(com.rallydev.webservice.v1_31.domain.Defect[] defects) {
        this.defects = defects;
    }


    /**
     * Gets the inProgressDate value for this HierarchicalRequirement.
     * 
     * @return inProgressDate
     */
    public java.util.Calendar getInProgressDate() {
        return inProgressDate;
    }


    /**
     * Sets the inProgressDate value for this HierarchicalRequirement.
     * 
     * @param inProgressDate
     */
    public void setInProgressDate(java.util.Calendar inProgressDate) {
        this.inProgressDate = inProgressDate;
    }


    /**
     * Gets the iteration value for this HierarchicalRequirement.
     * 
     * @return iteration
     */
    public com.rallydev.webservice.v1_31.domain.Iteration getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this HierarchicalRequirement.
     * 
     * @param iteration
     */
    public void setIteration(com.rallydev.webservice.v1_31.domain.Iteration iteration) {
        this.iteration = iteration;
    }


    /**
     * Gets the parent value for this HierarchicalRequirement.
     * 
     * @return parent
     */
    public com.rallydev.webservice.v1_31.domain.HierarchicalRequirement getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this HierarchicalRequirement.
     * 
     * @param parent
     */
    public void setParent(com.rallydev.webservice.v1_31.domain.HierarchicalRequirement parent) {
        this.parent = parent;
    }


    /**
     * Gets the planEstimate value for this HierarchicalRequirement.
     * 
     * @return planEstimate
     */
    public java.lang.Double getPlanEstimate() {
        return planEstimate;
    }


    /**
     * Sets the planEstimate value for this HierarchicalRequirement.
     * 
     * @param planEstimate
     */
    public void setPlanEstimate(java.lang.Double planEstimate) {
        this.planEstimate = planEstimate;
    }


    /**
     * Gets the predecessors value for this HierarchicalRequirement.
     * 
     * @return predecessors
     */
    public com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] getPredecessors() {
        return predecessors;
    }


    /**
     * Sets the predecessors value for this HierarchicalRequirement.
     * 
     * @param predecessors
     */
    public void setPredecessors(com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] predecessors) {
        this.predecessors = predecessors;
    }


    /**
     * Gets the rank value for this HierarchicalRequirement.
     * 
     * @return rank
     */
    public java.math.BigDecimal getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this HierarchicalRequirement.
     * 
     * @param rank
     */
    public void setRank(java.math.BigDecimal rank) {
        this.rank = rank;
    }


    /**
     * Gets the recycled value for this HierarchicalRequirement.
     * 
     * @return recycled
     */
    public java.lang.Boolean getRecycled() {
        return recycled;
    }


    /**
     * Sets the recycled value for this HierarchicalRequirement.
     * 
     * @param recycled
     */
    public void setRecycled(java.lang.Boolean recycled) {
        this.recycled = recycled;
    }


    /**
     * Gets the release value for this HierarchicalRequirement.
     * 
     * @return release
     */
    public com.rallydev.webservice.v1_31.domain.Release getRelease() {
        return release;
    }


    /**
     * Sets the release value for this HierarchicalRequirement.
     * 
     * @param release
     */
    public void setRelease(com.rallydev.webservice.v1_31.domain.Release release) {
        this.release = release;
    }


    /**
     * Gets the scheduleState value for this HierarchicalRequirement.
     * 
     * @return scheduleState
     */
    public java.lang.String getScheduleState() {
        return scheduleState;
    }


    /**
     * Sets the scheduleState value for this HierarchicalRequirement.
     * 
     * @param scheduleState
     */
    public void setScheduleState(java.lang.String scheduleState) {
        this.scheduleState = scheduleState;
    }


    /**
     * Gets the successors value for this HierarchicalRequirement.
     * 
     * @return successors
     */
    public com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] getSuccessors() {
        return successors;
    }


    /**
     * Sets the successors value for this HierarchicalRequirement.
     * 
     * @param successors
     */
    public void setSuccessors(com.rallydev.webservice.v1_31.domain.HierarchicalRequirement[] successors) {
        this.successors = successors;
    }


    /**
     * Gets the taskActualTotal value for this HierarchicalRequirement.
     * 
     * @return taskActualTotal
     */
    public java.lang.Double getTaskActualTotal() {
        return taskActualTotal;
    }


    /**
     * Sets the taskActualTotal value for this HierarchicalRequirement.
     * 
     * @param taskActualTotal
     */
    public void setTaskActualTotal(java.lang.Double taskActualTotal) {
        this.taskActualTotal = taskActualTotal;
    }


    /**
     * Gets the taskEstimateTotal value for this HierarchicalRequirement.
     * 
     * @return taskEstimateTotal
     */
    public java.lang.Double getTaskEstimateTotal() {
        return taskEstimateTotal;
    }


    /**
     * Sets the taskEstimateTotal value for this HierarchicalRequirement.
     * 
     * @param taskEstimateTotal
     */
    public void setTaskEstimateTotal(java.lang.Double taskEstimateTotal) {
        this.taskEstimateTotal = taskEstimateTotal;
    }


    /**
     * Gets the taskRemainingTotal value for this HierarchicalRequirement.
     * 
     * @return taskRemainingTotal
     */
    public java.lang.Double getTaskRemainingTotal() {
        return taskRemainingTotal;
    }


    /**
     * Sets the taskRemainingTotal value for this HierarchicalRequirement.
     * 
     * @param taskRemainingTotal
     */
    public void setTaskRemainingTotal(java.lang.Double taskRemainingTotal) {
        this.taskRemainingTotal = taskRemainingTotal;
    }


    /**
     * Gets the taskStatus value for this HierarchicalRequirement.
     * 
     * @return taskStatus
     */
    public java.lang.String getTaskStatus() {
        return taskStatus;
    }


    /**
     * Sets the taskStatus value for this HierarchicalRequirement.
     * 
     * @param taskStatus
     */
    public void setTaskStatus(java.lang.String taskStatus) {
        this.taskStatus = taskStatus;
    }


    /**
     * Gets the tasks value for this HierarchicalRequirement.
     * 
     * @return tasks
     */
    public com.rallydev.webservice.v1_31.domain.Task[] getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this HierarchicalRequirement.
     * 
     * @param tasks
     */
    public void setTasks(com.rallydev.webservice.v1_31.domain.Task[] tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the testCaseStatus value for this HierarchicalRequirement.
     * 
     * @return testCaseStatus
     */
    public java.lang.String getTestCaseStatus() {
        return testCaseStatus;
    }


    /**
     * Sets the testCaseStatus value for this HierarchicalRequirement.
     * 
     * @param testCaseStatus
     */
    public void setTestCaseStatus(java.lang.String testCaseStatus) {
        this.testCaseStatus = testCaseStatus;
    }


    /**
     * Gets the testCases value for this HierarchicalRequirement.
     * 
     * @return testCases
     */
    public com.rallydev.webservice.v1_31.domain.TestCase[] getTestCases() {
        return testCases;
    }


    /**
     * Sets the testCases value for this HierarchicalRequirement.
     * 
     * @param testCases
     */
    public void setTestCases(com.rallydev.webservice.v1_31.domain.TestCase[] testCases) {
        this.testCases = testCases;
    }


    /**
     * Gets the blockedDescription value for this HierarchicalRequirement.
     * 
     * @return blockedDescription
     */
    public java.lang.String getBlockedDescription() {
        return blockedDescription;
    }


    /**
     * Sets the blockedDescription value for this HierarchicalRequirement.
     * 
     * @param blockedDescription
     */
    public void setBlockedDescription(java.lang.String blockedDescription) {
        this.blockedDescription = blockedDescription;
    }


    /**
     * Gets the client value for this HierarchicalRequirement.
     * 
     * @return client
     */
    public java.lang.String getClient() {
        return client;
    }


    /**
     * Sets the client value for this HierarchicalRequirement.
     * 
     * @param client
     */
    public void setClient(java.lang.String client) {
        this.client = client;
    }


    /**
     * Gets the completedIn value for this HierarchicalRequirement.
     * 
     * @return completedIn
     */
    public java.lang.String getCompletedIn() {
        return completedIn;
    }


    /**
     * Sets the completedIn value for this HierarchicalRequirement.
     * 
     * @param completedIn
     */
    public void setCompletedIn(java.lang.String completedIn) {
        this.completedIn = completedIn;
    }


    /**
     * Gets the releaseNotes value for this HierarchicalRequirement.
     * 
     * @return releaseNotes
     */
    public java.lang.String getReleaseNotes() {
        return releaseNotes;
    }


    /**
     * Sets the releaseNotes value for this HierarchicalRequirement.
     * 
     * @param releaseNotes
     */
    public void setReleaseNotes(java.lang.String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HierarchicalRequirement)) return false;
        HierarchicalRequirement other = (HierarchicalRequirement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acceptedDate==null && other.getAcceptedDate()==null) || 
             (this.acceptedDate!=null &&
              this.acceptedDate.equals(other.getAcceptedDate()))) &&
            ((this.blocked==null && other.getBlocked()==null) || 
             (this.blocked!=null &&
              this.blocked.equals(other.getBlocked()))) &&
            ((this.blocker==null && other.getBlocker()==null) || 
             (this.blocker!=null &&
              this.blocker.equals(other.getBlocker()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.defectStatus==null && other.getDefectStatus()==null) || 
             (this.defectStatus!=null &&
              this.defectStatus.equals(other.getDefectStatus()))) &&
            ((this.defects==null && other.getDefects()==null) || 
             (this.defects!=null &&
              java.util.Arrays.equals(this.defects, other.getDefects()))) &&
            ((this.inProgressDate==null && other.getInProgressDate()==null) || 
             (this.inProgressDate!=null &&
              this.inProgressDate.equals(other.getInProgressDate()))) &&
            ((this.iteration==null && other.getIteration()==null) || 
             (this.iteration!=null &&
              this.iteration.equals(other.getIteration()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.planEstimate==null && other.getPlanEstimate()==null) || 
             (this.planEstimate!=null &&
              this.planEstimate.equals(other.getPlanEstimate()))) &&
            ((this.predecessors==null && other.getPredecessors()==null) || 
             (this.predecessors!=null &&
              java.util.Arrays.equals(this.predecessors, other.getPredecessors()))) &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank()))) &&
            ((this.recycled==null && other.getRecycled()==null) || 
             (this.recycled!=null &&
              this.recycled.equals(other.getRecycled()))) &&
            ((this.release==null && other.getRelease()==null) || 
             (this.release!=null &&
              this.release.equals(other.getRelease()))) &&
            ((this.scheduleState==null && other.getScheduleState()==null) || 
             (this.scheduleState!=null &&
              this.scheduleState.equals(other.getScheduleState()))) &&
            ((this.successors==null && other.getSuccessors()==null) || 
             (this.successors!=null &&
              java.util.Arrays.equals(this.successors, other.getSuccessors()))) &&
            ((this.taskActualTotal==null && other.getTaskActualTotal()==null) || 
             (this.taskActualTotal!=null &&
              this.taskActualTotal.equals(other.getTaskActualTotal()))) &&
            ((this.taskEstimateTotal==null && other.getTaskEstimateTotal()==null) || 
             (this.taskEstimateTotal!=null &&
              this.taskEstimateTotal.equals(other.getTaskEstimateTotal()))) &&
            ((this.taskRemainingTotal==null && other.getTaskRemainingTotal()==null) || 
             (this.taskRemainingTotal!=null &&
              this.taskRemainingTotal.equals(other.getTaskRemainingTotal()))) &&
            ((this.taskStatus==null && other.getTaskStatus()==null) || 
             (this.taskStatus!=null &&
              this.taskStatus.equals(other.getTaskStatus()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              java.util.Arrays.equals(this.tasks, other.getTasks()))) &&
            ((this.testCaseStatus==null && other.getTestCaseStatus()==null) || 
             (this.testCaseStatus!=null &&
              this.testCaseStatus.equals(other.getTestCaseStatus()))) &&
            ((this.testCases==null && other.getTestCases()==null) || 
             (this.testCases!=null &&
              java.util.Arrays.equals(this.testCases, other.getTestCases()))) &&
            ((this.blockedDescription==null && other.getBlockedDescription()==null) || 
             (this.blockedDescription!=null &&
              this.blockedDescription.equals(other.getBlockedDescription()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.completedIn==null && other.getCompletedIn()==null) || 
             (this.completedIn!=null &&
              this.completedIn.equals(other.getCompletedIn()))) &&
            ((this.releaseNotes==null && other.getReleaseNotes()==null) || 
             (this.releaseNotes!=null &&
              this.releaseNotes.equals(other.getReleaseNotes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAcceptedDate() != null) {
            _hashCode += getAcceptedDate().hashCode();
        }
        if (getBlocked() != null) {
            _hashCode += getBlocked().hashCode();
        }
        if (getBlocker() != null) {
            _hashCode += getBlocker().hashCode();
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefectStatus() != null) {
            _hashCode += getDefectStatus().hashCode();
        }
        if (getDefects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInProgressDate() != null) {
            _hashCode += getInProgressDate().hashCode();
        }
        if (getIteration() != null) {
            _hashCode += getIteration().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPlanEstimate() != null) {
            _hashCode += getPlanEstimate().hashCode();
        }
        if (getPredecessors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredecessors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredecessors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRank() != null) {
            _hashCode += getRank().hashCode();
        }
        if (getRecycled() != null) {
            _hashCode += getRecycled().hashCode();
        }
        if (getRelease() != null) {
            _hashCode += getRelease().hashCode();
        }
        if (getScheduleState() != null) {
            _hashCode += getScheduleState().hashCode();
        }
        if (getSuccessors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaskActualTotal() != null) {
            _hashCode += getTaskActualTotal().hashCode();
        }
        if (getTaskEstimateTotal() != null) {
            _hashCode += getTaskEstimateTotal().hashCode();
        }
        if (getTaskRemainingTotal() != null) {
            _hashCode += getTaskRemainingTotal().hashCode();
        }
        if (getTaskStatus() != null) {
            _hashCode += getTaskStatus().hashCode();
        }
        if (getTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTasks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTestCaseStatus() != null) {
            _hashCode += getTestCaseStatus().hashCode();
        }
        if (getTestCases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTestCases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTestCases(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBlockedDescription() != null) {
            _hashCode += getBlockedDescription().hashCode();
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getCompletedIn() != null) {
            _hashCode += getCompletedIn().hashCode();
        }
        if (getReleaseNotes() != null) {
            _hashCode += getReleaseNotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HierarchicalRequirement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "HierarchicalRequirement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocker");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Blocker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Blocker"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "HierarchicalRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "HierarchicalRequirement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefectStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Defects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Defect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Defect"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inProgressDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InProgressDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Iteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Iteration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "HierarchicalRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlanEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Predecessors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "HierarchicalRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "HierarchicalRequirement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Recycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Release"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ScheduleState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Successors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "HierarchicalRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "HierarchicalRequirement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskActualTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskActualTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskEstimateTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskEstimateTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskRemainingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskRemainingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Task"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Task"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TestCaseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TestCases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "TestCase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "TestCase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BlockedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompletedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReleaseNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
