package com.mrn.composition.one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        University university = new University("UPIT");

        Student s1 = new Student("Joe Smith");
        s1.setUniversity(university);
        Student s2 = new Student("Mick Pick");
        s2.setUniversity(university);

        university.addStudent(s1);
        university.addStudent(s2);

        entityManager.persist(university);
        entityManager.persist(s1);
        entityManager.persist(s2);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
