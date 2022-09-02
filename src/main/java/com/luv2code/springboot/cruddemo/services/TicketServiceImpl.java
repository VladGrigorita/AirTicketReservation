package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Ticket;
import com.luv2code.springboot.cruddemo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Ticket findById(int id) {
        Optional<Ticket> result=ticketRepository.findById(id);
        Ticket ticket=null;
        ticket=result.get();
        return ticket;
    }

    @Override
    public void saveTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicketById(int id) {
        ticketRepository.deleteById(id);
    }
}
