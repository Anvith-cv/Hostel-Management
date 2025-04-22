package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.Suggestion;
import java.util.List;

public interface SuggestionService {
    Suggestion save(Suggestion suggestion);  // Method to save suggestion
    Suggestion update(Long id, Suggestion suggestion);  // Method to update suggestion
    List<Suggestion> getAll();  // Method to get all suggestions
    Suggestion getById(Long id);  // Method to get suggestion by id
    void delete(Long id);  // Method to delete suggestion
}
