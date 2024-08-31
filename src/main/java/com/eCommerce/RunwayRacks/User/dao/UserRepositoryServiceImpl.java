package com.eCommerce.RunwayRacks.User.dao;

import com.eCommerce.RunwayRacks.User.constants.UserRepositoryPortletKeys;
import com.eCommerce.RunwayRacks.User.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Author Sunnam Sai Jyothi Swaroop
 * Created Date: 31/08/2024
 * Last Modified Date : 31/08/2024
 * CreatedBy : Sunnam Sai Jyothi Swaroop
 * ModifiedBy : Sunnam Sai Jyothi Swaroop
 * */
@Repository
public class UserRepositoryServiceImpl implements UserRepository {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryServiceImpl.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User saveUser(User user) {
        try {
            jdbcTemplate.update(UserRepositoryPortletKeys.
                            getCreateQueryUser(), user.getUserId(),
                    user.getCreateDate(), user.getModifiedDate(),
                    user.getPassword(), user.getPasswordEncrypted(),
                    user.getPasswordModifiedDate(), user.getGraceLoginCount(),
                    user.getScreenName(), user.getEmailAddress(), user.getPhoneNumber(),
                    user.getFacebookId(), user.getGoogleUserId(), user.getLdapServerId()
                    , user.getOpenId(), user.getPortraitId(), user.getFullName()
                    , user.getFirstName(), user.getMiddleName(), user.getLastName()
                    , user.getJobTitle(), user.getLoginDate(), user.getLoginIP()
                    , user.getLastLoginDate(), user.getLastLoginIP()
                    , user.getLastFailedLoginDate()
                    , user.getFailedLoginAttempts()
                    , user.getLockout(), user.getLockoutDate()
                    , user.getAgreedToTermsOfUse()
                    , user.getEmailAddressVerified(),
                    user.getStatus(),
                    user.getStatusValue(), user.getType());
        } catch (Exception e) {
            log.error("Error While adding User with user {} to the DataBase", user.getScreenName() );
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }
        return user;
    }

    @Override
    public User updateUser(User user) {
        try {
            jdbcTemplate.update(UserRepositoryPortletKeys.
                            getUpdateQueryById(), user.getModifiedDate(),
                    user.getPassword(), user.getPasswordEncrypted(),
                    user.getPasswordModifiedDate(), user.getGraceLoginCount(),
                    user.getScreenName(), user.getEmailAddress(), user.getPhoneNumber(),
                    user.getFacebookId(), user.getGoogleUserId(), user.getLdapServerId()
                    , user.getOpenId(), user.getPortraitId(), user.getFullName()
                    , user.getFirstName(), user.getMiddleName(), user.getLastName()
                    , user.getJobTitle(), user.getLoginDate(), user.getLoginIP()
                    , user.getLastLoginDate(), user.getLastLoginIP()
                    , user.getLastFailedLoginDate()
                    , user.getFailedLoginAttempts()
                    , user.getLockout(), user.getLockoutDate()
                    , user.getAgreedToTermsOfUse()
                    , user.getEmailAddressVerified(),
                    user.getStatus(),
                    user.getStatusValue(), user.getType(), user.getUserId());
        } catch (Exception e) {
            log.error("Error While Updating User with user ID {} to the DataBase", user.getUserId());
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }
        return user;
    }

    @Override
    public User getUserById(long userId) {
        List<User> userList = new ArrayList<>();
        User user = null;
        try {
            userList = jdbcTemplate.query(UserRepositoryPortletKeys.getGetUserByUserid(), mapper, userId);
            if (!userList.isEmpty()) {
                user = userList.getFirst();
            }
        } catch (Exception e) {
            log.error("Error While getting User with user ID {} from the DataBase", userId);
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }
        return user;
    }

    @Override
    public User getUserByPhoneNumber(String phoneNumber) {
        List<User> userList = new ArrayList<>();
        User user = null;
        try {
            userList = jdbcTemplate.query(UserRepositoryPortletKeys.getGetUserByUserid(), mapper, phoneNumber);
            if (!userList.isEmpty()) {
                user = userList.getFirst();
            }
        } catch (Exception e) {
            log.error("Error While getting User with user phoneNumber {} from the DataBase", phoneNumber);
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }
        return user;
    }

    @Override
    public boolean deleteUserById(long userId) {
        try {
        jdbcTemplate.update(UserRepositoryPortletKeys.getDeleteUserByUserId(),new Date(),userId);
        return true;
        } catch (Exception e) {
            log.error("Error While deleting User with user Id {} from the DataBase", userId);
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<User> getUsersByStatus(String status) {
        List<User> userList = new ArrayList<>();
        try {
            userList = jdbcTemplate.query(UserRepositoryPortletKeys.getGetUsersListByStatus(), mapper, status);
        } catch (Exception e) {
            log.error("Error While getting User with status {} DataBase", status);
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }
        return userList;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = null;
        try {
            userList = jdbcTemplate.query(UserRepositoryPortletKeys.getGetUsersList(), mapper);
        } catch (Exception e) {
            log.error("Error While getting Users from the DataBase");
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }
        return userList;
    }

    RowMapper<User> mapper = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setUserId(rs.getLong("userId"));
            user.setCreateDate(rs.getTimestamp("createDate"));
            user.setModifiedDate(rs.getTimestamp("modifiedDate"));
            user.setPassword(rs.getString("password_"));
            user.setPasswordEncrypted(rs.getBoolean("passwordEncrypted"));
            user.setPasswordModifiedDate(rs.getTimestamp("passwordModifiedDate"));
            user.setGraceLoginCount(rs.getLong("graceLoginCount"));
            user.setScreenName(rs.getString("screenName"));
            user.setEmailAddress(rs.getString("emailAddress"));
            user.setPhoneNumber(rs.getString("phoneNumber"));
            user.setFacebookId(rs.getLong("facebookId"));
            user.setGoogleUserId(rs.getString("googleUserId"));
            user.setLdapServerId(rs.getLong("ldapServerId"));
            user.setOpenId(rs.getString("openId"));
            user.setPortraitId(rs.getLong("portraitId"));
            user.setFullName(rs.getString("fullName"));
            user.setFirstName(rs.getString("firstName"));
            user.setMiddleName(rs.getString("middleName"));
            user.setLastName(rs.getString("lastName"));
            user.setJobTitle(rs.getString("jobTitle"));
            user.setLoginDate(rs.getTimestamp("loginDate"));
            user.setLoginIP(rs.getString("loginIP"));
            user.setLastLoginDate(rs.getTimestamp("lastLoginDate"));
            user.setLastLoginIP(rs.getString("lastLoginIP"));
            user.setLastFailedLoginDate(rs.getTimestamp("lastFailedLoginDate"));
            user.setFailedLoginAttempts(rs.getInt("failedLoginAttempts"));
            user.setLockout(rs.getBoolean("lockout"));
            user.setLockoutDate(rs.getTimestamp("lockoutDate"));
            user.setAgreedToTermsOfUse(rs.getBoolean("agreedToTermsOfUse"));
            user.setEmailAddressVerified(rs.getBoolean("emailAddressVerified"));
            user.setStatus(rs.getInt("status"));
            user.setStatusValue(rs.getString("statusValue"));
            user.setType(rs.getInt("type_"));
            return user;
        }
    };


}
