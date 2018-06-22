package com.mrn.inheritence;

import javax.persistence.Entity;

@Entity
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
