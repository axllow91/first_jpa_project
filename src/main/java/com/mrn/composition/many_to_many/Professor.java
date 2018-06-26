package com.mrn.composition.many_to_many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROFESSOR")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int professorId;

    @Column(name = "name")
    private String professorName;

    /*
    * Defines strategies for fetching data from the database.
    * The EAGER strategy is a requirement on the persistence provider runtime that data must be eagerly fetched.
    * The LAZY strategy is a hint to the persistence provider runtime that data should be fetched lazily when it is first accessed.
    * The implementation is permitted to eagerly fetch data for which the LAZY strategy hint has been specified.
    * */
    @ManyToMany(mappedBy = "professors", fetch = FetchType.LAZY, cascade = CascadeType.ALL) // FetchType.EAGER
    List<ResearchProject> projects;

    public Professor() {
        projects = new ArrayList<ResearchProject>();
    }

    public Professor(String professorName) {
        this();
        this.professorName = professorName;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public List<ResearchProject> getResearchProjectList() {
        return projects;
    }

    public void setResearchProjectList(List<ResearchProject> researchProjectList) {
        this.projects = researchProjectList;
    }

    public void assignProjectToProfessor(ResearchProject project) {
        this.projects.add(project);
    }
}
