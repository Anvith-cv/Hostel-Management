package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.Attendance;
import java.util.List;

public interface AttendanceService {
    Attendance save(Attendance attendance);  // Method to save attendance
    Attendance update(Long id, Attendance attendance);  // Method to update attendance
    List<Attendance> getAll();  // Method to get all attendance records
    Attendance getById(Long id);  // Method to get attendance by id
    void delete(Long id);  // Method to delete attendance
}
