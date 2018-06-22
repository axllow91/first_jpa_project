package com.mrn.inheritence;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
// this value will be passed in the vehicle by being a bus (b)
// in the database table
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Bus extends Vehicle {
    private int nrPasengers;

    public Bus() {}

    public Bus(String name, int nrPasengers) {
        super(name);
        this.nrPasengers = nrPasengers;
    }

    public int getNrPasengers() {
        return nrPasengers;
    }

    public void setNrPasengers(int nrPasangers) {
        this.nrPasengers = nrPasangers;
    }
}
