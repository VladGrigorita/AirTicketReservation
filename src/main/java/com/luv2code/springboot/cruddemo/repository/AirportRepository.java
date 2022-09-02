package com.luv2code.springboot.cruddemo.repository;

import com.luv2code.springboot.cruddemo.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport,Integer> {
}
