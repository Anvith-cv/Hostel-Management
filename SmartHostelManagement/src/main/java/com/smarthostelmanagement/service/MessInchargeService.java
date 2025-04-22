package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.MessIncharge;
import java.util.List;

public interface MessInchargeService {
    MessIncharge save(MessIncharge messIncharge);  // Method to save mess incharge
    MessIncharge update(Long id, MessIncharge messIncharge);  // Method to update mess incharge
    List<MessIncharge> getAll();  // Method to get all mess incharges
    MessIncharge getById(Long id);  // Method to get mess incharge by id
    void delete(Long id);  // Method to delete mess incharge
}
