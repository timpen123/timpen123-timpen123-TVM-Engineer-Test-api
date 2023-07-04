package com.example.tvmtest.repository;

import com.example.tvmtest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Find user by id
    Optional<User> findById(int id);
}
