package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @OneToOne(cascade = {CascadeType.REFRESH})
    private User user;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservationsList;

    public Client(int id, String firstName, String lastName, User user, List<Reservation> reservationsList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.user = user;
        this.reservationsList = reservationsList;
    }

    public Client() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Reservation> getReservationsList() {
        return reservationsList;
    }

    public void setReservationsList(List<Reservation> reservationsList) {
        this.reservationsList = reservationsList;
    }
}
