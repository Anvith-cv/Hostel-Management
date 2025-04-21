package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    // Add custom query methods here if needed
}
