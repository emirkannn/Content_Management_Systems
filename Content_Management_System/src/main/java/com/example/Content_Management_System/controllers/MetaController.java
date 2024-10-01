package com.example.Content_Management_System.controllers;

import com.example.Content_Management_System.entities.MetaData;
import com.example.Content_Management_System.services.MetaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meta")
public class MetaController {

    private final MetaService metaService;
    public MetaController(MetaService metaService) {
        this.metaService = metaService;
    }

    @GetMapping
    public List<MetaData> getMeta() {
        return metaService.getAllMeta();
    }
}
