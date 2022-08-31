package com.luv2code.springboot.cruddemo;

import com.luv2code.springboot.cruddemo.controller.TicketController;
//import com.luv2code.springboot.cruddemo.services.ReservationServiceImpl;
import com.luv2code.springboot.cruddemo.entity.Ticket;
//import com.luv2code.springboot.cruddemo.services.ReservationServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
//		int id = 1;
//		int available_tickets = 100;
//		ReservationServiceImpl reservation = new ReservationServiceImpl();
//		reservation.updateTicket(id,available_tickets);

	}
}