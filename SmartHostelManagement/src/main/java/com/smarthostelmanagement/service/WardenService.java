package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.Warden;

import java.util.List;

public interface WardenService {
    Warden saveWarden(Warden warden);
    List<Warden> getAllWardens();
    Warden getWardenById(Long id);
    void deleteWarden(Long id);
}
