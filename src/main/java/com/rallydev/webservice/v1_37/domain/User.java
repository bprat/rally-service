/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_37.domain;

public class User  extends com.rallydev.webservice.v1_37.domain.DomainObject  implements java.io.Serializable {
    private java.lang.Boolean disabled;

    private java.lang.String displayName;

    private java.lang.String emailAddress;

    private java.lang.String firstName;

    private java.lang.String landingPage;

    private java.lang.String lastName;

    private java.util.Calendar lastPasswordUpdateDate;

    private java.lang.String middleName;

    private java.lang.String onpremLdapUsername;

    private com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory;

    private java.lang.String role;

    private java.lang.String shortDisplayName;

    private java.lang.Boolean subscriptionAdmin;

    private com.rallydev.webservice.v1_37.domain.Project[] teamMemberships;

    private java.lang.String userName;

    private com.rallydev.webservice.v1_37.domain.UserPermission[] userPermissions;

    private com.rallydev.webservice.v1_37.domain.UserProfile userProfile;

    public User() {
    }

    public User(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           com.rallydev.webservice.v1_37.domain.Subscription subscription,
           java.lang.Boolean disabled,
           java.lang.String displayName,
           java.lang.String emailAddress,
           java.lang.String firstName,
           java.lang.String landingPage,
           java.lang.String lastName,
           java.util.Calendar lastPasswordUpdateDate,
           java.lang.String middleName,
           java.lang.String onpremLdapUsername,
           com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory,
           java.lang.String role,
           java.lang.String shortDisplayName,
           java.lang.Boolean subscriptionAdmin,
           com.rallydev.webservice.v1_37.domain.Project[] teamMemberships,
           java.lang.String userName,
           com.rallydev.webservice.v1_37.domain.UserPermission[] userPermissions,
           com.rallydev.webservice.v1_37.domain.UserProfile userProfile) {
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
        this.disabled = disabled;
        this.displayName = displayName;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.landingPage = landingPage;
        this.lastName = lastName;
        this.lastPasswordUpdateDate = lastPasswordUpdateDate;
        this.middleName = middleName;
        this.onpremLdapUsername = onpremLdapUsername;
        this.revisionHistory = revisionHistory;
        this.role = role;
        this.shortDisplayName = shortDisplayName;
        this.subscriptionAdmin = subscriptionAdmin;
        this.teamMemberships = teamMemberships;
        this.userName = userName;
        this.userPermissions = userPermissions;
        this.userProfile = userProfile;
    }


    /**
     * Gets the disabled value for this User.
     * 
     * @return disabled
     */
    public java.lang.Boolean getDisabled() {
        return disabled;
    }


    /**
     * Sets the disabled value for this User.
     * 
     * @param disabled
     */
    public void setDisabled(java.lang.Boolean disabled) {
        this.disabled = disabled;
    }


    /**
     * Gets the displayName value for this User.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this User.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the emailAddress value for this User.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this User.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the firstName value for this User.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this User.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the landingPage value for this User.
     * 
     * @return landingPage
     */
    public java.lang.String getLandingPage() {
        return landingPage;
    }


    /**
     * Sets the landingPage value for this User.
     * 
     * @param landingPage
     */
    public void setLandingPage(java.lang.String landingPage) {
        this.landingPage = landingPage;
    }


    /**
     * Gets the lastName value for this User.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this User.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastPasswordUpdateDate value for this User.
     * 
     * @return lastPasswordUpdateDate
     */
    public java.util.Calendar getLastPasswordUpdateDate() {
        return lastPasswordUpdateDate;
    }


    /**
     * Sets the lastPasswordUpdateDate value for this User.
     * 
     * @param lastPasswordUpdateDate
     */
    public void setLastPasswordUpdateDate(java.util.Calendar lastPasswordUpdateDate) {
        this.lastPasswordUpdateDate = lastPasswordUpdateDate;
    }


    /**
     * Gets the middleName value for this User.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this User.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the onpremLdapUsername value for this User.
     * 
     * @return onpremLdapUsername
     */
    public java.lang.String getOnpremLdapUsername() {
        return onpremLdapUsername;
    }


    /**
     * Sets the onpremLdapUsername value for this User.
     * 
     * @param onpremLdapUsername
     */
    public void setOnpremLdapUsername(java.lang.String onpremLdapUsername) {
        this.onpremLdapUsername = onpremLdapUsername;
    }


    /**
     * Gets the revisionHistory value for this User.
     * 
     * @return revisionHistory
     */
    public com.rallydev.webservice.v1_37.domain.RevisionHistory getRevisionHistory() {
        return revisionHistory;
    }


    /**
     * Sets the revisionHistory value for this User.
     * 
     * @param revisionHistory
     */
    public void setRevisionHistory(com.rallydev.webservice.v1_37.domain.RevisionHistory revisionHistory) {
        this.revisionHistory = revisionHistory;
    }


    /**
     * Gets the role value for this User.
     * 
     * @return role
     */
    public java.lang.String getRole() {
        return role;
    }


    /**
     * Sets the role value for this User.
     * 
     * @param role
     */
    public void setRole(java.lang.String role) {
        this.role = role;
    }


    /**
     * Gets the shortDisplayName value for this User.
     * 
     * @return shortDisplayName
     */
    public java.lang.String getShortDisplayName() {
        return shortDisplayName;
    }


    /**
     * Sets the shortDisplayName value for this User.
     * 
     * @param shortDisplayName
     */
    public void setShortDisplayName(java.lang.String shortDisplayName) {
        this.shortDisplayName = shortDisplayName;
    }


    /**
     * Gets the subscriptionAdmin value for this User.
     * 
     * @return subscriptionAdmin
     */
    public java.lang.Boolean getSubscriptionAdmin() {
        return subscriptionAdmin;
    }


    /**
     * Sets the subscriptionAdmin value for this User.
     * 
     * @param subscriptionAdmin
     */
    public void setSubscriptionAdmin(java.lang.Boolean subscriptionAdmin) {
        this.subscriptionAdmin = subscriptionAdmin;
    }


    /**
     * Gets the teamMemberships value for this User.
     * 
     * @return teamMemberships
     */
    public com.rallydev.webservice.v1_37.domain.Project[] getTeamMemberships() {
        return teamMemberships;
    }


    /**
     * Sets the teamMemberships value for this User.
     * 
     * @param teamMemberships
     */
    public void setTeamMemberships(com.rallydev.webservice.v1_37.domain.Project[] teamMemberships) {
        this.teamMemberships = teamMemberships;
    }


    /**
     * Gets the userName value for this User.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this User.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userPermissions value for this User.
     * 
     * @return userPermissions
     */
    public com.rallydev.webservice.v1_37.domain.UserPermission[] getUserPermissions() {
        return userPermissions;
    }


    /**
     * Sets the userPermissions value for this User.
     * 
     * @param userPermissions
     */
    public void setUserPermissions(com.rallydev.webservice.v1_37.domain.UserPermission[] userPermissions) {
        this.userPermissions = userPermissions;
    }


    /**
     * Gets the userProfile value for this User.
     * 
     * @return userProfile
     */
    public com.rallydev.webservice.v1_37.domain.UserProfile getUserProfile() {
        return userProfile;
    }


    /**
     * Sets the userProfile value for this User.
     * 
     * @param userProfile
     */
    public void setUserProfile(com.rallydev.webservice.v1_37.domain.UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.disabled==null && other.getDisabled()==null) || 
             (this.disabled!=null &&
              this.disabled.equals(other.getDisabled()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.landingPage==null && other.getLandingPage()==null) || 
             (this.landingPage!=null &&
              this.landingPage.equals(other.getLandingPage()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastPasswordUpdateDate==null && other.getLastPasswordUpdateDate()==null) || 
             (this.lastPasswordUpdateDate!=null &&
              this.lastPasswordUpdateDate.equals(other.getLastPasswordUpdateDate()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.onpremLdapUsername==null && other.getOnpremLdapUsername()==null) || 
             (this.onpremLdapUsername!=null &&
              this.onpremLdapUsername.equals(other.getOnpremLdapUsername()))) &&
            ((this.revisionHistory==null && other.getRevisionHistory()==null) || 
             (this.revisionHistory!=null &&
              this.revisionHistory.equals(other.getRevisionHistory()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.shortDisplayName==null && other.getShortDisplayName()==null) || 
             (this.shortDisplayName!=null &&
              this.shortDisplayName.equals(other.getShortDisplayName()))) &&
            ((this.subscriptionAdmin==null && other.getSubscriptionAdmin()==null) || 
             (this.subscriptionAdmin!=null &&
              this.subscriptionAdmin.equals(other.getSubscriptionAdmin()))) &&
            ((this.teamMemberships==null && other.getTeamMemberships()==null) || 
             (this.teamMemberships!=null &&
              java.util.Arrays.equals(this.teamMemberships, other.getTeamMemberships()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userPermissions==null && other.getUserPermissions()==null) || 
             (this.userPermissions!=null &&
              java.util.Arrays.equals(this.userPermissions, other.getUserPermissions()))) &&
            ((this.userProfile==null && other.getUserProfile()==null) || 
             (this.userProfile!=null &&
              this.userProfile.equals(other.getUserProfile())));
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
        if (getDisabled() != null) {
            _hashCode += getDisabled().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLandingPage() != null) {
            _hashCode += getLandingPage().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastPasswordUpdateDate() != null) {
            _hashCode += getLastPasswordUpdateDate().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getOnpremLdapUsername() != null) {
            _hashCode += getOnpremLdapUsername().hashCode();
        }
        if (getRevisionHistory() != null) {
            _hashCode += getRevisionHistory().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getShortDisplayName() != null) {
            _hashCode += getShortDisplayName().hashCode();
        }
        if (getSubscriptionAdmin() != null) {
            _hashCode += getSubscriptionAdmin().hashCode();
        }
        if (getTeamMemberships() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeamMemberships());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeamMemberships(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserProfile() != null) {
            _hashCode += getUserProfile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Disabled"));
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
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LandingPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPasswordUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastPasswordUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onpremLdapUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OnpremLdapUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShortDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriptionAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamMemberships");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TeamMemberships"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Project"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "UserPermission"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "UserPermission"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_37/domain", "UserProfile"));
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
