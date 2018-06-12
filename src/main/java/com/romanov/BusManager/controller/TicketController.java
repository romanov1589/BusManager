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

}
