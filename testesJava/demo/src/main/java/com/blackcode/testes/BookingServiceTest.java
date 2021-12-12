package com.blackcode.testes;

import java.time.LocalDate;

import org.graalvm.compiler.debug.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.blackcode.model.BookingModel;
import com.blackcode.repository.BookingRepository;
import com.blackcode.service.BookingService;

@RunWith(value=SpringRunner.class)
public class BookingServiceTest {
	
	// Esse bean é a instância de bookingService
	@TestConfiguration
	static class BookingServiceTestConfiguration{
		@Bean
		public BookingService bookingService() {
			return new BookingService();
		}
	}

	@Autowired
	BookingService bookingService;
	@MockBean
	BookingRepository bookingRepository;
	
	
	@Test
	public void bookingTestServiceDaysCalculator() {
		String name = "Anderson";
		int days = bookingService.daysCalculatorWithDatabase(name);
		
		Assertions.assertEquals(days, actual:10);
	}
	
	@Before
	public void setup() {
		LocalDate checkIn = LocalDate.parse("2021-10-10");
		LocalDate checkOut = LocalDate.parse("2021-10-20");
		BookingModel bookingModel = new BookingModel("1", "Anderson", checkIn, checkOut, numberGuests:2);
		
		Mockito.When(bookingRepository.findByReservename(bookingModel.getReserveName()))
			.thenReturn(java.util.Optional.of(bookingModel));
	}
	
	
}
