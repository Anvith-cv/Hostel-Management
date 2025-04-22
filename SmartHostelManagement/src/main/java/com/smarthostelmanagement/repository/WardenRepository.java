package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.Warden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WardenRepository extends JpaRepository<Warden, Long> {
    Warden findByEmail(String email);
}
