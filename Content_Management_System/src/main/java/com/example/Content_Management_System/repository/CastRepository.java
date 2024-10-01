package com.example.Content_Management_System.repository;

import com.example.Content_Management_System.entities.Cast;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CastRepository extends JpaRepository<Cast, Long> {
    List<Cast> findByRole(Cast.Role role);
}
