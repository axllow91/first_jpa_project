package com.mrn.composition.one_to_one;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE_TABLE")
public class Employee {

    @Id
    @GeneratedValue
    private int employeeId;

    // naming this column in db with the given name
    @Column(name ="employee_name")
    private String employeeName;

    // relationship between tables
    // composition
    // mappedBy = (Optional) The field that owns the relationship.
    // This element is only specified on the inverse (non-owning) side of the association.
    // has to be the same with the instance variable created in address class
    // or this should match the new instance variable created in the other entity(Address class)
    // running this code with the mappedBy we will make sure that
    // we will have no duplicate information in the sense will not store an address into employee table
    // and an employee to the address table
    // (employeeId is the fk in address table)
    @OneToOne(mappedBy = "employee")
    private Address address;

    public Employee() {}

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
