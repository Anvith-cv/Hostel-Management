package com.smarthostelmanagement.service.impl;

import com.smarthostelmanagement.model.Warden;
import com.smarthostelmanagement.repository.WardenRepository;
import com.smarthostelmanagement.service.WardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WardenServiceImpl implements WardenService {

    @Autowired
    private WardenRepository wardenRepository;

    @Override
    public Warden saveWarden(Warden warden) {
        return wardenRepository.save(warden);
    }

    @Override
    public List<Warden> getAllWardens() {
        return wardenRepository.findAll();
    }

    @Override
    public Warden getWardenById(Long id) {
        return wardenRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteWarden(Long id) {
        wardenRepository.deleteById(id);
    }
}
