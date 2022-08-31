package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.entity.Airline;
import com.luv2code.springboot.cruddemo.services.AirlineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airline")
public class AirlineController {
    private final AirlineService airlineService;

    public AirlineController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }

    @GetMapping
    public List<Airline> getAll(){
        return airlineService.getAllAirlines();
    }

    @PostMapping
    public String save(@RequestBody Airline airline){
        airlineService.createAirline(airline);
        return "airline created";
    }
}
