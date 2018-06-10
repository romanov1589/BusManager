package com.romanov.BusManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebController {

    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }

    @GetMapping("/routes")
    public String getRoutesPage(){
        return "routes";
    }

    @GetMapping("/sellticket/{id}")
    public String getSellTicketPage(@PathVariable("id") Integer id){
        return "sellTicket";
    }

//    @GetMapping("/sellticket")
//    public String getSellTicketPage(){
//        return "sellTicket";
//    }
}
