package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Ticket;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface TicketService {

    public void createTicket(Ticket ticket);

    public List<Ticket> findAll(Specification<Ticket> spec);

    public Ticket findById(int id);

    public void saveTicket(Ticket ticket);

    public void deleteTicketById(int id);
}
