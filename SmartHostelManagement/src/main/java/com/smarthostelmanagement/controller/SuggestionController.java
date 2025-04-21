package com.smarthostelmanagement.controller;

import com.smarthostelmanagement.model.Suggestion;
import com.smarthostelmanagement.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suggestions")
public class SuggestionController {

    @Autowired
    private SuggestionService suggestionService;

    @GetMapping
    public List<Suggestion> getAll() {
        return suggestionService.getAll();
    }

    @GetMapping("/{id}")
    public Suggestion getById(@PathVariable Long id) {
        return suggestionService.getById(id);
    }

    @PostMapping
    public Suggestion create(@RequestBody Suggestion suggestion) {
        return suggestionService.create(suggestion);
    }

    @PutMapping("/{id}")
    public Suggestion update(@PathVariable Long id, @RequestBody Suggestion suggestion) {
        return suggestionService.update(id, suggestion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        suggestionService.delete(id);
    }
}
