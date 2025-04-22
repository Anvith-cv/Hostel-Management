package com.smarthostelmanagement.service.impl;

import com.smarthostelmanagement.model.MessIncharge;
import com.smarthostelmanagement.repository.MessInchargeRepository;
import com.smarthostelmanagement.service.MessInchargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessInchargeServiceImpl implements MessInchargeService {

    @Autowired
    private MessInchargeRepository messInchargeRepository;

    @Override
    public MessIncharge save(MessIncharge messIncharge) {
        return messInchargeRepository.save(messIncharge);
    }

    @Override
    public MessIncharge update(Long id, MessIncharge updatedMessIncharge) {
        MessIncharge existing = messInchargeRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedMessIncharge.getName());
            existing.setContactNumber(updatedMessIncharge.getContactNumber());
            existing.setEmail(updatedMessIncharge.getEmail());
            // Update other fields as per the model
            return messInchargeRepository.save(existing);
        }
        return null;
    }

    @Override
    public List<MessIncharge> getAll() {
        return messInchargeRepository.findAll();
    }

    @Override
    public MessIncharge getById(Long id) {
        return messInchargeRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        messInchargeRepository.deleteById(id);
    }
}
