/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_37.domain;

public class Task  extends com.rallydev.webservice.v1_37.domain.Artifact  implements java.io.Serializable {
    private java.lang.Double actuals;

    private com.rallydev.webservice.v1_37.domain.Attachment[] attachments;

    private java.lang.Boolean blocked;

    private java.lang.Double estimate;

    private com.rallydev.webservice.v1_37.domain.Iteration iteration;

    private com.rallydev.webservice.v1_37.domain.Project project;

    private java.math.BigDecimal rank;

    private java.lang.Boolean recycled;

    private com.rallydev.webservice.v1_37.domain.Release release;

    private java.lang.String state;

    private java.lang.Long taskIndex;

    private java.lang.Double toDo;

    private com.rallydev.webservice.v1_37.domain.Artifact workProduct;

    private java.lang.String testCasePath;

    private java.lang.String testSetPath;

    public Task() {
    }

    public Task(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           com.rallydev.webservice.v1_37.domain.Subscription subscription,
           com.rallydev.webservice.v1_37.domain.Workspace workspace,
           com.rallydev.webservice.v1_37.domain.Changeset[] changesets,
           java.lang.String description,
           com.rallydev.webservice.v1_37.domain.ConversationPost[] discussion,
           java.lang.String formattedID,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.String notes,
           com.rallydev.webservice.v1_37.domain.User owner,
           com.rallydev.webservice.v1_37.domain.Project _project,
           com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory,
           com.rallydev.webservice.v1_37.domain.Tag[] tags,
           java.lang.Double actuals,
           com.rallydev.webservice.v1_37.domain.Attachment[] attachments,
           java.lang.Boolean blocked,
           java.lang.Double estimate,
           com.rallydev.webservice.v1_37.domain.Iteration iteration,
           com.rallydev.webservice.v1_37.domain.Project project,
           java.math.BigDecimal rank,
           java.lang.Boolean recycled,
           com.rallydev.webservice.v1_37.domain.Release release,
           java.lang.String state,
           java.lang.Long taskIndex,
           java.lang.Double toDo,
           com.rallydev.webservice.v1_37.domain.Artifact workProduct,
           java.lang.String testCasePath,
           java.lang.String testSetPath) {
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
            _project,
            revisionHistory,
            tags);
        this.actuals = actuals;
        this.attachments = attachments;
        this.blocked = blocked;
        this.estimate = estimate;
        this.iteration = iteration;
        this.project = project;
        this.rank = rank;
        this.recycled = recycled;
        this.release = release;
        this.state = state;
        this.taskIndex = taskIndex;
        this.toDo = toDo;
        this.workProduct = workProduct;
        this.testCasePath = testCasePath;
        this.testSetPath = testSetPath;
    }


    /**
     * Gets the actuals value for this Task.
     * 
     * @return actuals
     */
    public java.lang.Double getActuals() {
        return actuals;
    }


    /**
     * Sets the actuals value for this Task.
     * 
     * @param actuals
     */
    public void setActuals(java.lang.Double actuals) {
        this.actuals = actuals;
    }


    /**
     * Gets the attachments value for this Task.
     * 
     * @return attachments
     */
    public com.rallydev.webservice.v1_37.domain.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Task.
     * 
     * @param attachments
     */
    public void setAttachments(com.rallydev.webservice.v1_37.domain.Attachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the blocked value for this Task.
     * 
     * @return blocked
     */
    public java.lang.Boolean getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this Task.
     * 
     * @param blocked
     */
    public void setBlocked(java.lang.Boolean blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the estimate value for this Task.
     * 
     * @return estimate
     */
    public java.lang.Double getEstimate() {
        return estimate;
    }


    /**
     * Sets the estimate value for this Task.
     * 
     * @param estimate
     */
    public void setEstimate(java.lang.Double estimate) {
        this.estimate = estimate;
    }


    /**
     * Gets the iteration value for this Task.
     * 
     * @return iteration
     */
    public com.rallydev.webservice.v1_37.domain.Iteration getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this Task.
     * 
     * @param iteration
     */
    public void setIteration(com.rallydev.webservice.v1_37.domain.Iteration iteration) {
        this.iteration = iteration;
    }


    /**
     * Gets the project value for this Task.
     * 
     * @return project
     */
    public com.rallydev.webservice.v1_37.domain.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this Task.
     * 
     * @param project
     */
    public void setProject(com.rallydev.webservice.v1_37.domain.Project project) {
        this.project = project;
    }


    /**
     * Gets the rank value for this Task.
     * 
     * @return rank
     */
    public java.math.BigDecimal getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this Task.
     * 
     * @param rank
     */
    public void setRank(java.math.BigDecimal rank) {
        this.rank = rank;
    }


    /**
     * Gets the recycled value for this Task.
     * 
     * @return recycled
     */
    public java.lang.Boolean getRecycled() {
        return recycled;
    }


    /**
     * Sets the recycled value for this Task.
     * 
     * @param recycled
     */
    public void setRecycled(java.lang.Boolean recycled) {
        this.recycled = recycled;
    }


    /**
     * Gets the release value for this Task.
     * 
     * @return release
     */
    public com.rallydev.webservice.v1_37.domain.Release getRelease() {
        return release;
    }


    /**
     * Sets the release value for this Task.
     * 
     * @param release
     */
    public void setRelease(com.rallydev.webservice.v1_37.domain.Release release) {
        this.release = release;
    }


    /**
     * Gets the state value for this Task.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Task.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the taskIndex value for this Task.
     * 
     * @return taskIndex
     */
    public java.lang.Long getTaskIndex() {
        return taskIndex;
    }


    /**
     * Sets the taskIndex value for this Task.
     * 
     * @param taskIndex
     */
    public void setTaskIndex(java.lang.Long taskIndex) {
        this.taskIndex = taskIndex;
    }


    /**
     * Gets the toDo value for this Task.
     * 
     * @return toDo
     */
    public java.lang.Double getToDo() {
        return toDo;
    }


    /**
     * Sets the toDo value for this Task.
     * 
     * @param toDo
     */
    public void setToDo(java.lang.Double toDo) {
        this.toDo = toDo;
    }


    /**
     * Gets the workProduct value for this Task.
     * 
     * @return workProduct
     */
    public com.rallydev.webservice.v1_37.domain.Artifact getWorkProduct() {
        return workProduct;
    }


    /**
     * Sets the workProduct value for this Task.
     * 
     * @param workProduct
     */
    public void setWorkProduct(com.rallydev.webservice.v1_37.domain.Artifact workProduct) {
        this.workProduct = workProduct;
    }


    /**
     * Gets the testCasePath value for this Task.
     * 
     * @return testCasePath
     */
    public java.lang.String getTestCasePath() {
        return testCasePath;
    }


    /**
     * Sets the testCasePath value for this Task.
     * 
     * @param testCasePath
     */
    public void setTestCasePath(java.lang.String testCasePath) {
        this.testCasePath = testCasePath;
    }


    /**
     * Gets the testSetPath value for this Task.
     * 
     * @return testSetPath
     */
    public java.lang.String getTestSetPath() {
        return testSetPath;
    }


    /**
     * Sets the testSetPath value for this Task.
     * 
     * @param testSetPath
     */
    public void setTestSetPath(java.lang.String testSetPath) {
        this.testSetPath = testSetPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actuals==null && other.getActuals()==null) || 
             (this.actuals!=null &&
              this.actuals.equals(other.getActuals()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.blocked==null && other.getBlocked()==null) || 
             (this.blocked!=null &&
              this.blocked.equals(other.getBlocked()))) &&
            ((this.estimate==null && other.getEstimate()==null) || 
             (this.estimate!=null &&
              this.estimate.equals(other.getEstimate()))) &&
            ((this.iteration==null && other.getIteration()==null) || 
             (this.iteration!=null &&
              this.iteration.equals(other.getIteration()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank()))) &&
            ((this.recycled==null && other.getRecycled()==null) || 
             (this.recycled!=null &&
              this.recycled.equals(other.getRecycled()))) &&
            ((this.release==null && other.getRelease()==null) || 
             (this.release!=null &&
              this.release.equals(other.getRelease()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.taskIndex==null && other.getTaskIndex()==null) || 
             (this.taskIndex!=null &&
              this.taskIndex.equals(other.getTaskIndex()))) &&
            ((this.toDo==null && other.getToDo()==null) || 
             (this.toDo!=null &&
              this.toDo.equals(other.getToDo()))) &&
            ((this.workProduct==null && other.getWorkProduct()==null) || 
             (this.workProduct!=null &&
              this.workProduct.equals(other.getWorkProduct()))) &&
            ((this.testCasePath==null && other.getTestCasePath()==null) || 
             (this.testCasePath!=null &&
              this.testCasePath.equals(other.getTestCasePath()))) &&
            ((this.testSetPath==null && other.getTestSetPath()==null) || 
             (this.testSetPath!=null &&
              this.testSetPath.equals(other.getTestSetPath())));
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
        if (getActuals() != null) {
            _hashCode += getActuals().hashCode();
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBlocked() != null) {
            _hashCode += getBlocked().hashCode();
        }
        if (getEstimate() != null) {
            _hashCode += getEstimate().hashCode();
        }
        if (getIteration() != null) {
            _hashCode += getIteration().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTaskIndex() != null) {
            _hashCode += getTaskIndex().hashCode();
        }
        if (getToDo() != null) {
            _hashCode += getToDo().hashCode();
        }
        if (getWorkProduct() != null) {
            _hashCode += getWorkProduct().hashCode();
        }
        if (getTestCasePath() != null) {
            _hashCode += getTestCasePath().hashCode();
        }
        if (getTestSetPath() != null) {
            _hashCode += getTestSetPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Task.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Task"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actuals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Actuals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Estimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Iteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Iteration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Release"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ToDo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Artifact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCasePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TestCasePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TestSetPath"));
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
