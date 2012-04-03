/**
 * Preference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_31.domain;

public class Preference  extends com.rallydev.webservice.v1_31.domain.PersistableObject  implements java.io.Serializable {
    private java.lang.String name;

    private com.rallydev.webservice.v1_31.domain.Project project;

    private com.rallydev.webservice.v1_31.domain.User user;

    private java.lang.String value;

    private com.rallydev.webservice.v1_31.domain.Workspace workspace;

    public Preference() {
    }

    public Preference(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           java.lang.String name,
           com.rallydev.webservice.v1_31.domain.Project project,
           com.rallydev.webservice.v1_31.domain.User user,
           java.lang.String value,
           com.rallydev.webservice.v1_31.domain.Workspace workspace) {
        super(
            ref,
            objectVersion,
            type,
            refObjectName,
            rallyAPIMajor,
            rallyAPIMinor,
            creationDate,
            objectID);
        this.name = name;
        this.project = project;
        this.user = user;
        this.value = value;
        this.workspace = workspace;
    }


    /**
     * Gets the name value for this Preference.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Preference.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the project value for this Preference.
     * 
     * @return project
     */
    public com.rallydev.webservice.v1_31.domain.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this Preference.
     * 
     * @param project
     */
    public void setProject(com.rallydev.webservice.v1_31.domain.Project project) {
        this.project = project;
    }


    /**
     * Gets the user value for this Preference.
     * 
     * @return user
     */
    public com.rallydev.webservice.v1_31.domain.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Preference.
     * 
     * @param user
     */
    public void setUser(com.rallydev.webservice.v1_31.domain.User user) {
        this.user = user;
    }


    /**
     * Gets the value value for this Preference.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Preference.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the workspace value for this Preference.
     * 
     * @return workspace
     */
    public com.rallydev.webservice.v1_31.domain.Workspace getWorkspace() {
        return workspace;
    }


    /**
     * Sets the workspace value for this Preference.
     * 
     * @param workspace
     */
    public void setWorkspace(com.rallydev.webservice.v1_31.domain.Workspace workspace) {
        this.workspace = workspace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Preference)) return false;
        Preference other = (Preference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.workspace==null && other.getWorkspace()==null) || 
             (this.workspace!=null &&
              this.workspace.equals(other.getWorkspace())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getWorkspace() != null) {
            _hashCode += getWorkspace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Preference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Preference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workspace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Workspace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Workspace"));
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
