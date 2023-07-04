package com.example.tvmtest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User {
    // Entity fields
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String lastname;
    private String email;

    // Empty constructor
    public User() {
    }
}
