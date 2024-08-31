package com.eCommerce.RunwayRacks.User.controller;

import com.eCommerce.RunwayRacks.User.dao.UserRepository;
import com.eCommerce.RunwayRacks.User.entity.User;
import com.eCommerce.RunwayRacks.counter.dao.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    CounterRepository counterRepository;

    @PostMapping("/user")
    public ResponseEntity<ApiResponse<User>> createUser(@RequestBody User user) {
        try {
            // Check if phone number already exists
            User existingUser = userRepository.getUserByPhoneNumber(user.getPhoneNumber());
            if (existingUser != null) {
                return new ResponseEntity<>(new ApiResponse<>(false, "Phone number already in use."), HttpStatus.CONFLICT);
            }

            // Generate and set user ID
            long userId = counterRepository.increment(User.class.getName());
            user.setUserId(userId);

            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            String encryptedPassword = bCryptPasswordEncoder.encode(user.getPassword());
            user.setPassword(encryptedPassword);
            // Save user and return success response
//            User savedUser = userRepository.saveUser(user);
            return new ResponseEntity<>(new ApiResponse<>(true, "User Had been Successfully Created.n Now you can Login using Phone Number or Email Address."), HttpStatus.CREATED);

        } catch (Exception e) {
            // Log the error for debugging purposes
            e.printStackTrace();
            return new ResponseEntity<>(new ApiResponse<>(false, "An error occurred while creating the user."), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/user")
    public ResponseEntity<ApiResponse<User>> updateUser(@RequestBody User user) {
        try {
            User updatedUser = userRepository.updateUser(user);
            if (updatedUser != null) {
                return new ResponseEntity<>(new ApiResponse<>(true, updatedUser), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new ApiResponse<>(false, "User not found."), HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new ApiResponse<>(false, "An error occurred while updating the user."), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<ApiResponse<User>> getUserById(@PathVariable("userId") int userId) {
        try {
            User user = userRepository.getUserById(userId);
            if (user != null) {
                return new ResponseEntity<>(new ApiResponse<>(true, user), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new ApiResponse<>(false, "User not found."), HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new ApiResponse<>(false, "An error occurred while retrieving the user."), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{phoneNumber}")
    public ResponseEntity<ApiResponse<User>> getUserByPhoneNumber(@PathVariable("phoneNumber") String phoneNumber) {
        try {
            User user = userRepository.getUserByPhoneNumber(phoneNumber);
            if (user != null) {
                return new ResponseEntity<>(new ApiResponse<>(true, user), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new ApiResponse<>(false, "User not found."), HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new ApiResponse<>(false, "An error occurred while retrieving the user."), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users")
    public ResponseEntity<ApiResponse<List<User>>> getUsersList() {
        try {
            List<User> users = userRepository.getAllUsers();
            return new ResponseEntity<>(new ApiResponse<>(true, users), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new ApiResponse<>(false, "An error occurred while retrieving the users."), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users/{status}")
    public ResponseEntity<ApiResponse<List<User>>> getUsersListByStatus(@PathVariable("status") String status) {
        try {
            List<User> users = userRepository.getUsersByStatus(status);
            return new ResponseEntity<>(new ApiResponse<>(true, users), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new ApiResponse<>(false, "An error occurred while retrieving the users by status."), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
