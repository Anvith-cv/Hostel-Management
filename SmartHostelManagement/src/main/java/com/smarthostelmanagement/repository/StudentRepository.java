package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Add custom query methods here if needed
}
