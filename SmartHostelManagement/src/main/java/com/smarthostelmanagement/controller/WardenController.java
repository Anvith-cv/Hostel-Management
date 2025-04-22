package com.smarthostelmanagement.controller;

import com.smarthostelmanagement.model.Warden;
import com.smarthostelmanagement.service.WardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wardens")
public class WardenController {

    @Autowired
    private WardenService wardenService;

    @GetMapping
    public List<Warden> getAllWardens() {
        return wardenService.getAllWardens();
    }

    @GetMapping("/{id}")
    public Warden getWardenById(@PathVariable Long id) {
        return wardenService.getWardenById(id);
    }

    @PostMapping
    public Warden createWarden(@RequestBody Warden warden) {
        return wardenService.saveWarden(warden);
    }

    @PutMapping("/{id}")
    public Warden updateWarden(@PathVariable Long id, @RequestBody Warden warden) {
        warden.setId(id);
        return wardenService.saveWarden(warden);
    }

    @DeleteMapping("/{id}")
    public void deleteWarden(@PathVariable Long id) {
        wardenService.deleteWarden(id);
    }
}
