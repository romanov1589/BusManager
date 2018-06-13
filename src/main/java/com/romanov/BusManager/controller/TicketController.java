package com.romanov.BusManager.controller;

import com.romanov.BusManager.model.Ticket;
import com.romanov.BusManager.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;


    @GetMapping(value = "/tickets")
    public String getTickets(Model model) {
        List<Ticket> tickets = ticketRepository.findAll();
        model.addAttribute("tickets", tickets);
        return "tickets";
    }

    @GetMapping(value = "/tickets/changestatus/{id}")
    public String changeTicketStatus(@PathVariable("id") Integer id) {
        Ticket ticket = ticketRepository.findTicketByTicketId(id);
        if (ticket.getStatus().equals("sold")) {
            ticket.setStatus("cancelled");
        } else if (ticket.getStatus().equals("cancelled")) {
            ticket.setStatus("sold");
        }
        ticketRepository.save(ticket);
        return "redirect:/tickets";
    }
}
