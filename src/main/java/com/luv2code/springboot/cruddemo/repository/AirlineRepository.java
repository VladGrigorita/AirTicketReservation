package com.luv2code.springboot.cruddemo.repository;

import com.luv2code.springboot.cruddemo.entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends JpaRepository<Airline,Integer> {


}
