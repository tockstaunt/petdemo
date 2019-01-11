package com.keithcollier.petdemo.service.springdatajpa;


import com.keithcollier.petdemo.model.Owner;
import com.keithcollier.petdemo.repositories.OwnerRepository;
import com.keithcollier.petdemo.repositories.PetRepository;
import com.keithcollier.petdemo.repositories.PetTypeRepository;
import com.keithcollier.petdemo.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
@Profile(("springdatajpa"))
public class OwnerSDJpaService  implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository
            , PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByFirstName(String firstName) {
        return ownerRepository.findByFirstName(firstName);
    }


    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findByID(Long aLong) {

        return ownerRepository.findById(aLong).orElse(null);

    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {

        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {

        ownerRepository.deleteById(aLong);
    }
}
