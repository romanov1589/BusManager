package com.romanov.BusManager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class TechnicalInspection {
    private int idTechnicalInspection;
    @NotNull
    @Pattern(regexp = "((?:19|20)\\d\\d)/(0?[1-9]|1[012])/([12][0-9]|3[01]|0?[1-9])")
    private Date dateOfCompletion;
    @NotNull
    @Pattern(regexp = "((?:19|20)\\d\\d)/(0?[1-9]|1[012])/([12][0-9]|3[01]|0?[1-9])")
    private Date endTerm;
    @JsonIgnore
    private Bus bus;

    public TechnicalInspection(Date dateOfCompletion, Date endTerm) {
        this.dateOfCompletion = dateOfCompletion;
        this.endTerm = endTerm;
    }

    public TechnicalInspection() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdTechnicalInspection() {
        return idTechnicalInspection;
    }

    public void setIdTechnicalInspection(int idTechnicalInspection) {
        this.idTechnicalInspection = idTechnicalInspection;
    }

    public Date getDateOfCompletion() {
        return dateOfCompletion;
    }

    public void setDateOfCompletion(Date dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }

    public Date getEndTerm() {
        return endTerm;
    }

    public void setEndTerm(Date endTerm) {
        this.endTerm = endTerm;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_bus")
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
