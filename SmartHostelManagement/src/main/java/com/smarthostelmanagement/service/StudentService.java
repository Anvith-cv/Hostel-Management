package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.Student;
import java.util.List;

public interface StudentService {
    Student save(Student student);  // Method to save student
    Student update(Long id, Student student);  // Method to update student
    List<Student> getAll();  // Method to get all students
    Student getById(Long id);  // Method to get student by id
    void delete(Long id);  // Method to delete student
}
