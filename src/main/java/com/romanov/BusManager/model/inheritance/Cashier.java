package com.romanov.BusManager.model.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CASHIER")
public class Cashier extends Employee {
    private int soldBilets;
    private double bonusPerBilet;

    public Cashier(){
    }

    public int getSoldBilets() {
        return soldBilets;
    }

    public void setSoldBilets(int soldBilets) {
        this.soldBilets = soldBilets;
    }

    public double getBonusPerBilet() {
        return bonusPerBilet;
    }

    public void setBonusPerBilet(double bonusPerBilet) {
        this.bonusPerBilet = bonusPerBilet;
    }
}
