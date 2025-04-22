package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    // Custom query methods (if needed) can be added here
}
