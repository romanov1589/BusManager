package com.romanov.BusManager.model.inheritance;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.romanov.BusManager.model.Bus;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "EMPLOYEE_TYPE")
public abstract class Employee {

    private int employeeId;
    @NotNull
    @Size(min = 2, max = 40)
    private String firstName;
    @NotNull
    @Size(min = 2, max = 40)
    private String lastName;
    @NotNull
    @Size(min = 2, max = 10)
    private String phoneNumber;
    @NotNull
    @Size(min = 2, max = 40)
    private String email;
    private double monthlySalary;

    Set<Distributor> distributors = new HashSet<>();
    Set<BusStation> busStations = new HashSet<>();
    @JsonIgnore
    private Bus bus;

    public Employee(String firstName, String lastName, String phoneNumber, String email, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.monthlySalary = monthlySalary;
    }

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @OneToMany(mappedBy = "manager")
    public Set<Distributor> getDistributors() {
        return distributors;
    }

    public void setDistributors(Set<Distributor> distributors) {
        this.distributors = distributors;
    }

    @OneToMany(mappedBy = "manager")
    public Set<BusStation> getBusStations() {
        return busStations;
    }

    public void setBusStations(Set<BusStation> busStations) {
        this.busStations = busStations;
    }

    @ManyToOne
    @JoinColumn(name ="fk_bus")
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
