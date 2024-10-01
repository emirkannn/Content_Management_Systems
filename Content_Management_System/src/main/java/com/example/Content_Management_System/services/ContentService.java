package com.example.Content_Management_System.services;

import com.example.Content_Management_System.entities.Content;
import com.example.Content_Management_System.repository.ContentRepository;
import com.example.Content_Management_System.response.ActorResponse;
import com.example.Content_Management_System.response.DirectorResponse;
import com.example.Content_Management_System.response.MetaResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContentService {

    private ContentRepository contentRepository;
    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public List<Content> getContents() {
        return contentRepository.findAll();
    }

    public Content getContent(int id) {
        return contentRepository.findById(id).orElse(null);
    }

    public List<ActorResponse> getContentByActor(int id) {
        Content content = contentRepository.findById(id)
                .orElse(null);

        // Content içerisindeki aktörleri ActorResponse listesine dönüştür
        return content.getActors().stream()
                .map(actor -> new ActorResponse(actor.getId(), actor.getName(), actor.getPoster())) // Her bir Actor'u ActorResponse'a çevir
                .collect(Collectors.toList()); // Listeye dönüştür
    }

    public DirectorResponse getContentByDirector(int id) {
        Content content = contentRepository.findById(id)
                .orElse(null);

        // DirectorResponse nesnesini oluştur
        return new DirectorResponse(
                content.getDirector().getId(), // Eğer directorId var ise
                content.getDirector().getName(), // Eğer directorName var ise
                content.getDirector().getPoster()
        );
    }

    public MetaResponse getContentByMetaData(int id) {
        Content content = contentRepository.findById(id)
                .orElse(null);

        // DirectorResponse nesnesini oluştur
        return new MetaResponse(
                content.getMetaData().getId(),
                content.getMetaData().getTitle(),
                content.getMetaData().getPoster(),
                content.getMetaData().getPlot(),
                content.getMetaData().getYear(),
                content.getMetaData().getLanguage()
        );
    }
}
