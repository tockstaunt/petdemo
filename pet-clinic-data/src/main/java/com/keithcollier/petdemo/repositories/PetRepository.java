package com.keithcollier.petdemo.repositories;

import com.keithcollier.petdemo.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
