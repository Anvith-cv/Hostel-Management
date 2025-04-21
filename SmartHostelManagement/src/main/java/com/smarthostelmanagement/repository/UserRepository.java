package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods here if needed
}
