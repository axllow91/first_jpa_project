package com.mrn.jpa;

import com.mrn.m.Bogdan;

import javax.persistence.*;

@Entity
@Table(name="PERSON")
// we are naming the query: when we are calling this person.getAll then
// the JPQL query will get executed
// @NamedQuery(name="person.getAll", query="SELECT p FROM Person p")
@NamedQueries({@NamedQuery(name="person.getAll", query="SELECT p FROM Person p"),
               @NamedQuery(name="person.betweenAges", query="SELECT p FROM Person p WHERE p.age BETWEEN 15 AND 30"),
               @NamedQuery(name="person.getPersonById", query="SELECT p FROM Person p WHERE p.id =: id")
              })
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Bogdan(name = "PETRE")
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
