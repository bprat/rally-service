/**
 * Changeset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_37.domain;

public class Changeset  extends com.rallydev.webservice.v1_37.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private com.rallydev.webservice.v1_37.domain.Artifact[] artifacts;

    private com.rallydev.webservice.v1_37.domain.User author;

    private com.rallydev.webservice.v1_37.domain.Build[] builds;

    private com.rallydev.webservice.v1_37.domain.Change[] changes;

    private java.util.Calendar commitTimestamp;

    private java.lang.String message;

    private java.lang.String name;

    private java.lang.String revision;

    private com.rallydev.webservice.v1_37.domain.SCMRepository SCMRepository;

    private java.lang.String uri;

    public Changeset() {
    }

    public Changeset(
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
           com.rallydev.webservice.v1_37.domain.Artifact[] artifacts,
           com.rallydev.webservice.v1_37.domain.User author,
           com.rallydev.webservice.v1_37.domain.Build[] builds,
           com.rallydev.webservice.v1_37.domain.Change[] changes,
           java.util.Calendar commitTimestamp,
           java.lang.String message,
           java.lang.String name,
           java.lang.String revision,
           com.rallydev.webservice.v1_37.domain.SCMRepository SCMRepository,
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
        this.artifacts = artifacts;
        this.author = author;
        this.builds = builds;
        this.changes = changes;
        this.commitTimestamp = commitTimestamp;
        this.message = message;
        this.name = name;
        this.revision = revision;
        this.SCMRepository = SCMRepository;
        this.uri = uri;
    }


    /**
     * Gets the artifacts value for this Changeset.
     * 
     * @return artifacts
     */
    public com.rallydev.webservice.v1_37.domain.Artifact[] getArtifacts() {
        return artifacts;
    }


    /**
     * Sets the artifacts value for this Changeset.
     * 
     * @param artifacts
     */
    public void setArtifacts(com.rallydev.webservice.v1_37.domain.Artifact[] artifacts) {
        this.artifacts = artifacts;
    }


    /**
     * Gets the author value for this Changeset.
     * 
     * @return author
     */
    public com.rallydev.webservice.v1_37.domain.User getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Changeset.
     * 
     * @param author
     */
    public void setAuthor(com.rallydev.webservice.v1_37.domain.User author) {
        this.author = author;
    }


    /**
     * Gets the builds value for this Changeset.
     * 
     * @return builds
     */
    public com.rallydev.webservice.v1_37.domain.Build[] getBuilds() {
        return builds;
    }


    /**
     * Sets the builds value for this Changeset.
     * 
     * @param builds
     */
    public void setBuilds(com.rallydev.webservice.v1_37.domain.Build[] builds) {
        this.builds = builds;
    }


    /**
     * Gets the changes value for this Changeset.
     * 
     * @return changes
     */
    public com.rallydev.webservice.v1_37.domain.Change[] getChanges() {
        return changes;
    }


    /**
     * Sets the changes value for this Changeset.
     * 
     * @param changes
     */
    public void setChanges(com.rallydev.webservice.v1_37.domain.Change[] changes) {
        this.changes = changes;
    }


    /**
     * Gets the commitTimestamp value for this Changeset.
     * 
     * @return commitTimestamp
     */
    public java.util.Calendar getCommitTimestamp() {
        return commitTimestamp;
    }


    /**
     * Sets the commitTimestamp value for this Changeset.
     * 
     * @param commitTimestamp
     */
    public void setCommitTimestamp(java.util.Calendar commitTimestamp) {
        this.commitTimestamp = commitTimestamp;
    }


    /**
     * Gets the message value for this Changeset.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Changeset.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the name value for this Changeset.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Changeset.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the revision value for this Changeset.
     * 
     * @return revision
     */
    public java.lang.String getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this Changeset.
     * 
     * @param revision
     */
    public void setRevision(java.lang.String revision) {
        this.revision = revision;
    }


    /**
     * Gets the SCMRepository value for this Changeset.
     * 
     * @return SCMRepository
     */
    public com.rallydev.webservice.v1_37.domain.SCMRepository getSCMRepository() {
        return SCMRepository;
    }


    /**
     * Sets the SCMRepository value for this Changeset.
     * 
     * @param SCMRepository
     */
    public void setSCMRepository(com.rallydev.webservice.v1_37.domain.SCMRepository SCMRepository) {
        this.SCMRepository = SCMRepository;
    }


    /**
     * Gets the uri value for this Changeset.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Changeset.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Changeset)) return false;
        Changeset other = (Changeset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.artifacts==null && other.getArtifacts()==null) || 
             (this.artifacts!=null &&
              java.util.Arrays.equals(this.artifacts, other.getArtifacts()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.builds==null && other.getBuilds()==null) || 
             (this.builds!=null &&
              java.util.Arrays.equals(this.builds, other.getBuilds()))) &&
            ((this.changes==null && other.getChanges()==null) || 
             (this.changes!=null &&
              java.util.Arrays.equals(this.changes, other.getChanges()))) &&
            ((this.commitTimestamp==null && other.getCommitTimestamp()==null) || 
             (this.commitTimestamp!=null &&
              this.commitTimestamp.equals(other.getCommitTimestamp()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
            ((this.SCMRepository==null && other.getSCMRepository()==null) || 
             (this.SCMRepository!=null &&
              this.SCMRepository.equals(other.getSCMRepository()))) &&
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
        if (getArtifacts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArtifacts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArtifacts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getBuilds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuilds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuilds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommitTimestamp() != null) {
            _hashCode += getCommitTimestamp().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        if (getSCMRepository() != null) {
            _hashCode += getSCMRepository().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Changeset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Changeset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artifacts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Artifacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Artifact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Artifact"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Builds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Build"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Build"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Changes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Change"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Change"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommitTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCMRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCMRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "SCMRepository"));
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
