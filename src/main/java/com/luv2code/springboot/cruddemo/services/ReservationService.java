package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Reservation;
import org.springframework.stereotype.Service;


public interface ReservationService {


    void createReservation(Reservation reservation);

    public void deleteReservationById(int id);

    public Reservation findReservationById(int id);
}
