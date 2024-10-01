package com.example.Content_Management_System.repository;

import com.example.Content_Management_System.entities.MetaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaRepository extends JpaRepository<MetaData, Integer> {
}
