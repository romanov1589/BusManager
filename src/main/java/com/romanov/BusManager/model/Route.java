package com.romanov.BusManager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Route {
    private int routeId;
    @NotNull
    @Size(min = 2, max = 40)
    private String name;
    @NotNull
    private Date routeDate;
    private int maxSeatsLimit;
    private int seatsLeft;

    public Route(String name, Date routeDate, int maxSeatsLimit, int seatsLeft) {
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

    public Date getRouteDate() {
        return routeDate;
    }

    public void setRouteDate(Date routeDate) {
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
}
