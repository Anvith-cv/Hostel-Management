package com.smarthostelmanagement.controller;

import com.smarthostelmanagement.model.Attendance;
import com.smarthostelmanagement.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping
    public List<Attendance> getAll() {
        return attendanceService.getAll();
    }

    @GetMapping("/{id}")
    public Attendance getById(@PathVariable Long id) {
        return attendanceService.getById(id);
    }

    @PostMapping
    public Attendance save(@RequestBody Attendance attendance) {  // Endpoint to save attendance
        return attendanceService.save(attendance);
    }

    @PutMapping("/{id}")
    public Attendance update(@PathVariable Long id, @RequestBody Attendance attendance) {
        return attendanceService.update(id, attendance);  // Endpoint to update attendance
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        attendanceService.delete(id);  // Endpoint to delete attendance
    }
}
