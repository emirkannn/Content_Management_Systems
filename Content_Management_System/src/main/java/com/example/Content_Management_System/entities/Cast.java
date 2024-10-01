package com.example.Content_Management_System.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "casts")
public class Cast {

    @Id
    private int id;
    private String name;
    private String poster;

    @Enumerated(EnumType.STRING)
    private Role role; // Add a field to indicate role (Actor/Director)

    // Enum to represent the role
    public enum Role {
        ACTOR,
        DIRECTOR
    }

}