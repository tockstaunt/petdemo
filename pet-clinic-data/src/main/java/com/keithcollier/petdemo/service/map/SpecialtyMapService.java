package com.keithcollier.petdemo.service.map;

import com.keithcollier.petdemo.model.Specialties;
import com.keithcollier.petdemo.service.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialties, Long> implements SpecialtyService {

    @Override
    public Set<Specialties> findAll() {
        return super.findAll();
    }

    @Override
    public Specialties findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialties save(Specialties object) {
        return super.save( object);
    }

    @Override
    public void delete(Specialties object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
