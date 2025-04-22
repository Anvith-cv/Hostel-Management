package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Custom query methods (if needed) can be added here
}
