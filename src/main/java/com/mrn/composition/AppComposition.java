package com.mrn.composition;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppComposition {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Address address = new Address("Str. Rozmarin", 1234);

        Employee emp1 = new Employee();
        emp1.setEmployeeName("John F");
        emp1.setAddress(address);

        entityManager.persist(emp1);
        entityManager.persist(address);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
