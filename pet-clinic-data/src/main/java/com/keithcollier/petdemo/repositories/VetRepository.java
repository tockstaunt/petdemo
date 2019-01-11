package com.keithcollier.petdemo.repositories;

import com.keithcollier.petdemo.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
