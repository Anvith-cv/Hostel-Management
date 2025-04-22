package com.smarthostelmanagement.service.impl;

import com.smarthostelmanagement.model.Complaints;
import com.smarthostelmanagement.repository.ComplaintsRepository;
import com.smarthostelmanagement.service.ComplaintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintsServiceImpl implements ComplaintsService {

    @Autowired
    private ComplaintsRepository complaintsRepository;

    @Override
    public Complaints save(Complaints complaint) {
        return complaintsRepository.save(complaint);
    }

    @Override
    public Complaints update(Long id, Complaints updatedComplaint) {
        Complaints existing = complaintsRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setComplaintText(updatedComplaint.getComplaintText());
            existing.setStatus(updatedComplaint.getStatus());
            // Update other fields as per the model
            return complaintsRepository.save(existing);
        }
        return null;
    }

    @Override
    public List<Complaints> getAll() {
        return complaintsRepository.findAll();
    }

    @Override
    public Complaints getById(Long id) {
        return complaintsRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        complaintsRepository.deleteById(id);
    }
}
