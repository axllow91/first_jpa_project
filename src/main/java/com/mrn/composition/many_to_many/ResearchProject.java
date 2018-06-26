package com.mrn.composition.many_to_many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROJECTS")
public class ResearchProject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int projectId;

    @Column(name = "name")
    private String projectName;

    @ManyToMany
    @JoinTable(name = "PROF_PROJECTS",
            // joinColumns => he foreign key columns of the join table
            // which reference the primary table of the entity owning the association.
            // (I.e. the owning side of the association).
            joinColumns = @JoinColumn(name = "projectId"),
            // (Optional) The foreign key columns of the join table which reference the primary table of the entity
            // that does not own the association. (I.e. the inverse side of the association).
            inverseJoinColumns = @JoinColumn(name = "professorId")
            )
    private List<Professor> professors;

    public ResearchProject() {
        professors = new ArrayList<Professor>();
    }

    public ResearchProject(String projectName) {
        this();
        this.projectName = projectName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public void assignProfessorToProject(Professor professor) {
        this.professors.add(professor);
    }
}
