package com.mrn.jpa;

import javax.persistence.*;

@Entity
@Table(name="STUDENTS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String studentName;

    @Column(name = "age")
    private int studentAge;

    @Column(name="student_grade")
    private int grade;

    @Transient // Transient means that this field will not be stored in the db
    private String studentAddress;

    public Student() {
    }

    public Student(String name, int age, String address) {
        studentName = name;
        studentAge = age;
        studentAddress = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + studentName + '\'' +
                ", age=" + studentAge +
                '}';
    }
}
