package com.keithcollier.petdemo.model;

import java.util.Set;

public class Vet extends Person {

    private Set<Specialties> specialties;

    public Set<Specialties> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialties> specialties) {
        this.specialties = specialties;
    }
}
