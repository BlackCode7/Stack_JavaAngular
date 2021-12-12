package com.blackcode.service;

import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcode.model.BookingModel;
import com.blackcode.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository bookingRepository;

	public int daysCalculatorWithDatabase(String name) {
		// TODO Auto-generated method stub
		Opitinal<BookingModel> bookingModelOptional = bookingRepository.findByReserveName(name);
		return Period.between(bookingModelOptional.get().getCkeckIn(), bookingModelOptional.get().getCkeckOut()).getDays();
	}

}
