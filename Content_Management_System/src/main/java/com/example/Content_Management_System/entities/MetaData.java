package com.example.Content_Management_System.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "meta_data")
public class MetaData {

    @Id
    private int id;
    private String title;
    private String plot;
    private String poster;
    private int year;
    private String language;
    private String country;
}
