/**
 * Subscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_37.domain;

public class Subscription  extends com.rallydev.webservice.v1_37.domain.PersistableObject  implements java.io.Serializable {
    private java.util.Calendar expirationDate;

    private java.lang.Long maximumProjects;

    private java.lang.String modules;

    private java.lang.String name;

    private java.lang.Long passwordExpirationDays;

    private java.lang.Long previousPasswordCount;

    private java.lang.Boolean projectHierarchyEnabled;

    private com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory;

    private java.lang.Long sessionTimeoutSeconds;

    private java.lang.Boolean storyHierarchyEnabled;

    private java.lang.Long subscriptionID;

    private java.lang.String subscriptionType;

    private com.rallydev.webservice.v1_37.domain.Workspace[] workspaces;

    public Subscription() {
    }

    public Subscription(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           java.util.Calendar expirationDate,
           java.lang.Long maximumProjects,
           java.lang.String modules,
           java.lang.String name,
           java.lang.Long passwordExpirationDays,
           java.lang.Long previousPasswordCount,
           java.lang.Boolean projectHierarchyEnabled,
           com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory,
           java.lang.Long sessionTimeoutSeconds,
           java.lang.Boolean storyHierarchyEnabled,
           java.lang.Long subscriptionID,
           java.lang.String subscriptionType,
           com.rallydev.webservice.v1_37.domain.Workspace[] workspaces) {
        super(
            ref,
            objectVersion,
            type,
            refObjectName,
            rallyAPIMajor,
            rallyAPIMinor,
            creationDate,
            objectID);
        this.expirationDate = expirationDate;
        this.maximumProjects = maximumProjects;
        this.modules = modules;
        this.name = name;
        this.passwordExpirationDays = passwordExpirationDays;
        this.previousPasswordCount = previousPasswordCount;
        this.projectHierarchyEnabled = projectHierarchyEnabled;
        this.revisionHistory = revisionHistory;
        this.sessionTimeoutSeconds = sessionTimeoutSeconds;
        this.storyHierarchyEnabled = storyHierarchyEnabled;
        this.subscriptionID = subscriptionID;
        this.subscriptionType = subscriptionType;
        this.workspaces = workspaces;
    }


    /**
     * Gets the expirationDate value for this Subscription.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this Subscription.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the maximumProjects value for this Subscription.
     * 
     * @return maximumProjects
     */
    public java.lang.Long getMaximumProjects() {
        return maximumProjects;
    }


    /**
     * Sets the maximumProjects value for this Subscription.
     * 
     * @param maximumProjects
     */
    public void setMaximumProjects(java.lang.Long maximumProjects) {
        this.maximumProjects = maximumProjects;
    }


    /**
     * Gets the modules value for this Subscription.
     * 
     * @return modules
     */
    public java.lang.String getModules() {
        return modules;
    }


    /**
     * Sets the modules value for this Subscription.
     * 
     * @param modules
     */
    public void setModules(java.lang.String modules) {
        this.modules = modules;
    }


    /**
     * Gets the name value for this Subscription.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Subscription.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the passwordExpirationDays value for this Subscription.
     * 
     * @return passwordExpirationDays
     */
    public java.lang.Long getPasswordExpirationDays() {
        return passwordExpirationDays;
    }


    /**
     * Sets the passwordExpirationDays value for this Subscription.
     * 
     * @param passwordExpirationDays
     */
    public void setPasswordExpirationDays(java.lang.Long passwordExpirationDays) {
        this.passwordExpirationDays = passwordExpirationDays;
    }


    /**
     * Gets the previousPasswordCount value for this Subscription.
     * 
     * @return previousPasswordCount
     */
    public java.lang.Long getPreviousPasswordCount() {
        return previousPasswordCount;
    }


    /**
     * Sets the previousPasswordCount value for this Subscription.
     * 
     * @param previousPasswordCount
     */
    public void setPreviousPasswordCount(java.lang.Long previousPasswordCount) {
        this.previousPasswordCount = previousPasswordCount;
    }


    /**
     * Gets the projectHierarchyEnabled value for this Subscription.
     * 
     * @return projectHierarchyEnabled
     */
    public java.lang.Boolean getProjectHierarchyEnabled() {
        return projectHierarchyEnabled;
    }


    /**
     * Sets the projectHierarchyEnabled value for this Subscription.
     * 
     * @param projectHierarchyEnabled
     */
    public void setProjectHierarchyEnabled(java.lang.Boolean projectHierarchyEnabled) {
        this.projectHierarchyEnabled = projectHierarchyEnabled;
    }


    /**
     * Gets the revisionHistory value for this Subscription.
     * 
     * @return revisionHistory
     */
    public com.rallydev.webservice.v1_37.domain.RevisionHistory getRevisionHistory() {
        return revisionHistory;
    }


    /**
     * Sets the revisionHistory value for this Subscription.
     * 
     * @param revisionHistory
     */
    public void setRevisionHistory(com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory) {
        this.revisionHistory = revisionHistory;
    }


    /**
     * Gets the sessionTimeoutSeconds value for this Subscription.
     * 
     * @return sessionTimeoutSeconds
     */
    public java.lang.Long getSessionTimeoutSeconds() {
        return sessionTimeoutSeconds;
    }


    /**
     * Sets the sessionTimeoutSeconds value for this Subscription.
     * 
     * @param sessionTimeoutSeconds
     */
    public void setSessionTimeoutSeconds(java.lang.Long sessionTimeoutSeconds) {
        this.sessionTimeoutSeconds = sessionTimeoutSeconds;
    }


    /**
     * Gets the storyHierarchyEnabled value for this Subscription.
     * 
     * @return storyHierarchyEnabled
     */
    public java.lang.Boolean getStoryHierarchyEnabled() {
        return storyHierarchyEnabled;
    }


    /**
     * Sets the storyHierarchyEnabled value for this Subscription.
     * 
     * @param storyHierarchyEnabled
     */
    public void setStoryHierarchyEnabled(java.lang.Boolean storyHierarchyEnabled) {
        this.storyHierarchyEnabled = storyHierarchyEnabled;
    }


    /**
     * Gets the subscriptionID value for this Subscription.
     * 
     * @return subscriptionID
     */
    public java.lang.Long getSubscriptionID() {
        return subscriptionID;
    }


    /**
     * Sets the subscriptionID value for this Subscription.
     * 
     * @param subscriptionID
     */
    public void setSubscriptionID(java.lang.Long subscriptionID) {
        this.subscriptionID = subscriptionID;
    }


    /**
     * Gets the subscriptionType value for this Subscription.
     * 
     * @return subscriptionType
     */
    public java.lang.String getSubscriptionType() {
        return subscriptionType;
    }


    /**
     * Sets the subscriptionType value for this Subscription.
     * 
     * @param subscriptionType
     */
    public void setSubscriptionType(java.lang.String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }


    /**
     * Gets the workspaces value for this Subscription.
     * 
     * @return workspaces
     */
    public com.rallydev.webservice.v1_37.domain.Workspace[] getWorkspaces() {
        return workspaces;
    }


    /**
     * Sets the workspaces value for this Subscription.
     * 
     * @param workspaces
     */
    public void setWorkspaces(com.rallydev.webservice.v1_37.domain.Workspace[] workspaces) {
        this.workspaces = workspaces;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscription)) return false;
        Subscription other = (Subscription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.maximumProjects==null && other.getMaximumProjects()==null) || 
             (this.maximumProjects!=null &&
              this.maximumProjects.equals(other.getMaximumProjects()))) &&
            ((this.modules==null && other.getModules()==null) || 
             (this.modules!=null &&
              this.modules.equals(other.getModules()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.passwordExpirationDays==null && other.getPasswordExpirationDays()==null) || 
             (this.passwordExpirationDays!=null &&
              this.passwordExpirationDays.equals(other.getPasswordExpirationDays()))) &&
            ((this.previousPasswordCount==null && other.getPreviousPasswordCount()==null) || 
             (this.previousPasswordCount!=null &&
              this.previousPasswordCount.equals(other.getPreviousPasswordCount()))) &&
            ((this.projectHierarchyEnabled==null && other.getProjectHierarchyEnabled()==null) || 
             (this.projectHierarchyEnabled!=null &&
              this.projectHierarchyEnabled.equals(other.getProjectHierarchyEnabled()))) &&
            ((this.revisionHistory==null && other.getRevisionHistory()==null) || 
             (this.revisionHistory!=null &&
              this.revisionHistory.equals(other.getRevisionHistory()))) &&
            ((this.sessionTimeoutSeconds==null && other.getSessionTimeoutSeconds()==null) || 
             (this.sessionTimeoutSeconds!=null &&
              this.sessionTimeoutSeconds.equals(other.getSessionTimeoutSeconds()))) &&
            ((this.storyHierarchyEnabled==null && other.getStoryHierarchyEnabled()==null) || 
             (this.storyHierarchyEnabled!=null &&
              this.storyHierarchyEnabled.equals(other.getStoryHierarchyEnabled()))) &&
            ((this.subscriptionID==null && other.getSubscriptionID()==null) || 
             (this.subscriptionID!=null &&
              this.subscriptionID.equals(other.getSubscriptionID()))) &&
            ((this.subscriptionType==null && other.getSubscriptionType()==null) || 
             (this.subscriptionType!=null &&
              this.subscriptionType.equals(other.getSubscriptionType()))) &&
            ((this.workspaces==null && other.getWorkspaces()==null) || 
             (this.workspaces!=null &&
              java.util.Arrays.equals(this.workspaces, other.getWorkspaces())));
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
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getMaximumProjects() != null) {
            _hashCode += getMaximumProjects().hashCode();
        }
        if (getModules() != null) {
            _hashCode += getModules().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPasswordExpirationDays() != null) {
            _hashCode += getPasswordExpirationDays().hashCode();
        }
        if (getPreviousPasswordCount() != null) {
            _hashCode += getPreviousPasswordCount().hashCode();
        }
        if (getProjectHierarchyEnabled() != null) {
            _hashCode += getProjectHierarchyEnabled().hashCode();
        }
        if (getRevisionHistory() != null) {
            _hashCode += getRevisionHistory().hashCode();
        }
        if (getSessionTimeoutSeconds() != null) {
            _hashCode += getSessionTimeoutSeconds().hashCode();
        }
        if (getStoryHierarchyEnabled() != null) {
            _hashCode += getStoryHierarchyEnabled().hashCode();
        }
        if (getSubscriptionID() != null) {
            _hashCode += getSubscriptionID().hashCode();
        }
        if (getSubscriptionType() != null) {
            _hashCode += getSubscriptionType().hashCode();
        }
        if (getWorkspaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkspaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkspaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Subscription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumProjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaximumProjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Modules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordExpirationDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PasswordExpirationDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousPasswordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreviousPasswordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectHierarchyEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProjectHierarchyEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RevisionHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "RevisionHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionTimeoutSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionTimeoutSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storyHierarchyEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StoryHierarchyEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workspaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Workspaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Workspace"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Workspace"));
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
