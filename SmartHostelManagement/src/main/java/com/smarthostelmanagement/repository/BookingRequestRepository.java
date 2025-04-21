package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.BookingRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRequestRepository extends JpaRepository<BookingRequest, Long> {
    // Add custom query methods here if needed
}
