package com.romanov.BusManager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Ticket {

    private int ticketId;
    @NotNull
    @Size(min = 2, max = 40)
    private String arrivalBusStop;
    @NotNull
    @Size(min = 2, max = 40)
    private String departureBusStop;
    private double price;
    @NotNull
    @Size(min = 2, max = 40)
    private String clientFirstName;
    @NotNull
    @Size(min = 2, max = 40)
    private String clientLastName;
    @NotNull
    @Size(min = 2, max = 25)
    private String clientPhone;
    private String clientEmail;
    @NotNull
    @Size(min = 2, max = 9)
    private String status;

    public Ticket(String arrivalBusStop, String departureBusStop, double price,
                  String clientFirstName, String clientLastName, String clientPhone, String clientEmail, String status) {
        this.arrivalBusStop = arrivalBusStop;
        this.departureBusStop = departureBusStop;
        this.price = price;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.status = status;
    }

    public Ticket() {
    }
    @Id
    @GeneratedValue
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getArrivalBusStop() {
        return arrivalBusStop;
    }

    public void setArrivalBusStop(String arrivalBusStop) {
        this.arrivalBusStop = arrivalBusStop;
    }

    public String getDepartureBusStop() {
        return departureBusStop;
    }

    public void setDepartureBusStop(String departureBusStop) {
        this.departureBusStop = departureBusStop;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}