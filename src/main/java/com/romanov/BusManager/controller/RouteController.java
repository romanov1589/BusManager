package com.romanov.BusManager.controller;

import com.romanov.BusManager.model.Route;
import com.romanov.BusManager.model.Ticket;
import com.romanov.BusManager.repository.RouteRepository;
import com.romanov.BusManager.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RouteController {

    public Route route;

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping(value = "/routes")
    public String getRoutes(Model model) {
        List<Route> routes = routeRepository.findAll();
        model.addAttribute("routes", routes);
        return "routes";
    }

    @GetMapping(value = "/routes/{id}")
    public String sellTicketToRoute(@PathVariable("id") Integer id, Model model) {
        route = routeRepository.findByRouteId(id);
        model.addAttribute("ticket", new Ticket());
        return "sellTicket";
    }

    @RequestMapping(value = "/routes/saveticket")
    public String saveTicket(@ModelAttribute @Valid Ticket ticket, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "sellTicket";
        }
        ticket.setRoute(route);
        ticket.setStatus("sold");
        ticketRepository.save(ticket);
        return "redirect:/tickets";
    }

    @GetMapping(value = "/addroute")
    public String addRoute(Model model) {
        model.addAttribute("route", new Route());
        return "addRoute";
    }

    @PostMapping(value = "/saveroute")
    public String saveRoute(@ModelAttribute @Valid Route route, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "addroute";
        } else if (route.getMaxSeatsLimit() < route.getSeatsLeft()) {
            bindingResult.getFieldError("Error!");
            return "addroute";
        }
        routeRepository.save(route);
        return "redirect:/routes";

    }

    @GetMapping(value = "/deleteroute/{id}")
    public String removeRoute(@PathVariable("id") Integer id) {
        routeRepository.deleteById(id);
        return "redirect:/routes";
    }

    @GetMapping(value = "/deleteticket/{id}")
    public String removeTicket(@PathVariable("id") Integer id) {
        ticketRepository.deleteById(id);
        return "redirect:/tickets";
    }

    @GetMapping(value = "/routes/{id}/tickets")
    public String getTicketsByRoute(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("route", routeRepository.findByRouteId(id));
        model.addAttribute("tickets", routeRepository.findByRouteId(id).getTickets());
        return "routeTickets";
    }

}
