package com.example.tvmtest.services;

import com.example.tvmtest.entities.User;
import com.example.tvmtest.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    // Dependency injection of UserRepository
    private final UserRepository userRepository;

    // Constructor
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Get all users
    public List<User> getAll() {
        return userRepository.findAll();
    }

    // Get user by id
    public User findByid(int id) {
        return userRepository.findById(id).orElseThrow();
    }

    // Create user
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Update user by id
    public User updateUser(int id, User updatedUser) {
        // Retrieve user or throw exception if not found
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User was not found try another ID: " + id));

        // Set updated fields
        user.setName(updatedUser.getName());
        user.setLastname(updatedUser.getLastname());
        user.setEmail(updatedUser.getEmail());

        // Save and return updated user
        return userRepository.save(user);
    }

    // Delete user by id
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}

