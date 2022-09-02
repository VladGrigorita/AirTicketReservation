package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Airport;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class GenerateAirports {

    private final AirportService airportService;

    public GenerateAirports(AirportService airportService) {
        this.airportService = airportService;
    }

    @PostConstruct
    public void generate(){
        Airport IasiAirport=new Airport(1,"Romania","Iasi",100000);
        airportService.createAirport(IasiAirport);
        Airport BucurestiAirport=new Airport(2,"Romania","Bucuresti",200000);
        airportService.createAirport(BucurestiAirport);
        Airport BudapestAirport=new Airport(3,"Hungary","Budapest",500000);
        airportService.createAirport(BudapestAirport);
    }
}
