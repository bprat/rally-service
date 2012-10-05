/**
 * BuildDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_37.domain;

public class BuildDefinition  extends com.rallydev.webservice.v1_37.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private com.rallydev.webservice.v1_37.domain.Build[] builds;

    private java.lang.String description;

    private com.rallydev.webservice.v1_37.domain.Build lastBuild;

    private java.lang.String lastStatus;

    private java.lang.String name;

    private com.rallydev.webservice.v1_37.domain.Project project;

    private com.rallydev.webservice.v1_37.domain.Project[] projects;

    private java.lang.String uri;

    public BuildDefinition() {
    }

    public BuildDefinition(
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
           com.rallydev.webservice.v1_37.domain.Build[] builds,
           java.lang.String description,
           com.rallydev.webservice.v1_37.domain.Build lastBuild,
           java.lang.String lastStatus,
           java.lang.String name,
           com.rallydev.webservice.v1_37.domain.Project project,
           com.rallydev.webservice.v1_37.domain.Project[] projects,
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
        this.builds = builds;
        this.description = description;
        this.lastBuild = lastBuild;
        this.lastStatus = lastStatus;
        this.name = name;
        this.project = project;
        this.projects = projects;
        this.uri = uri;
    }


    /**
     * Gets the builds value for this BuildDefinition.
     * 
     * @return builds
     */
    public com.rallydev.webservice.v1_37.domain.Build[] getBuilds() {
        return builds;
    }


    /**
     * Sets the builds value for this BuildDefinition.
     * 
     * @param builds
     */
    public void setBuilds(com.rallydev.webservice.v1_37.domain.Build[] builds) {
        this.builds = builds;
    }


    /**
     * Gets the description value for this BuildDefinition.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BuildDefinition.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lastBuild value for this BuildDefinition.
     * 
     * @return lastBuild
     */
    public com.rallydev.webservice.v1_37.domain.Build getLastBuild() {
        return lastBuild;
    }


    /**
     * Sets the lastBuild value for this BuildDefinition.
     * 
     * @param lastBuild
     */
    public void setLastBuild(com.rallydev.webservice.v1_37.domain.Build lastBuild) {
        this.lastBuild = lastBuild;
    }


    /**
     * Gets the lastStatus value for this BuildDefinition.
     * 
     * @return lastStatus
     */
    public java.lang.String getLastStatus() {
        return lastStatus;
    }


    /**
     * Sets the lastStatus value for this BuildDefinition.
     * 
     * @param lastStatus
     */
    public void setLastStatus(java.lang.String lastStatus) {
        this.lastStatus = lastStatus;
    }


    /**
     * Gets the name value for this BuildDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BuildDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the project value for this BuildDefinition.
     * 
     * @return project
     */
    public com.rallydev.webservice.v1_37.domain.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this BuildDefinition.
     * 
     * @param project
     */
    public void setProject(com.rallydev.webservice.v1_37.domain.Project project) {
        this.project = project;
    }


    /**
     * Gets the projects value for this BuildDefinition.
     * 
     * @return projects
     */
    public com.rallydev.webservice.v1_37.domain.Project[] getProjects() {
        return projects;
    }


    /**
     * Sets the projects value for this BuildDefinition.
     * 
     * @param projects
     */
    public void setProjects(com.rallydev.webservice.v1_37.domain.Project[] projects) {
        this.projects = projects;
    }


    /**
     * Gets the uri value for this BuildDefinition.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this BuildDefinition.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BuildDefinition)) return false;
        BuildDefinition other = (BuildDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.builds==null && other.getBuilds()==null) || 
             (this.builds!=null &&
              java.util.Arrays.equals(this.builds, other.getBuilds()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lastBuild==null && other.getLastBuild()==null) || 
             (this.lastBuild!=null &&
              this.lastBuild.equals(other.getLastBuild()))) &&
            ((this.lastStatus==null && other.getLastStatus()==null) || 
             (this.lastStatus!=null &&
              this.lastStatus.equals(other.getLastStatus()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.projects==null && other.getProjects()==null) || 
             (this.projects!=null &&
              java.util.Arrays.equals(this.projects, other.getProjects()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLastBuild() != null) {
            _hashCode += getLastBuild().hashCode();
        }
        if (getLastStatus() != null) {
            _hashCode += getLastStatus().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getProjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuildDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "BuildDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Builds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Build"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Build"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Build"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastStatus"));
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
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Projects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Project"));
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
