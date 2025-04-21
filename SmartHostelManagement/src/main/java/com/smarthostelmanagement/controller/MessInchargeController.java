package com.smarthostelmanagement.controller;

import com.smarthostelmanagement.model.MessIncharge;
import com.smarthostelmanagement.service.MessInchargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messincharges")
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
    public MessIncharge create(@RequestBody MessIncharge messIncharge) {
        return messInchargeService.create(messIncharge);
    }

    @PutMapping("/{id}")
    public MessIncharge update(@PathVariable Long id, @RequestBody MessIncharge messIncharge) {
        return messInchargeService.update(id, messIncharge);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        messInchargeService.delete(id);
    }
}
