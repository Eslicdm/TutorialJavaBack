package com.eslirodrigues.rag.rag.controller;

import com.eslirodrigues.rag.rag.dto.QuestionRequest;
import com.eslirodrigues.rag.rag.service.RagService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rag")
public class RagController {

    private final RagService ragService;

    public RagController(RagService ragService) {
        this.ragService = ragService;
    }

    @PostMapping("/ask")
    public String askQuestion(@RequestBody QuestionRequest request) {
        return ragService.generateAnswer(request.question());
    }
}