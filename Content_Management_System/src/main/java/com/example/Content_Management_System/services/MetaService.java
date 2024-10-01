package com.example.Content_Management_System.services;

import com.example.Content_Management_System.entities.MetaData;
import com.example.Content_Management_System.repository.MetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaService {


    private final MetaRepository metaRepository;

    public MetaService(MetaRepository metaRepository) {
        this.metaRepository = metaRepository;
    }
    public List<MetaData> getAllMeta() {
        return metaRepository.findAll();
    }
}
