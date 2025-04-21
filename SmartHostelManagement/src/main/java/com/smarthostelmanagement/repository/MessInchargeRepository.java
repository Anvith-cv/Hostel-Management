package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.MessIncharge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessInchargeRepository extends JpaRepository<MessIncharge, Long> {
    // Add custom query methods here if needed
}
