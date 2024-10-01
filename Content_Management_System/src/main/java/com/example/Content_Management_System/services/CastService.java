package com.example.Content_Management_System.services;

import com.example.Content_Management_System.entities.Cast;
import com.example.Content_Management_System.repository.CastRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastService {
    private final CastRepository castRepository;

    public CastService(CastRepository castRepository) {
        this.castRepository = castRepository;
    }

    public List<Cast> getCastsByRole(Cast.Role role) {
        return castRepository.findByRole(role);
    }

    public List<Cast> getAllCast() {
        return castRepository.findAll();
    }
}
