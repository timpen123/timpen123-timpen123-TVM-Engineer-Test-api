package com.example.tvmtest.controller;

import com.example.tvmtest.entities.User;
import com.example.tvmtest.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
@RestController
public class UserController {
    // Dependency injection of UserService
    private final UserService userService;

    // Constructor
    public UserController(UserService userService){
        this.userService = userService;
    }

    // Get all users
    @GetMapping()
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    // Get user by id
    @GetMapping("/{id}")
    public User findById(@PathVariable int id) {
        return userService.findByid(id);
    }

    // Create user
    @PostMapping("/post")
    public User user(@RequestBody User user){
        return userService.addUser(user);
    }

    // Update user by id
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        return userService.updateUser(id, updatedUser);
    }

    // Delete user by id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id ){
        userService.deleteById(id);
    }
}