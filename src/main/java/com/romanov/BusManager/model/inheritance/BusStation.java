package com.romanov.BusManager.model.inheritance;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class BusStation extends Agent {

    private int busStationId;
    private boolean parking;
    private List<String> busPlatforms;

    @JsonIgnore
    private Employee manager;

    public BusStation() {
    }

    public BusStation(boolean parking) {
        this.parking = parking;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBusStationId() {
        return busStationId;
    }

    public void setBusStationId(int busStationId) {
        this.busStationId = busStationId;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    @ElementCollection
    @CollectionTable(
            name = "BusPlatform",
            joinColumns = @JoinColumn(name = "busStationId")
    )
    public List<String> getBusPlatforms() {
        return busPlatforms;
    }

    public void setBusPlatforms(List<String> busPlatforms) {
        this.busPlatforms = busPlatforms;
    }

    @ManyToOne
    @JoinColumn(name ="fk_manager")
    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
