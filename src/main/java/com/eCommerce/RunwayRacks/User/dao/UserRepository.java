package com.eCommerce.RunwayRacks.User.dao;

import com.eCommerce.RunwayRacks.User.entity.User;

import java.util.List;
/*
 * Author Sunnam Sai Jyothi Swaroop
 * Created Date: 31/08/2024
 * Last Modified Date : 31/08/2024
 * CreatedBy : Sunnam Sai Jyothi Swaroop
 * ModifiedBy : Sunnam Sai Jyothi Swaroop
 * */
public interface UserRepository {
    User saveUser(User user);
    User updateUser(User user);
    User getUserById(long userId);
    User getUserByPhoneNumber(String phoneNumber);
    boolean deleteUserById(long userId);
    List<User> getUsersByStatus(String status);
    List<User> getAllUsers();
}
