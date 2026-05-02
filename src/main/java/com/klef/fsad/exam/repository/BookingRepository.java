package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.exam.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> 
{
	
}