package com.luv2code.springboot.cruddemo;

import com.luv2code.springboot.cruddemo.controller.AirlineController;
import com.luv2code.springboot.cruddemo.controller.TicketController;
//import com.luv2code.springboot.cruddemo.services.ReservationServiceImpl;
import com.luv2code.springboot.cruddemo.entity.Airline;
import com.luv2code.springboot.cruddemo.entity.Ticket;
//import com.luv2code.springboot.cruddemo.services.ReservationServiceImpl;
import com.luv2code.springboot.cruddemo.repository.AirlineRepository;
import com.luv2code.springboot.cruddemo.services.AirlineService;
import com.luv2code.springboot.cruddemo.services.AirlineServiceImpl;
import com.luv2code.springboot.cruddemo.services.GenerateAirlines;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);

	}



}
