package com.romanov.BusManager.controller;

import com.romanov.BusManager.model.Ticket;
import com.romanov.BusManager.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping(value = "/sellticket/{id}")
    public void sellTicket(@PathVariable("id") @RequestBody @Validated Ticket ticket) {
        ticketRepository.save(ticket);
    }
}
