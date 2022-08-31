package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.entity.Airport;
import com.luv2code.springboot.cruddemo.services.AirportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airport")
public class AirportController {
    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping
    public List<Airport> getAll(){
        return airportService.getAllAirports();
    }

    @PostMapping
    public String save(@RequestBody Airport airport){
        airportService.createAirport(airport);
        return "airport created";
    }
}
