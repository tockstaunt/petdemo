package com.keithcollier.petdemo.repositories;

import com.keithcollier.petdemo.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
