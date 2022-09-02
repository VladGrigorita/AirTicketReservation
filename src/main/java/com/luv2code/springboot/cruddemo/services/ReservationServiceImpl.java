package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Reservation;
import com.luv2code.springboot.cruddemo.entity.Ticket;
import com.luv2code.springboot.cruddemo.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void createReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservationById(int id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation findReservationById(int id) {
        Optional<Reservation> result=reservationRepository.findById(id);
        Reservation reservation=null;
        reservation=result.get();
        return reservation;
    }
}
