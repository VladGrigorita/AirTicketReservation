package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Airline;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class GenerateAirlines {
    private final AirlineService airlineService;

    public GenerateAirlines(AirlineService airlineService) {
        this.airlineService = airlineService;
    }


    @PostConstruct
    public void generate(){
        Airline GreenAir=new Airline(1,"GreenAir",5.00);
        airlineService.createAirline(GreenAir);
        Airline WizzAir=new Airline(2,"WizzAir",4.60);
        airlineService.createAirline(WizzAir);
        Airline BlueAir=new Airline(3,"BlueAir",4.00);
        airlineService.createAirline(BlueAir);
    }
}
