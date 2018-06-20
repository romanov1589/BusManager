package com.romanov.BusManager.model.inheritance;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Distributor extends Agent {
    private int distributorId;

    @JsonIgnore
    private Employee manager;

    public Distributor() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(int distributorId) {
        this.distributorId = distributorId;
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
