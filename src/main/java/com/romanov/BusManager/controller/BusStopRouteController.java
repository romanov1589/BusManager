package com.romanov.BusManager.controller;

import com.romanov.BusManager.model.BusStopRoute;
import com.romanov.BusManager.repository.BusStopRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusStopRouteController {

    @Autowired
    private BusStopRouteRepository busStopRouteRepository;

    @GetMapping("/routesbusstops")
    public List<BusStopRoute> getBusStopRoutes(){
        List<BusStopRoute> busStopRoutes = busStopRouteRepository.findAll();
        return busStopRoutes;
    }
}
