package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.Complaints;
import java.util.List;

public interface ComplaintsService {
    Complaints save(Complaints complaint);  // Method to save complaint
    Complaints update(Long id, Complaints complaint);  // Method to update complaint
    List<Complaints> getAll();  // Method to get all complaints
    Complaints getById(Long id);  // Method to get complaint by id
    void delete(Long id);  // Method to delete complaint
}
