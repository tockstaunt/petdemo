package com.keithcollier.petdemo.service;


import com.keithcollier.petdemo.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByFirstName(String firstName);

}
