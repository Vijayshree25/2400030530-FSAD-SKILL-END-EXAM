package com.klef.fsad.exam.service;

import com.klef.fsad.exam.entity.Booking;

public interface BookingService 
{
    public Booking addBooking(Booking booking);

    public String deleteBooking(Long id);
}