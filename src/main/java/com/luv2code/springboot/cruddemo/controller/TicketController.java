package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.repository.TicketRepository;
import com.luv2code.springboot.cruddemo.entity.Ticket;
import com.luv2code.springboot.cruddemo.search.TicketSpecificationsBuilder;
//import com.luv2code.springboot.cruddemo.services.ReservationServiceImpl;
import com.luv2code.springboot.cruddemo.services.TicketService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    private final TicketService ticketService;
    private final TicketRepository ticketRepository;

    public TicketController(TicketService ticketService, TicketRepository ticketRepository) {
        this.ticketService = ticketService;
        this.ticketRepository = ticketRepository;
    }

    @PostMapping
    public String save(@RequestBody Ticket ticket){
        ticketService.createTicket(ticket);
        return "ticket created";
    }

    @GetMapping
    public List<Ticket> search(@RequestParam(value = "search") String search) {
        TicketSpecificationsBuilder builder = new TicketSpecificationsBuilder();
        Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
        Matcher matcher = pattern.matcher(search + ",");
        while (matcher.find()) {
            builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
        }

        Specification<Ticket> spec = builder.build();
        return ticketRepository.findAll(spec);
//        return ticketService.findAll(spec);
    }


}
