/**
 * Build.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_31.domain;

public class Build  extends com.rallydev.webservice.v1_31.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private com.rallydev.webservice.v1_31.domain.BuildDefinition buildDefinition;

    private com.rallydev.webservice.v1_31.domain.Changeset[] changesets;

    private java.lang.Double duration;

    private java.lang.String message;

    private java.lang.String number;

    private java.util.Calendar start;

    private java.lang.String status;

    private java.lang.String uri;

    public Build() {
    }

    public Build(
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
           com.rallydev.webservice.v1_31.domain.BuildDefinition buildDefinition,
           com.rallydev.webservice.v1_31.domain.Changeset[] changesets,
           java.lang.Double duration,
           java.lang.String message,
           java.lang.String number,
           java.util.Calendar start,
           java.lang.String status,
           java.lang.String uri) {
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
            workspace);
        this.buildDefinition = buildDefinition;
        this.changesets = changesets;
        this.duration = duration;
        this.message = message;
        this.number = number;
        this.start = start;
        this.status = status;
        this.uri = uri;
    }


    /**
     * Gets the buildDefinition value for this Build.
     * 
     * @return buildDefinition
     */
    public com.rallydev.webservice.v1_31.domain.BuildDefinition getBuildDefinition() {
        return buildDefinition;
    }


    /**
     * Sets the buildDefinition value for this Build.
     * 
     * @param buildDefinition
     */
    public void setBuildDefinition(com.rallydev.webservice.v1_31.domain.BuildDefinition buildDefinition) {
        this.buildDefinition = buildDefinition;
    }


    /**
     * Gets the changesets value for this Build.
     * 
     * @return changesets
     */
    public com.rallydev.webservice.v1_31.domain.Changeset[] getChangesets() {
        return changesets;
    }


    /**
     * Sets the changesets value for this Build.
     * 
     * @param changesets
     */
    public void setChangesets(com.rallydev.webservice.v1_31.domain.Changeset[] changesets) {
        this.changesets = changesets;
    }


    /**
     * Gets the duration value for this Build.
     * 
     * @return duration
     */
    public java.lang.Double getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this Build.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Double duration) {
        this.duration = duration;
    }


    /**
     * Gets the message value for this Build.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Build.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the number value for this Build.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Build.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the start value for this Build.
     * 
     * @return start
     */
    public java.util.Calendar getStart() {
        return start;
    }


    /**
     * Sets the start value for this Build.
     * 
     * @param start
     */
    public void setStart(java.util.Calendar start) {
        this.start = start;
    }


    /**
     * Gets the status value for this Build.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Build.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the uri value for this Build.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Build.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Build)) return false;
        Build other = (Build) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.buildDefinition==null && other.getBuildDefinition()==null) || 
             (this.buildDefinition!=null &&
              this.buildDefinition.equals(other.getBuildDefinition()))) &&
            ((this.changesets==null && other.getChangesets()==null) || 
             (this.changesets!=null &&
              java.util.Arrays.equals(this.changesets, other.getChangesets()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri())));
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
        if (getBuildDefinition() != null) {
            _hashCode += getBuildDefinition().hashCode();
        }
        if (getChangesets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangesets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangesets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Build.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Build"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BuildDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "BuildDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changesets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Changesets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_31/domain", "Changeset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Changeset"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Uri"));
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
