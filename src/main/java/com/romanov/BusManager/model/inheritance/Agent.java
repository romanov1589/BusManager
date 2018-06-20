package com.romanov.BusManager.model.inheritance;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@MappedSuperclass
public abstract class Agent {
    @NotNull
    @Size(min = 2, max = 40)
    private String agentName;
    private long numberOfBankAccount;
    @NotNull
    @Size(min = 2, max = 15)
    private String phoneNumber;
    @NotNull
    @Size(min = 2, max = 40)
    private String email;
    private double comissionFeeForTicket;

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public long getNumberOfBankAccount() {
        return numberOfBankAccount;
    }

    public void setNumberOfBankAccount(long numberOfBankAccount) {
        this.numberOfBankAccount = numberOfBankAccount;
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

    public double getComissionFeeForTicket() {
        return comissionFeeForTicket;
    }

    public void setComissionFeeForTicket(double comissionFeeForTicket) {
        this.comissionFeeForTicket = comissionFeeForTicket;
    }
}
