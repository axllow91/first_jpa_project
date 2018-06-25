package com.mrn.com.mrn.mapped;

import javax.persistence.*;

@Entity
@Table
public class StudentPerson extends AbstractStudentPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;

    public StudentPerson() {
    }

//    public StudentPerson(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + this.age;
    }
}
