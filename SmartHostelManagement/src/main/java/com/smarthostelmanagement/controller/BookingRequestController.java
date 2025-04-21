package com.smarthostelmanagement.controller;

import com.smarthostelmanagement.model.BookingRequest;
import com.smarthostelmanagement.service.BookingRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookingrequests")
public class BookingRequestController {

    @Autowired
    private BookingRequestService bookingRequestService;

    @GetMapping
    public List<BookingRequest> getAll() {
        return bookingRequestService.getAll();
    }

    @GetMapping("/{id}")
    public BookingRequest getById(@PathVariable Long id) {
        return bookingRequestService.getById(id);
    }

    @PostMapping
    public BookingRequest create(@RequestBody BookingRequest bookingRequest) {
        return bookingRequestService.create(bookingRequest);
    }

    @PutMapping("/{id}")
    public BookingRequest update(@PathVariable Long id, @RequestBody BookingRequest bookingRequest) {
        return bookingRequestService.update(id, bookingRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookingRequestService.delete(id);
    }
}
