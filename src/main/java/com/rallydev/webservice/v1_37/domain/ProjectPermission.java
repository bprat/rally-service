/**
 * ProjectPermission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_37.domain;

public class ProjectPermission  extends com.rallydev.webservice.v1_37.domain.UserPermission  implements java.io.Serializable {
    private com.rallydev.webservice.v1_37.domain.Project project;

    public ProjectPermission() {
    }

    public ProjectPermission(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           com.rallydev.webservice.v1_37.domain.Subscription subscription,
           java.lang.String customOid,
           java.lang.String name,
           java.lang.String role,
           com.rallydev.webservice.v1_37.domain.User user,
           com.rallydev.webservice.v1_37.domain.Project project) {
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
            customOid,
            name,
            role,
            user);
        this.project = project;
    }


    /**
     * Gets the project value for this ProjectPermission.
     * 
     * @return project
     */
    public com.rallydev.webservice.v1_37.domain.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this ProjectPermission.
     * 
     * @param project
     */
    public void setProject(com.rallydev.webservice.v1_37.domain.Project project) {
        this.project = project;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectPermission)) return false;
        ProjectPermission other = (ProjectPermission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject())));
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
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectPermission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "ProjectPermission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Project"));
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
