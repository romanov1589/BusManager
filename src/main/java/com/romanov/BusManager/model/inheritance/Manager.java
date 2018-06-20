package com.romanov.BusManager.model.inheritance;

import org.springframework.boot.autoconfigure.data.neo4j.Neo4jProperties;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MANAGER")
public class Manager extends Employee {
    private double monthlySalaryBonus;

    public Manager(){

    }


    public double getMonthlySalaryBonus() {
        return monthlySalaryBonus;
    }

    public void setMonthlySalaryBonus(double monthlySalaryBonus) {
        this.monthlySalaryBonus = monthlySalaryBonus;
    }
}
