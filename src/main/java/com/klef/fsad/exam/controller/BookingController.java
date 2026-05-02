package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.entity.Booking;
import com.klef.fsad.exam.service.BookingService;

@RestController
@RequestMapping("/booking")
@CrossOrigin("*")
public class BookingController 
{
    @Autowired
    private BookingService bookingService;

    @PostMapping("/add")
    public ResponseEntity<?> addBooking(@RequestBody Booking b)
    {
        Booking output = bookingService.addBooking(b);
        return ResponseEntity.status(200).body(output);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable Long id)
    {
        String output = bookingService.deleteBooking(id);
        return ResponseEntity.status(200).body(output);
    }
}