package com.smarthostelmanagement.service.impl;

import com.smarthostelmanagement.model.Student;
import com.smarthostelmanagement.repository.StudentRepository;
import com.smarthostelmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Long id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setPhone(updatedStudent.getPhone());
            existingStudent.setAddress(updatedStudent.getAddress());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
