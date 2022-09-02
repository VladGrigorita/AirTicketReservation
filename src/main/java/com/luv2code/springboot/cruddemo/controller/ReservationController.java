package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.entity.Reservation;
import com.luv2code.springboot.cruddemo.entity.Ticket;
import com.luv2code.springboot.cruddemo.services.ReservationService;
import com.luv2code.springboot.cruddemo.services.TicketService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {


    private final ReservationService reservationService;

    private final TicketService ticketService;



    public ReservationController(ReservationService reservationService, TicketService ticketService) {
        this.reservationService = reservationService;
        this.ticketService = ticketService;
    }


    @PostMapping
    @Transactional
    public String save(@RequestBody Reservation reservation){
        reservationService.createReservation(reservation);
        updateAvailableTickets(reservation.getTicket().getId(),reservation.getQuantity());
        return "reservation created";
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteReservation(@PathVariable int id){
        reservationService.deleteReservationById(id);
    }

    private void updateAvailableTickets( int id, int bought_tickets){
        Ticket ticket= ticketService.findById(id);
        int available_tickets=ticket.getAvailableTickets();
        int remained_tickets=available_tickets-bought_tickets;
        ticket.setAvailableTickets(remained_tickets);
        ticketService.saveTicket(ticket);
    }

    @GetMapping(value = "/{id}")
    public Reservation getReservation(@PathVariable int id){
        Reservation reservation=reservationService.findReservationById(id);
        return reservation;
    }

}
