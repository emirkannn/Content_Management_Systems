package com.example.Content_Management_System.repository;

import com.example.Content_Management_System.entities.Content;
import com.example.Content_Management_System.response.ActorResponse;
import com.example.Content_Management_System.response.DirectorResponse;
import com.example.Content_Management_System.response.MetaResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Integer> {

    @Query("SELECT c.actors FROM Content c WHERE c.id = :id")
    List<ActorResponse> findActorsByContentId(@Param("id") int id);

    @Query("SELECT c.director FROM Content c WHERE c.id = :id")
    DirectorResponse findDirectorByContentId(@Param("id") int id);

    @Query("SELECT c.metaData FROM Content c WHERE c.id = :id")
    MetaResponse findMetaByContentId(@Param("id") int id);
}
