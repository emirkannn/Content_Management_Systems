package com.example.Content_Management_System.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "content")
public class Content {


    @Id
    private int id;

    @OneToOne
    @JoinColumn(name = "metadata_id", referencedColumnName = "id")
    private MetaData metaData;

    @ManyToOne
    @JoinColumn(name = "director_id", referencedColumnName = "id")
    private Cast director;

    @OneToMany
    @JoinTable(
            name = "content_cast",
            joinColumns = @JoinColumn(name = "content_id"),
            inverseJoinColumns = @JoinColumn(name = "cast_id")
    )
    private List<Cast> actors;

    private Timestamp createdAt;

}
