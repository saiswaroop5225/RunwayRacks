package com.eCommerce.RunwayRacks.User.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.Objects;


/*
 * Author Sunnam Sai Jyothi Swaroop
 * Created Date: 31/08/2024
 * Last Modified Date : 31/08/2024
 * CreatedBy : Sunnam Sai Jyothi Swaroop
 * ModifiedBy : Sunnam Sai Jyothi Swaroop
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private Long userId;
    private Date createDate;
    private Date modifiedDate;
    private String password;
    private Boolean passwordEncrypted;
    private Date passwordModifiedDate;
    private Long graceLoginCount;
    private String screenName;
    private String emailAddress;
    private String phoneNumber;
    private Long facebookId;
    private String googleUserId;
    private Long ldapServerId;
    private String openId;
    private Long portraitId;
    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private String jobTitle;
    private Date loginDate;
    private String loginIP;
    private Date lastLoginDate;
    private String lastLoginIP;
    private Date lastFailedLoginDate;
    private Integer failedLoginAttempts;
    private Boolean lockout;
    private Date lockoutDate;
    private Boolean agreedToTermsOfUse;
    private Boolean emailAddressVerified;
    private Integer status;
    private String statusValue;
    private Integer type;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getPasswordEncrypted() {
        return passwordEncrypted;
    }

    public void setPasswordEncrypted(Boolean passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }

    public Date getPasswordModifiedDate() {
        return passwordModifiedDate;
    }

    public void setPasswordModifiedDate(Date passwordModifiedDate) {
        this.passwordModifiedDate = passwordModifiedDate;
    }

    public Long getGraceLoginCount() {
        return graceLoginCount;
    }

    public void setGraceLoginCount(Long graceLoginCount) {
        this.graceLoginCount = graceLoginCount;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(Long facebookId) {
        this.facebookId = facebookId;
    }

    public String getGoogleUserId() {
        return googleUserId;
    }

    public void setGoogleUserId(String googleUserId) {
        this.googleUserId = googleUserId;
    }

    public Long getLdapServerId() {
        return ldapServerId;
    }

    public void setLdapServerId(Long ldapServerId) {
        this.ldapServerId = ldapServerId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getPortraitId() {
        return portraitId;
    }

    public void setPortraitId(Long portraitId) {
        this.portraitId = portraitId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public Date getLastFailedLoginDate() {
        return lastFailedLoginDate;
    }

    public void setLastFailedLoginDate(Date lastFailedLoginDate) {
        this.lastFailedLoginDate = lastFailedLoginDate;
    }

    public Integer getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void setFailedLoginAttempts(Integer failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public Boolean getLockout() {
        return lockout;
    }

    public void setLockout(Boolean lockout) {
        this.lockout = lockout;
    }

    public Date getLockoutDate() {
        return lockoutDate;
    }

    public void setLockoutDate(Date lockoutDate) {
        this.lockoutDate = lockoutDate;
    }

    public Boolean getAgreedToTermsOfUse() {
        return agreedToTermsOfUse;
    }

    public void setAgreedToTermsOfUse(Boolean agreedToTermsOfUse) {
        this.agreedToTermsOfUse = agreedToTermsOfUse;
    }

    public Boolean getEmailAddressVerified() {
        return emailAddressVerified;
    }

    public void setEmailAddressVerified(Boolean emailAddressVerified) {
        this.emailAddressVerified = emailAddressVerified;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(createDate, user.createDate) && Objects.equals(modifiedDate, user.modifiedDate) && Objects.equals(password, user.password) && Objects.equals(passwordEncrypted, user.passwordEncrypted) && Objects.equals(passwordModifiedDate, user.passwordModifiedDate) && Objects.equals(graceLoginCount, user.graceLoginCount) && Objects.equals(screenName, user.screenName) && Objects.equals(emailAddress, user.emailAddress) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(facebookId, user.facebookId) && Objects.equals(googleUserId, user.googleUserId) && Objects.equals(ldapServerId, user.ldapServerId) && Objects.equals(openId, user.openId) && Objects.equals(portraitId, user.portraitId) && Objects.equals(fullName, user.fullName) && Objects.equals(firstName, user.firstName) && Objects.equals(middleName, user.middleName) && Objects.equals(lastName, user.lastName) && Objects.equals(jobTitle, user.jobTitle) && Objects.equals(loginDate, user.loginDate) && Objects.equals(loginIP, user.loginIP) && Objects.equals(lastLoginDate, user.lastLoginDate) && Objects.equals(lastLoginIP, user.lastLoginIP) && Objects.equals(lastFailedLoginDate, user.lastFailedLoginDate) && Objects.equals(failedLoginAttempts, user.failedLoginAttempts) && Objects.equals(lockout, user.lockout) && Objects.equals(lockoutDate, user.lockoutDate) && Objects.equals(agreedToTermsOfUse, user.agreedToTermsOfUse) && Objects.equals(emailAddressVerified, user.emailAddressVerified) && Objects.equals(status, user.status) && Objects.equals(statusValue, user.statusValue) && Objects.equals(type, user.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, createDate, modifiedDate, password, passwordEncrypted, passwordModifiedDate, graceLoginCount, screenName, emailAddress, phoneNumber, facebookId, googleUserId, ldapServerId, openId, portraitId, fullName, firstName, middleName, lastName, jobTitle, loginDate, loginIP, lastLoginDate, lastLoginIP, lastFailedLoginDate, failedLoginAttempts, lockout, lockoutDate, agreedToTermsOfUse, emailAddressVerified, status, statusValue, type);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", createDate=" + createDate +
                ", modifiedDate=" + modifiedDate +
                ", password='" + password + '\'' +
                ", passwordEncrypted=" + passwordEncrypted +
                ", passwordModifiedDate=" + passwordModifiedDate +
                ", graceLoginCount=" + graceLoginCount +
                ", screenName='" + screenName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", facebookId=" + facebookId +
                ", googleUserId='" + googleUserId + '\'' +
                ", ldapServerId=" + ldapServerId +
                ", openId='" + openId + '\'' +
                ", portraitId=" + portraitId +
                ", fullName='" + fullName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", loginDate=" + loginDate +
                ", loginIP='" + loginIP + '\'' +
                ", lastLoginDate=" + lastLoginDate +
                ", lastLoginIP='" + lastLoginIP + '\'' +
                ", lastFailedLoginDate=" + lastFailedLoginDate +
                ", failedLoginAttempts=" + failedLoginAttempts +
                ", lockout=" + lockout +
                ", lockoutDate=" + lockoutDate +
                ", agreedToTermsOfUse=" + agreedToTermsOfUse +
                ", emailAddressVerified=" + emailAddressVerified +
                ", status=" + status +
                ", statusValue='" + statusValue + '\'' +
                ", type=" + type +
                '}';
    }

}
