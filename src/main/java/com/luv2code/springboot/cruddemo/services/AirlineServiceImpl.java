package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Airline;
import com.luv2code.springboot.cruddemo.repository.AirlineRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class AirlineServiceImpl implements AirlineService{

    private final AirlineRepository airlineRepository;


    public AirlineServiceImpl(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }


    @Override
    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }

    @Override
    public void createAirline(Airline airline) {
        airlineRepository.save(airline);
    }

    @Override
    public void deleteAirlineById(int id) {
        airlineRepository.deleteById(id);
    }


}
