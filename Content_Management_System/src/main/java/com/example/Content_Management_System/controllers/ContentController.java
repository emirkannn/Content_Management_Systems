package com.example.Content_Management_System.controllers;

import com.example.Content_Management_System.entities.Content;
import com.example.Content_Management_System.response.ActorResponse;
import com.example.Content_Management_System.response.DirectorResponse;
import com.example.Content_Management_System.response.MetaResponse;
import com.example.Content_Management_System.services.ContentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contents")
public class ContentController {

    private final ContentService contentService;

    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    public List<Content> getAllContent() {
        return contentService.getContents();
    }

    @GetMapping("/{id}")
    public Content getContent(@PathVariable int id) {
        return contentService.getContent(id);
    }

    @GetMapping("/{id}/actors")
    public List<ActorResponse> getContentByActors(@PathVariable int id) {
        return contentService.getContentByActor(id);
    }
    @GetMapping("/{id}/director")
    public DirectorResponse getContentByDirector(@PathVariable int id) {
        return contentService.getContentByDirector(id);
    }

    @GetMapping("/{id}/metadata")
    public MetaResponse getContentByMeta(@PathVariable int id) {
        return contentService.getContentByMetaData(id);
    }


}
