package com.mrn.jpa;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    private static final String PERSISTENCE_UNIT = "StudentUnit";

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

      Student student = new Student("Mitica", 62, "Str Rozmarin, Nr. 17D");
        //StudentPerson p1 = new StudentPerson("Kevin", "kevinat@gmail.com");
        //StudentPerson p2 = new StudentPerson("Joe", "joeat@yahoo.com");


        entityManager.persist(student);

        Session session = entityManager.unwrap(Session.class);
        Transaction trans = session.getTransaction();
        trans.begin();

        session.save(student);

        entityManager.unwrap(Session.class);
        entityManager.getTransaction().commit();

        // Retrieving from db
//        StudentPerson p = entityManager.find(StudentPerson.class, 1);
//        System.out.println(p);
//
//        // Remove an entry from db
//        entityManager.remove(p);
//        entityManager.getTransaction().commit();

//        StudentPerson p1 = new StudentPerson("Me", 18);
//        StudentPerson p2 = new StudentPerson("U", 22);
//        StudentPerson p3 = new StudentPerson("Cio", 13);
//        StudentPerson p4 = new StudentPerson("All", 33);
//        StudentPerson p5 = new StudentPerson("Meri", 31);
//
//        entityManager.persist(p1);
//        entityManager.persist(p2);
//        entityManager.persist(p3);
//        entityManager.persist(p4);
//        entityManager.persist(p5);

         // JPQL query
        // Query query = entityManager.createQuery("SELECT p FROM StudentPerson p ORDER BY p.age ASC");

        /*
        * Create an instance of Query for executing a native SQL statement, e.g., for update or delete.
        * If the query is not an update or delete query,
        * query execution will result in each row of the SQL result being returned as a result of type Object[]
        * (or a result of type Object if there is only one column in the select list.) */
        // SQL query
//        Query query = entityManager.createNativeQuery("SELECT * FROM person WHERE AGE BETWEEN 20 AND 30", StudentPerson.class);
//
//        List<StudentPerson> personList = (List<StudentPerson>) query.getResultList();
//
//        for(StudentPerson p: personList)
//            System.out.println(p);

        // ----------------------------------------------------------------//

        // Query query = entityManager.createNamedQuery("person.getAll");

        // or we can use TypedQuery
        // Interface used to control the execution of typed queries.
//        TypedQuery<StudentPerson> typedQuery = entityManager.createNamedQuery("person.getAll", StudentPerson.class);
//
//        // getResultList(): Execute a SELECT query and return the query results as a typed List
//        List<StudentPerson> personList = typedQuery.getResultList();
//
////        for(StudentPerson p : personList)
////            System.out.println(p);
////
////        // typed query for querying people between some ages
////        typedQuery = entityManager.createNamedQuery("person.betweenAges", StudentPerson.class);
////
////        // Execute a SELECT query and return the query results as a typed List
////        personList = typedQuery.getResultList();
////        for(StudentPerson p : personList)
////            System.out.println(p);
//
//        typedQuery = entityManager.createNamedQuery("person.getPersonById", StudentPerson.class);
//        typedQuery.setParameter("id", 1);
//
//        personList = typedQuery.getResultList();
//        for(StudentPerson p : personList)
//            System.out.println(p);

        entityManager.close();
        entityManagerFactory.close();

    }
}
