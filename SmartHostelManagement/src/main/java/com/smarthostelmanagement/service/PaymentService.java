package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.Payment;
import java.util.List;

public interface PaymentService {
    Payment save(Payment payment);  // Method to save payment
    Payment update(Long id, Payment payment);  // Method to update payment
    List<Payment> getAll();  // Method to get all payments
    Payment getById(Long id);  // Method to get payment by id
    void delete(Long id);  // Method to delete payment
}
