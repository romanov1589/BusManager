package com.romanov.BusManager.controller;

import com.romanov.BusManager.model.Bus;
import com.romanov.BusManager.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusController {

    @Autowired
    private BusRepository busRepository;

    @GetMapping("/buses")
    public List<Bus> getBuses(){
        List<Bus> buses = busRepository.findAll();
        return buses;
    }
}
