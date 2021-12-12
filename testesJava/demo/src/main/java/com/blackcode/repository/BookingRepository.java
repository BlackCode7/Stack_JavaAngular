package com.blackcode.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blackcode.model.BookingModel;

public interface BookingRepository extends JpaRepository<BookingModel, String> {
	Optional<BookingModel> findByReservename(String name);
}
