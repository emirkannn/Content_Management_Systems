package com.example.Content_Management_System.response;

import com.example.Content_Management_System.entities.Content;
import lombok.Data;

@Data
public class ActorResponse {

    private int id;
    private String name;
    private String poster;

    public ActorResponse(int id, String name, String poster) {
        this.id = id;
        this.name = name;
        this.poster = poster;
    }
}
