package com.smarthostelmanagement.service.impl;

import com.smarthostelmanagement.model.Suggestion;
import com.smarthostelmanagement.repository.SuggestionRepository;
import com.smarthostelmanagement.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionServiceImpl implements SuggestionService {

    @Autowired
    private SuggestionRepository suggestionRepository;

    @Override
    public Suggestion save(Suggestion suggestion) {
        return suggestionRepository.save(suggestion);
    }

    @Override
    public Suggestion update(Long id, Suggestion updatedSuggestion) {
        Suggestion existingSuggestion = suggestionRepository.findById(id).orElse(null);
        if (existingSuggestion != null) {
            existingSuggestion.setSuggestionText(updatedSuggestion.getSuggestionText());
            existingSuggestion.setDate(updatedSuggestion.getDate());
            // Add other fields as per your model
            return suggestionRepository.save(existingSuggestion);
        }
        return null;
    }

    @Override
    public List<Suggestion> getAll() {
        return suggestionRepository.findAll();
    }

    @Override
    public Suggestion getById(Long id) {
        return suggestionRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        suggestionRepository.deleteById(id);
    }
}
