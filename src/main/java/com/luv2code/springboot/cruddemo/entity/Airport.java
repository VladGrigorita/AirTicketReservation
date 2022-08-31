package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.*;

@Entity
@Table(name="airport")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;


    @Column(name = "capacity")
    private long capacity;

    public Airport(String country, String city, long capacity) {
        this.country = country;
        this.city = city;
        this.capacity = capacity;
    }

    public Airport() {

    }

    public int getAirport_id() {
        return id;
    }

    public void setAirport_id(int airport_id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
}
