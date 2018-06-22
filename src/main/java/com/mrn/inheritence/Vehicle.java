package com.mrn.inheritence;

import javax.persistence.*;

// This strategy is very efficient because will have no problems with inefficient memory
// we have no null variables
@Entity
@Table(name="VEHICLE")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public class Vehicle {

    // is protected because car will have a name, bus will have a name
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
