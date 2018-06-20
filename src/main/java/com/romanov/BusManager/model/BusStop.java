package com.romanov.BusManager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class BusStop {
    private int busStopId;
    @Embedded
    private Address address;
    @JsonIgnore
    private Set<BusStopRoute> busStopRouteSet = new HashSet<>();

    public BusStop() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBusStopId() {
        return busStopId;
    }

    public void setBusStopId(int busStopId) {
        this.busStopId = busStopId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToMany(mappedBy = "busStop")
    public Set<BusStopRoute> getBusStopRouteSet() {
        return busStopRouteSet;
    }

    public void setBusStopRouteSet(Set<BusStopRoute> busStopRouteSet) {
        this.busStopRouteSet = busStopRouteSet;
    }
}
