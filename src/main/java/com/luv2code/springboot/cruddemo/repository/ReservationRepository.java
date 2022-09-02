package com.luv2code.springboot.cruddemo.repository;

import com.luv2code.springboot.cruddemo.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
