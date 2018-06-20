package com.romanov.BusManager.model;

import com.romanov.BusManager.model.inheritance.Employee;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bus {
    private int busId;
    @NotNull
    @Pattern(regexp = "^[A-Z]{3}[A-Z0-9]{14}$")
    private String regNumber;
    @NotNull
    @Size(min = 2, max = 40)
    private String type;
    @NotNull
    @Size(min = 2, max = 40)
    private String model;
    private String color;
    private int numberOfSeats;
    private Set<Route> routes = new HashSet<>();
    private Set<TechnicalInspection> technicalInspections = new HashSet<>();
    private Set<Employee> drivers = new HashSet<>();

    public Bus(int busId, String type, String model, String regNumber, String color, int numberOfSeats) {
        this.busId = busId;
        this.type = type;
        this.model = model;
        this.regNumber = regNumber;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

    public Bus() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @ManyToMany
    @JoinTable(
            name = "bus_route",
            joinColumns = {@JoinColumn(name = "bus_id")},
            inverseJoinColumns = {@JoinColumn(name = "route_id")}
    )
    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bus")
    public Set<TechnicalInspection> getTechnicalInspections() {
        return technicalInspections;
    }

    public void setTechnicalInspections(Set<TechnicalInspection> technicalInspections) {
        this.technicalInspections = technicalInspections;
    }

    @OneToMany(mappedBy = "bus")
    public Set<Employee> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Employee> drivers) {
        this.drivers = drivers;
    }
}
