package com.mrn.inheritence;

import javax.persistence.*;

// This example is not so efficient
// because we will have a lot of null pointers
@Entity
@Table(name="VEHICLE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Vehicle {

    // is protected because car will have a name, bus will have a name
    protected String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

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
