package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.Complaints;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintsRepository extends JpaRepository<Complaints, Long> {
    // Add custom query methods here if needed
}
