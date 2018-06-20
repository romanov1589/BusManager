package com.romanov.BusManager.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class BusStopRoute {
    private int busStopRouteId;
    @NotNull
    private Date departureTime;
    @NotNull
    private Date arrivalTime;

    private BusStop busStop;
    private Route route;

    public BusStopRoute(Date departureTime, Date arrivalTime) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public BusStopRoute() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBusStopRouteId() {
        return busStopRouteId;
    }

    public void setBusStopRouteId(int busStopRouteId) {
        this.busStopRouteId = busStopRouteId;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @ManyToOne
    @JoinColumn(name = "fk_bus_stop")
    public BusStop getBusStop() {
        return busStop;
    }

    public void setBusStop(BusStop busStop) {
        this.busStop = busStop;
    }

    @ManyToOne
    @JoinColumn(name = "fk_route")
    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
