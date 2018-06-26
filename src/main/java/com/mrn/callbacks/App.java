package com.mrn.callbacks;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Article article
                 = new Article("Suka");


        entityManager.persist(article);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
