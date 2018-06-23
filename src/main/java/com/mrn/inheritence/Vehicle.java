package com.mrn.inheritence;

import javax.persistence.*;

@Entity
// jpa will create a vehicle table for us
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

    // Is protected because car will have a name, bus will have a name
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    protected String name;

    public Vehicle() {}

    public Vehicle(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
