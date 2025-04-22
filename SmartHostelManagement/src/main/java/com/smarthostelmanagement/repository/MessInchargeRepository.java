package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.MessIncharge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessInchargeRepository extends JpaRepository<MessIncharge, Long> {
    // Custom query methods (if needed) can be added here
}
