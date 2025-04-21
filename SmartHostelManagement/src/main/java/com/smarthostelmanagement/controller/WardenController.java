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
    public List<Warden> getAll() {
        return wardenService.getAll();
    }

    @GetMapping("/{id}")
    public Warden getById(@PathVariable Long id) {
        return wardenService.getById(id);
    }

    @PostMapping
    public Warden create(@RequestBody Warden warden) {
        return wardenService.create(warden);
    }

    @PutMapping("/{id}")
    public Warden update(@PathVariable Long id, @RequestBody Warden warden) {
        return wardenService.update(id, warden);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        wardenService.delete(id);
    }
}
