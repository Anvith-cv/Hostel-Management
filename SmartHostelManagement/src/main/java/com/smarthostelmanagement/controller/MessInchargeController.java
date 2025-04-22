package com.smarthostelmanagement.controller;

import com.smarthostelmanagement.model.MessIncharge;
import com.smarthostelmanagement.service.MessInchargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messincharge")
public class MessInchargeController {

    @Autowired
    private MessInchargeService messInchargeService;

    @GetMapping
    public List<MessIncharge> getAll() {
        return messInchargeService.getAll();
    }

    @GetMapping("/{id}")
    public MessIncharge getById(@PathVariable Long id) {
        return messInchargeService.getById(id);
    }

    @PostMapping
    public MessIncharge save(@RequestBody MessIncharge messIncharge) {  // Endpoint to save mess incharge
        return messInchargeService.save(messIncharge);
    }

    @PutMapping("/{id}")
    public MessIncharge update(@PathVariable Long id, @RequestBody MessIncharge messIncharge) {
        return messInchargeService.update(id, messIncharge);  // Endpoint to update mess incharge
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        messInchargeService.delete(id);  // Endpoint to delete mess incharge
    }
}
