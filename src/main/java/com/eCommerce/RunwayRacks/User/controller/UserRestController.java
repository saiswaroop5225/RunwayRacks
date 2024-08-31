package com.eCommerce.RunwayRacks.User.controller;

import com.eCommerce.RunwayRacks.User.dao.UserRepository;
import com.eCommerce.RunwayRacks.User.entity.User;
import com.eCommerce.RunwayRacks.counter.dao.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    CounterRepository counterRepository;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        long userId = counterRepository.increment(User.class.getName());
        System.out.println("user id..... "+userId);
        user.setUserId(userId);
        return userRepository.saveUser(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userRepository.updateUser(user);
    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId") int userId) {
        return userRepository.getUserById(userId);
    }

    @GetMapping("/user/{phoneNumber}")
    public User getUserByPhoneNumber(@PathVariable("phoneNumber") String phoneNumber) {
        return userRepository.getUserByPhoneNumber(phoneNumber);
    }

    @GetMapping("/users")
    public List<User> getUsersList() {
        return userRepository.getAllUsers();
    }

    @GetMapping("/users/{status}")
    public List<User> getUsersListByStatus(@PathVariable("status") String status) {
        return userRepository.getUsersByStatus(status);
    }

    @RequestMapping("/world")
    public String getLogin() {
        return "<h1>Hello World Login Page</h1>";
    }
}
