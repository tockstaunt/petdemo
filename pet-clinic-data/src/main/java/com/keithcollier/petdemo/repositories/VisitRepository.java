package com.keithcollier.petdemo.repositories;

import com.keithcollier.petdemo.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
