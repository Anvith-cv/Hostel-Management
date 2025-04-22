package com.smarthostelmanagement.service.impl;

import com.smarthostelmanagement.model.Attendance;
import com.smarthostelmanagement.repository.AttendanceRepository;
import com.smarthostelmanagement.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public Attendance save(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public Attendance update(Long id, Attendance updatedAttendance) {
        Attendance existing = attendanceRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setAttendanceStatus(updatedAttendance.getAttendanceStatus());
            existing.setDate(updatedAttendance.getDate());
            // Update other fields as per the model
            return attendanceRepository.save(existing);
        }
        return null;
    }

    @Override
    public List<Attendance> getAll() {
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance getById(Long id) {
        return attendanceRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        attendanceRepository.deleteById(id);
    }
}
