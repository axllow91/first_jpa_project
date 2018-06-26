package com.mrn.composition.one_to_many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int universityId;

    @Column(name = "name")
    private String universityName;

    @OneToMany(mappedBy = "university") // one reference the university and many reference students
    private List<Student> studentList;

    public University() {
        this.studentList = new ArrayList<Student>();
    }

    public University(String universityName) {
        // this() is calling the default constructor
        // because we need to avoid null pointer exception
        this();
        this.universityName = universityName;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    // helper method
    public void addStudent(Student student) {
        // adding new student
        studentList.add(student);
    }
}
