/**
 * Change.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_37.domain;

public class Change  extends com.rallydev.webservice.v1_37.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String base;

    private com.rallydev.webservice.v1_37.domain.Changeset changeset;

    private java.lang.String extension;

    private java.lang.String pathAndFilename;

    private java.lang.String uri;

    public Change() {
    }

    public Change(
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
           java.lang.String action,
           java.lang.String base,
           com.rallydev.webservice.v1_37.domain.Changeset changeset,
           java.lang.String extension,
           java.lang.String pathAndFilename,
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
        this.action = action;
        this.base = base;
        this.changeset = changeset;
        this.extension = extension;
        this.pathAndFilename = pathAndFilename;
        this.uri = uri;
    }


    /**
     * Gets the action value for this Change.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this Change.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the base value for this Change.
     * 
     * @return base
     */
    public java.lang.String getBase() {
        return base;
    }


    /**
     * Sets the base value for this Change.
     * 
     * @param base
     */
    public void setBase(java.lang.String base) {
        this.base = base;
    }


    /**
     * Gets the changeset value for this Change.
     * 
     * @return changeset
     */
    public com.rallydev.webservice.v1_37.domain.Changeset getChangeset() {
        return changeset;
    }


    /**
     * Sets the changeset value for this Change.
     * 
     * @param changeset
     */
    public void setChangeset(com.rallydev.webservice.v1_37.domain.Changeset changeset) {
        this.changeset = changeset;
    }


    /**
     * Gets the extension value for this Change.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this Change.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the pathAndFilename value for this Change.
     * 
     * @return pathAndFilename
     */
    public java.lang.String getPathAndFilename() {
        return pathAndFilename;
    }


    /**
     * Sets the pathAndFilename value for this Change.
     * 
     * @param pathAndFilename
     */
    public void setPathAndFilename(java.lang.String pathAndFilename) {
        this.pathAndFilename = pathAndFilename;
    }


    /**
     * Gets the uri value for this Change.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Change.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Change)) return false;
        Change other = (Change) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.base==null && other.getBase()==null) || 
             (this.base!=null &&
              this.base.equals(other.getBase()))) &&
            ((this.changeset==null && other.getChangeset()==null) || 
             (this.changeset!=null &&
              this.changeset.equals(other.getChangeset()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.pathAndFilename==null && other.getPathAndFilename()==null) || 
             (this.pathAndFilename!=null &&
              this.pathAndFilename.equals(other.getPathAndFilename()))) &&
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getBase() != null) {
            _hashCode += getBase().hashCode();
        }
        if (getChangeset() != null) {
            _hashCode += getChangeset().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getPathAndFilename() != null) {
            _hashCode += getPathAndFilename().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Change.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Change"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Base"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Changeset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Changeset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathAndFilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PathAndFilename"));
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
