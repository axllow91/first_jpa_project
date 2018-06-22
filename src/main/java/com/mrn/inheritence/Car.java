package com.mrn.inheritence;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id") // id from vehicle class
public class Car extends Vehicle {

    private int speed;

    public Car() {}

    public Car(int speed) {
        this.speed = speed;
    }

    public Car(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car name: " + name + "\nMax Speed: " + speed;
    }
}
