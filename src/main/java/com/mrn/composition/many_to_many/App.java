package com.mrn.composition.many_to_many;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Professor prof1 = new Professor("Albert Einstein");
        Professor prof2 = new Professor("Stewen Hawking");

        ResearchProject rs1 = new ResearchProject("Black Hole");
        ResearchProject rs2 = new ResearchProject("Quantuum Field Theory");
        ResearchProject rs3 = new ResearchProject("Thermodynamic Fluctuations");

        prof1.assignProjectToProfessor(rs1);
        prof1.assignProjectToProfessor(rs2);

        prof2.assignProjectToProfessor(rs2);
        prof2.assignProjectToProfessor(rs3);

        rs1.assignProfessorToProject(prof1);
        rs2.assignProfessorToProject(prof1);
        rs2.assignProfessorToProject(prof2);
        rs3.assignProfessorToProject(prof2);

        entityManager.persist(prof1);
        entityManager.persist(prof2);

        entityManager.persist(rs1);
        entityManager.persist(rs2);
        entityManager.persist(rs3);

        // entityManager.remove(prof1);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
