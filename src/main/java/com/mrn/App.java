package com.mrn;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    private static final String PERSISTENCE_UNIT = "StudentUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

 //       Student student = new Student("Mitica", 62, "Str Rozmarin, Nr. 17D");
//        Person p1 = new Person("Kevin", "kevinat@gmail.com");
//        Person p2 = new Person("Joe", "joeat@yahoo.com");
//
//        entityManager.persist(p1);
//        entityManager.persist(p2);

        // Retrieving from db
//        Person p = entityManager.find(Person.class, 1);
//        System.out.println(p);
//
//        // Remove an entry from db
//        entityManager.remove(p);
//        entityManager.getTransaction().commit();

//        Person p1 = new Person("Me", 18);
//        Person p2 = new Person("U", 22);
//        Person p3 = new Person("Cio", 13);
//        Person p4 = new Person("All", 33);
//        Person p5 = new Person("Meri", 31);
//
//        entityManager.persist(p1);
//        entityManager.persist(p2);
//        entityManager.persist(p3);
//        entityManager.persist(p4);
//        entityManager.persist(p5);




        // entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
