package com.example.Content_Management_System.response;

import lombok.Data;

@Data
public class MetaResponse {
    private int id;
    private String title;
    private String plot;
    private String poster;
    private int year;
    private String language;

    public MetaResponse(int id, String title, String plot, String poster, int year, String language) {
        this.id = id;
        this.title = title;
        this.plot = plot;
        this.poster = poster;
        this.year = year;
        this.language = language;
    }
}
