package com.mrn.composition;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS_TABLE")
public class Address {

    @Id
    @GeneratedValue
    private int addressId;

    @Column(name = "adress_name")
    private String addressName;

    @Column(name = "zip_code")
    private int zipCode;

    @OneToOne
    // this will insert new column inside the table
    // this has to be identical to the field present in the table that exists
    @JoinColumn(name = "employeeId")
    private Employee employee;

    public Address() {}

    public Address(String addressName, int zipCode) {
        this.addressName = addressName;
        this.zipCode = zipCode;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
