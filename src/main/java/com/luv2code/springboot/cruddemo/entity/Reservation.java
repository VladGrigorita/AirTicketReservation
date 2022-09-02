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
    @JoinColumn(name = "client_id") //de vazut ulterior daca trebuie folosit sau nu joincolumn
    private Client client;

    public Reservation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
