package com.luv2code.springboot.cruddemo.entity;


import javax.persistence.*;

@Entity
@Table(name="reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    private Ticket ticket;

    @Column(name="quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
