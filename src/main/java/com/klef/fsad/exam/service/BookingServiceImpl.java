package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.entity.Booking;
import com.klef.fsad.exam.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService 
{
    @Autowired
    private BookingRepository bookingRepository;

    public Booking addBooking(Booking booking)
    {
        return bookingRepository.save(booking);
    }

    public String deleteBooking(Long id)
    {
        bookingRepository.deleteById(id);
        return "Booking deleted successfully";
    }
}