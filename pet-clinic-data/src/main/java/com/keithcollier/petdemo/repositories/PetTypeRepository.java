package com.keithcollier.petdemo.repositories;

import com.keithcollier.petdemo.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
