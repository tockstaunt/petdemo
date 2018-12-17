package com.keithcollier.petdemo.service.map;

import com.keithcollier.petdemo.model.Owner;
import com.keithcollier.petdemo.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
this.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);

    }
}
