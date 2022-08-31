package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Ticket;
import com.luv2code.springboot.cruddemo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }


    @Override
    public void createTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> findAll(Specification<Ticket> spec) {
        return ticketRepository.findAll(spec);
    }
}
