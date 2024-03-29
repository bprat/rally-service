/**
 * Blocker.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_37.domain;

public class Blocker  extends com.rallydev.webservice.v1_37.domain.DomainObject  implements java.io.Serializable {
    private com.rallydev.webservice.v1_37.domain.User blockedBy;

    private com.rallydev.webservice.v1_37.domain.Artifact workProduct;

    public Blocker() {
    }

    public Blocker(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           com.rallydev.webservice.v1_37.domain.Subscription subscription,
           com.rallydev.webservice.v1_37.domain.User blockedBy,
           com.rallydev.webservice.v1_37.domain.Artifact workProduct) {
        super(
            ref,
            objectVersion,
            type,
            refObjectName,
            rallyAPIMajor,
            rallyAPIMinor,
            creationDate,
            objectID,
            subscription);
        this.blockedBy = blockedBy;
        this.workProduct = workProduct;
    }


    /**
     * Gets the blockedBy value for this Blocker.
     * 
     * @return blockedBy
     */
    public com.rallydev.webservice.v1_37.domain.User getBlockedBy() {
        return blockedBy;
    }


    /**
     * Sets the blockedBy value for this Blocker.
     * 
     * @param blockedBy
     */
    public void setBlockedBy(com.rallydev.webservice.v1_37.domain.User blockedBy) {
        this.blockedBy = blockedBy;
    }


    /**
     * Gets the workProduct value for this Blocker.
     * 
     * @return workProduct
     */
    public com.rallydev.webservice.v1_37.domain.Artifact getWorkProduct() {
        return workProduct;
    }


    /**
     * Sets the workProduct value for this Blocker.
     * 
     * @param workProduct
     */
    public void setWorkProduct(com.rallydev.webservice.v1_37.domain.Artifact workProduct) {
        this.workProduct = workProduct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blocker)) return false;
        Blocker other = (Blocker) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.blockedBy==null && other.getBlockedBy()==null) || 
             (this.blockedBy!=null &&
              this.blockedBy.equals(other.getBlockedBy()))) &&
            ((this.workProduct==null && other.getWorkProduct()==null) || 
             (this.workProduct!=null &&
              this.workProduct.equals(other.getWorkProduct())));
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
        if (getBlockedBy() != null) {
            _hashCode += getBlockedBy().hashCode();
        }
        if (getWorkProduct() != null) {
            _hashCode += getWorkProduct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blocker.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Blocker"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BlockedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "User"));
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
