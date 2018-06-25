package com.mrn.com.mrn.mapped;

import javax.persistence.MappedSuperclass;

// Designates a class whose mapping information is applied to the entities that inherit from it.
// A mapped superclass has no separate table defined for it.
// Mapping information may be overridden in such subclasses by using
// the AttributeOverride and AssociationOverride annotations or corresponding XML elements.
@MappedSuperclass
public class AbstractStudentPerson {

    // this field will be appended to the child class
    // because of the annotation @MappedSuperclass
    private String drivingLicense;

    public AbstractStudentPerson() {
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
