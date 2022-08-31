package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Airport;

import java.util.List;

public interface AirportService {

    List<Airport> getAllAirports();

    void createAirport(Airport airport);
}
