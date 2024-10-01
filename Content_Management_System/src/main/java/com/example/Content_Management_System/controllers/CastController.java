package com.example.Content_Management_System.controllers;

import com.example.Content_Management_System.entities.Cast;
import com.example.Content_Management_System.services.CastService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cast")
public class CastController {

    private final CastService castService;
    public CastController(CastService castService) {
        this.castService = castService;
    }
    @GetMapping
    public List<Cast> getAllCasts() {
        return castService.getAllCast();
    }

    @GetMapping("/actors")
    public List<Cast> getAllActors() {
        return castService.getCastsByRole(Cast.Role.ACTOR);
    }

    @GetMapping("/directors")
    public List<Cast> getAllDirectors() {
        return castService.getCastsByRole(Cast.Role.DIRECTOR);
    }
}
