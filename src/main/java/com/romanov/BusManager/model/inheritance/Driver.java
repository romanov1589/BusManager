package com.romanov.BusManager.model.inheritance;

import org.hibernate.annotations.CollectionType;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("DRIVER")
public class Driver extends Employee {


    private List<String> driverLicenceCategories;

    public Driver(){

    }

    @ElementCollection
    @CollectionTable(
            name = "DriverLicenceCategory",
            joinColumns = @JoinColumn(name = "employeeId")
    )
    public List<String> getDriverLicenceCategories() {
        return driverLicenceCategories;
    }

    public void setDriverLicenceCategories(List<String> driverLicenceCategories) {
        this.driverLicenceCategories = driverLicenceCategories;
    }
}
