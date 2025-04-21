package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuggestionRepository extends JpaRepository<Suggestion, Long> {
    // Add custom query methods here if needed
}
