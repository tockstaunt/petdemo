package com.keithcollier.petdemo.repositories;

import com.keithcollier.petdemo.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    Owner findByFirstName(String firstName);

}
