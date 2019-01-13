package com.keithcollier.petdemo.service.map;

import com.keithcollier.petdemo.model.Visit;
import com.keithcollier.petdemo.repositories.VisitRepository;
import com.keithcollier.petdemo.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    private final VisitRepository visitRepository;

    public VisitMapService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
    super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {

    return super.save(visit);
    }

    @Override
    public Visit findByID(Long aLong) {
        return super.findById(aLong);
    }
}
