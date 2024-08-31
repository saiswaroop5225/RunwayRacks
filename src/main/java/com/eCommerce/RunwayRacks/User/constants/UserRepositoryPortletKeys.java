package com.eCommerce.RunwayRacks.User.constants;

public class UserRepositoryPortletKeys {
    private static String CREATE_QUERY_USER = "INSERT INTO runwayracks.user_ (userId, createDate, modifiedDate, password_, passwordEncrypted, passwordModifiedDate, graceLoginCount, " + "screenName, emailAddress, phoneNumber, facebookId," + " googleUserId, ldapServerId, openId, portraitId," + " fullName, firstName, middleName, lastName, jobTitle," + " loginDate, loginIP, lastLoginDate, lastLoginIP, " + "lastFailedLoginDate, failedLoginAttempts, lockout," + " lockoutDate, agreedToTermsOfUse, emailAddressVerified, " + "status, statusValue, type_) " + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?)";
    private static String UPDATE_QUERY_BY_ID = "UPDATE runwayracks.user_ SET modifiedDate=?, password_=?, passwordEncrypted=?, passwordModifiedDate=?, graceLoginCount=?, screenName=?, emailAddress=?, phoneNumber=?, facebookId=?, googleUserId=?, ldapServerId=?, openId=?, portraitId=?, fullName=?, firstName=?, middleName=?, lastName=?, jobTitle=?, loginDate=?, loginIP=?, lastLoginDate=?, lastLoginIP=?, lastFailedLoginDate=?, failedLoginAttempts=?, lockout=?, lockoutDate=?, agreedToTermsOfUse=?, emailAddressVerified=?, status=?, statusValue=?, type_=? WHERE userId=?";
    private static String GET_USER_BY_USERID = "SELECT * FROM runwayracks.user_ WHERE userId=?";
    private static String GET_USER_BY_PHONE_NUMBER = "SELECT * FROM runwayracks.user_ WHERE phoneNumber=?";
    private static String DELETE_USER_BY_USER_ID =  "UPDATE runwayracks.user_ SET modifiedDate=?,status=1, statusValue='INACTIVE' WHERE userId=?";
    private static String GET_USERS_LIST_BY_STATUS = "SELECT * FROM USER_ WHERE statusValue = ?";
    private static String GET_USERS_LIST = "SELECT * FROM USER_ WHERE statusValue = ?";

    public static String getCreateQueryUser() {
        return CREATE_QUERY_USER;
    }

    public static String getGetUsersListByStatus() {
        return GET_USERS_LIST_BY_STATUS;
    }

    public static String getUpdateQueryById() {
        return UPDATE_QUERY_BY_ID;
    }

    public static String getGetUserByUserid() {
        return GET_USER_BY_USERID;
    }

    public static String getGetUserByPhoneNumber() {
        return GET_USER_BY_PHONE_NUMBER;
    }

    public static String getDeleteUserByUserId() {
        return DELETE_USER_BY_USER_ID;
    }

    public static String getGetUsersList() {
        return GET_USERS_LIST;
    }
}
