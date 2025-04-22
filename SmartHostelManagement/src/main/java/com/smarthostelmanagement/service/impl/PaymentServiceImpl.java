package com.smarthostelmanagement.service.impl;

import com.smarthostelmanagement.model.Payment;
import com.smarthostelmanagement.repository.PaymentRepository;
import com.smarthostelmanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Long id, Payment updatedPayment) {
        Payment existingPayment = paymentRepository.findById(id).orElse(null);
        if (existingPayment != null) {
            existingPayment.setAmount(updatedPayment.getAmount());
            existingPayment.setPaymentDate(updatedPayment.getPaymentDate());
            existingPayment.setPaymentMethod(updatedPayment.getPaymentMethod());
            // Update other fields as per the model
            return paymentRepository.save(existingPayment);
        }
        return null;
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        paymentRepository.deleteById(id);
    }
}
