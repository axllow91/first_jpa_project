package com.mrn.m;

import com.mrn.jpa.Person;

import java.lang.annotation.Annotation;


public class Main {
    public static void main(String[] args) {
        Annotation[] C = Person.class.getAnnotations();
        for (Annotation f : C)
            System.out.println(f.annotationType());

    }
}
