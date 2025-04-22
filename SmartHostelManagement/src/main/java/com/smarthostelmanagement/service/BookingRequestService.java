package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.BookingRequest;
import java.util.List;

public interface BookingRequestService {
    BookingRequest save(BookingRequest bookingRequest);  // Renamed from create to save
    BookingRequest update(Long id, BookingRequest bookingRequest);
    List<BookingRequest> getAll();
    BookingRequest getById(Long id);
    void delete(Long id);
}
