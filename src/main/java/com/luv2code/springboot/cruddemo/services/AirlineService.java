package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Airline;

import java.util.List;

public interface AirlineService {
    List<Airline> getAllAirlines();

    void createAirline(Airline airline);

    public void deleteAirlineById(int id);
}
