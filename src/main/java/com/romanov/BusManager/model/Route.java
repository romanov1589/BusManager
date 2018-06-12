package com.romanov.BusManager.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Route {
    private int routeId;
    @NotNull
    @Size(min = 2, max = 40, message = "Please fill out the field name. Field name should be between 2 and 40 string size")
    private String name;
    @NotNull
    @Pattern(regexp = "((?:19|20)\\d\\d)/(0?[1-9]|1[012])/([12][0-9]|3[01]|0?[1-9])", message = "Please fill out date field correctly YYYY/MM/DD")
    private String routeDate;
    private int maxSeatsLimit;
    private int seatsLeft;
    private Set<Ticket> tickets = new HashSet<>();

    public Route(String name, String routeDate, int maxSeatsLimit, int seatsLeft) {
        this.name = name;
        this.routeDate = routeDate;
        this.maxSeatsLimit = maxSeatsLimit;
        this.seatsLeft = seatsLeft;
    }

    public Route() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRouteDate() {
        return routeDate;
    }

    public void setRouteDate(String routeDate) {
        this.routeDate = routeDate;
    }

    public int getMaxSeatsLimit() {
        return maxSeatsLimit;
    }

    public void setMaxSeatsLimit(int maxSeatsLimit) {
        this.maxSeatsLimit = maxSeatsLimit;
    }

    public int getSeatsLeft() {
        return seatsLeft;
    }

    public void setSeatsLeft(int seatsLeft) {
        this.seatsLeft = seatsLeft;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "route")
    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
