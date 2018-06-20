package com.romanov.BusManager.controller;

import com.romanov.BusManager.model.Ticket;
import com.romanov.BusManager.repository.TicketRepository;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(
        name="Tickets API",
        description = "Provides a list of methods that manage tickets",
        stage= ApiStage.RC)
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;


    @GetMapping(value = "/tickets")
    @ApiMethod(description = "Getting all tickets")
    public String getTickets(Model model) {
        List<Ticket> tickets = ticketRepository.findAll();
        model.addAttribute("tickets", tickets);
        return "tickets";
    }

    @GetMapping(value = "/tickets/changestatus/{id}")
    @ApiMethod(description = "Changing ticket status")
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

    @GetMapping(value = "/deleteticket/{id}")
    @ApiMethod(description = "Deleting ticket by id")
    public String removeTicket(@PathVariable("id") Integer id) {
        ticketRepository.deleteById(id);
        return "redirect:/tickets";
    }
}
