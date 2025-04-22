package com.smarthostelmanagement.controller;

import com.smarthostelmanagement.model.Complaints;
import com.smarthostelmanagement.service.ComplaintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintsController {

    @Autowired
    private ComplaintsService complaintsService;

    @GetMapping
    public List<Complaints> getAll() {
        return complaintsService.getAll();
    }

    @GetMapping("/{id}")
    public Complaints getById(@PathVariable Long id) {
        return complaintsService.getById(id);
    }

    @PostMapping
    public Complaints save(@RequestBody Complaints complaint) {  // Endpoint to save complaint
        return complaintsService.save(complaint);
    }

    @PutMapping("/{id}")
    public Complaints update(@PathVariable Long id, @RequestBody Complaints complaint) {
        return complaintsService.update(id, complaint);  // Endpoint to update complaint
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        complaintsService.delete(id);  // Endpoint to delete complaint
    }
}
