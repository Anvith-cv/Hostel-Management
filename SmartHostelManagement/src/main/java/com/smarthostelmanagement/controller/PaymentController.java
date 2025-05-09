package com.smarthostelmanagement.controller;

import com.smarthostelmanagement.model.Payment;
import com.smarthostelmanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<Payment> getAll() {
        return paymentService.getAll();
    }

    @GetMapping("/{id}")
    public Payment getById(@PathVariable Long id) {
        return paymentService.getById(id);
    }

    @PostMapping
    public Payment save(@RequestBody Payment payment) {  // Endpoint to save payment
        return paymentService.save(payment);
    }

    @PutMapping("/{id}")
    public Payment update(@PathVariable Long id, @RequestBody Payment payment) {
        return paymentService.update(id, payment);  // Endpoint to update payment
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        paymentService.delete(id);  // Endpoint to delete payment
    }
}
