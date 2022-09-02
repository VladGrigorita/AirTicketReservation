package com.luv2code.springboot.cruddemo.entity;

import com.luv2code.springboot.cruddemo.repository.TicketRepository;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="available_tickets")
    private int availableTickets;


    @Column(name="distance")
    private double distance;

    @Column(name="price")
    private double price;

    @Column(name="co2_consumed")
    private double co2Consumed;

    @Column(name="airplane")
    private String airplane;

    @Column(name="departure_time")
    private Time departureTime;

    @Column(name="arrival_time")
    private Time arrivalTime;

    @Column(name="departure_date")
    private Date departureDate;

    @Column(name="arrival_date")
    private Date arrivalDate;

    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name="company_id")
    private Airline company;

    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name="departure_airport_id")
    private Airport departureAirport;

    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name="arrival_airport_id")
    private Airport arrivalAirport;

    public Ticket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public Airline getCompany() {
        return company;
    }

    public void setCompany(Airline company) {
        this.company = company;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCo2Consumed() {
        return co2Consumed;
    }

    public void setCo2Consumed(double co2Consumed) {
        this.co2Consumed = co2Consumed;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}







