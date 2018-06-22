package com.mrn.inheritence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
// this value will be passed in the vehicle by being a bus (b)
// in the database table
@DiscriminatorValue(value = "B")
public class Bus extends Vehicle {
    private int nrPasangers;

    public Bus() {}

    public Bus(String name, int nrPasangers) {
        super(name);
        this.nrPasangers = nrPasangers;
    }

    public int getNrPasangers() {
        return nrPasangers;
    }

    public void setNrPasangers(int nrPasangers) {
        this.nrPasangers = nrPasangers;
    }
}
