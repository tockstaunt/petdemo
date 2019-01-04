package com.keithcollier.petdemo.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Specialties> specialties = new HashSet<>();

    public Set<Specialties> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialties> specialties) {
        this.specialties = specialties;
    }
}
