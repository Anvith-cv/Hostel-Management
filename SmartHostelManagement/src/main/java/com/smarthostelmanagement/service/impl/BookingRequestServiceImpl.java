package com.smarthostelmanagement.service.impl;

import com.smarthostelmanagement.model.BookingRequest;
import com.smarthostelmanagement.repository.BookingRequestRepository;
import com.smarthostelmanagement.service.BookingRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingRequestServiceImpl implements BookingRequestService {

    @Autowired
    private BookingRequestRepository bookingRequestRepository;

    @Override
    public BookingRequest save(BookingRequest bookingRequest) {  // Renamed from create to save
        return bookingRequestRepository.save(bookingRequest);
    }

    @Override
    public BookingRequest update(Long id, BookingRequest updatedBookingRequest) {
        BookingRequest existing = bookingRequestRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setRequestedRoomId(updatedBookingRequest.getRequestedRoomId());
            existing.setStatus(updatedBookingRequest.getStatus());
            // Add other fields as per your model
            return bookingRequestRepository.save(existing);
        }
        return null;
    }

    @Override
    public List<BookingRequest> getAll() {
        return bookingRequestRepository.findAll();
    }

    @Override
    public BookingRequest getById(Long id) {
        return bookingRequestRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        bookingRequestRepository.deleteById(id);
    }
}
