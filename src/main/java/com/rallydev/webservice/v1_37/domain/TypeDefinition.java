/**
 * TypeDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_37.domain;

public class TypeDefinition  extends com.rallydev.webservice.v1_37.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private java.lang.Boolean _abstract;

    private com.rallydev.webservice.v1_37.domain.AttributeDefinition[] attributes;

    private java.lang.Boolean creatable;

    private java.lang.Boolean deletable;

    private java.lang.String displayName;

    private java.lang.String elementName;

    private java.lang.String IDPrefix;

    private java.lang.String name;

    private java.lang.String note;

    private java.lang.Long ordinal;

    private com.rallydev.webservice.v1_37.domain.TypeDefinition parent;

    private java.lang.Boolean queryable;

    private java.lang.Boolean readOnly;

    private java.lang.Boolean restorable;

    private com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory;

    private java.lang.String typePath;

    public TypeDefinition() {
    }

    public TypeDefinition(
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
           java.lang.Boolean _abstract,
           com.rallydev.webservice.v1_37.domain.AttributeDefinition[] attributes,
           java.lang.Boolean creatable,
           java.lang.Boolean deletable,
           java.lang.String displayName,
           java.lang.String elementName,
           java.lang.String IDPrefix,
           java.lang.String name,
           java.lang.String note,
           java.lang.Long ordinal,
           com.rallydev.webservice.v1_37.domain.TypeDefinition parent,
           java.lang.Boolean queryable,
           java.lang.Boolean readOnly,
           java.lang.Boolean restorable,
           com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory,
           java.lang.String typePath) {
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
        this._abstract = _abstract;
        this.attributes = attributes;
        this.creatable = creatable;
        this.deletable = deletable;
        this.displayName = displayName;
        this.elementName = elementName;
        this.IDPrefix = IDPrefix;
        this.name = name;
        this.note = note;
        this.ordinal = ordinal;
        this.parent = parent;
        this.queryable = queryable;
        this.readOnly = readOnly;
        this.restorable = restorable;
        this.revisionHistory = revisionHistory;
        this.typePath = typePath;
    }


    /**
     * Gets the _abstract value for this TypeDefinition.
     * 
     * @return _abstract
     */
    public java.lang.Boolean get_abstract() {
        return _abstract;
    }


    /**
     * Sets the _abstract value for this TypeDefinition.
     * 
     * @param _abstract
     */
    public void set_abstract(java.lang.Boolean _abstract) {
        this._abstract = _abstract;
    }


    /**
     * Gets the attributes value for this TypeDefinition.
     * 
     * @return attributes
     */
    public com.rallydev.webservice.v1_37.domain.AttributeDefinition[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TypeDefinition.
     * 
     * @param attributes
     */
    public void setAttributes(com.rallydev.webservice.v1_37.domain.AttributeDefinition[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the creatable value for this TypeDefinition.
     * 
     * @return creatable
     */
    public java.lang.Boolean getCreatable() {
        return creatable;
    }


    /**
     * Sets the creatable value for this TypeDefinition.
     * 
     * @param creatable
     */
    public void setCreatable(java.lang.Boolean creatable) {
        this.creatable = creatable;
    }


    /**
     * Gets the deletable value for this TypeDefinition.
     * 
     * @return deletable
     */
    public java.lang.Boolean getDeletable() {
        return deletable;
    }


    /**
     * Sets the deletable value for this TypeDefinition.
     * 
     * @param deletable
     */
    public void setDeletable(java.lang.Boolean deletable) {
        this.deletable = deletable;
    }


    /**
     * Gets the displayName value for this TypeDefinition.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this TypeDefinition.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the elementName value for this TypeDefinition.
     * 
     * @return elementName
     */
    public java.lang.String getElementName() {
        return elementName;
    }


    /**
     * Sets the elementName value for this TypeDefinition.
     * 
     * @param elementName
     */
    public void setElementName(java.lang.String elementName) {
        this.elementName = elementName;
    }


    /**
     * Gets the IDPrefix value for this TypeDefinition.
     * 
     * @return IDPrefix
     */
    public java.lang.String getIDPrefix() {
        return IDPrefix;
    }


    /**
     * Sets the IDPrefix value for this TypeDefinition.
     * 
     * @param IDPrefix
     */
    public void setIDPrefix(java.lang.String IDPrefix) {
        this.IDPrefix = IDPrefix;
    }


    /**
     * Gets the name value for this TypeDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TypeDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the note value for this TypeDefinition.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this TypeDefinition.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the ordinal value for this TypeDefinition.
     * 
     * @return ordinal
     */
    public java.lang.Long getOrdinal() {
        return ordinal;
    }


    /**
     * Sets the ordinal value for this TypeDefinition.
     * 
     * @param ordinal
     */
    public void setOrdinal(java.lang.Long ordinal) {
        this.ordinal = ordinal;
    }


    /**
     * Gets the parent value for this TypeDefinition.
     * 
     * @return parent
     */
    public com.rallydev.webservice.v1_37.domain.TypeDefinition getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this TypeDefinition.
     * 
     * @param parent
     */
    public void setParent(com.rallydev.webservice.v1_37.domain.TypeDefinition parent) {
        this.parent = parent;
    }


    /**
     * Gets the queryable value for this TypeDefinition.
     * 
     * @return queryable
     */
    public java.lang.Boolean getQueryable() {
        return queryable;
    }


    /**
     * Sets the queryable value for this TypeDefinition.
     * 
     * @param queryable
     */
    public void setQueryable(java.lang.Boolean queryable) {
        this.queryable = queryable;
    }


    /**
     * Gets the readOnly value for this TypeDefinition.
     * 
     * @return readOnly
     */
    public java.lang.Boolean getReadOnly() {
        return readOnly;
    }


    /**
     * Sets the readOnly value for this TypeDefinition.
     * 
     * @param readOnly
     */
    public void setReadOnly(java.lang.Boolean readOnly) {
        this.readOnly = readOnly;
    }


    /**
     * Gets the restorable value for this TypeDefinition.
     * 
     * @return restorable
     */
    public java.lang.Boolean getRestorable() {
        return restorable;
    }


    /**
     * Sets the restorable value for this TypeDefinition.
     * 
     * @param restorable
     */
    public void setRestorable(java.lang.Boolean restorable) {
        this.restorable = restorable;
    }


    /**
     * Gets the revisionHistory value for this TypeDefinition.
     * 
     * @return revisionHistory
     */
    public com.rallydev.webservice.v1_37.domain.RevisionHistory getRevisionHistory() {
        return revisionHistory;
    }


    /**
     * Sets the revisionHistory value for this TypeDefinition.
     * 
     * @param revisionHistory
     */
    public void setRevisionHistory(com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory) {
        this.revisionHistory = revisionHistory;
    }


    /**
     * Gets the typePath value for this TypeDefinition.
     * 
     * @return typePath
     */
    public java.lang.String getTypePath() {
        return typePath;
    }


    /**
     * Sets the typePath value for this TypeDefinition.
     * 
     * @param typePath
     */
    public void setTypePath(java.lang.String typePath) {
        this.typePath = typePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TypeDefinition)) return false;
        TypeDefinition other = (TypeDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this._abstract==null && other.get_abstract()==null) || 
             (this._abstract!=null &&
              this._abstract.equals(other.get_abstract()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.creatable==null && other.getCreatable()==null) || 
             (this.creatable!=null &&
              this.creatable.equals(other.getCreatable()))) &&
            ((this.deletable==null && other.getDeletable()==null) || 
             (this.deletable!=null &&
              this.deletable.equals(other.getDeletable()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.elementName==null && other.getElementName()==null) || 
             (this.elementName!=null &&
              this.elementName.equals(other.getElementName()))) &&
            ((this.IDPrefix==null && other.getIDPrefix()==null) || 
             (this.IDPrefix!=null &&
              this.IDPrefix.equals(other.getIDPrefix()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.ordinal==null && other.getOrdinal()==null) || 
             (this.ordinal!=null &&
              this.ordinal.equals(other.getOrdinal()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.queryable==null && other.getQueryable()==null) || 
             (this.queryable!=null &&
              this.queryable.equals(other.getQueryable()))) &&
            ((this.readOnly==null && other.getReadOnly()==null) || 
             (this.readOnly!=null &&
              this.readOnly.equals(other.getReadOnly()))) &&
            ((this.restorable==null && other.getRestorable()==null) || 
             (this.restorable!=null &&
              this.restorable.equals(other.getRestorable()))) &&
            ((this.revisionHistory==null && other.getRevisionHistory()==null) || 
             (this.revisionHistory!=null &&
              this.revisionHistory.equals(other.getRevisionHistory()))) &&
            ((this.typePath==null && other.getTypePath()==null) || 
             (this.typePath!=null &&
              this.typePath.equals(other.getTypePath())));
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
        if (get_abstract() != null) {
            _hashCode += get_abstract().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatable() != null) {
            _hashCode += getCreatable().hashCode();
        }
        if (getDeletable() != null) {
            _hashCode += getDeletable().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getElementName() != null) {
            _hashCode += getElementName().hashCode();
        }
        if (getIDPrefix() != null) {
            _hashCode += getIDPrefix().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getOrdinal() != null) {
            _hashCode += getOrdinal().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getQueryable() != null) {
            _hashCode += getQueryable().hashCode();
        }
        if (getReadOnly() != null) {
            _hashCode += getReadOnly().hashCode();
        }
        if (getRestorable() != null) {
            _hashCode += getRestorable().hashCode();
        }
        if (getRevisionHistory() != null) {
            _hashCode += getRevisionHistory().hashCode();
        }
        if (getTypePath() != null) {
            _hashCode += getTypePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TypeDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "TypeDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_abstract");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Abstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "AttributeDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AttributeDefinition"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Creatable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Deletable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ElementName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IDPrefix"));
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
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ordinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "TypeDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Queryable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReadOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restorable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Restorable"));
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
        elemField.setFieldName("typePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TypePath"));
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
