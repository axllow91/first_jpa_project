package com.mrn.com.mrn.mapped;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    private static final String PERSISTENCE_UNIT = "StudentUnit";

    public static void main(String[] args) {

        // EntityManagerFactory interface that -> Create and return an EntityManagerFactory for the named persistence unit.
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

        /*
        * An EntityManager instance is associated with a persistence context.
        * A persistence context is a set of entity instances in which for any
        * persistent entity identity there is a unique entity instance.
        * Within the persistence context, the entity instances and their lifecycle are managed.
        * The EntityManager API is used to create and remove persistent entity instances,
        * to find entities by their primary key, and to query over entities
        * */
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        StudentPerson studentPerson = new StudentPerson();
        studentPerson.setName("Marian");
        studentPerson.setAge(33);
        studentPerson.setDrivingLicense("B");

        entityManager.persist(studentPerson);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
