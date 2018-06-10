package com.romanov.BusManager.controller;

import com.romanov.BusManager.model.Route;
import com.romanov.BusManager.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RouteController {

    @Autowired
    private RouteRepository routeRepository;

    @GetMapping(value = "/allroutes")
    public List<Route> getRoutes(){
        return routeRepository.findAll();
    }

    @GetMapping(value = "/allroutes/{id}")
    public Route getRoute(@PathVariable("id") Integer id){
        return routeRepository.findByRouteId(id);
    }
}
