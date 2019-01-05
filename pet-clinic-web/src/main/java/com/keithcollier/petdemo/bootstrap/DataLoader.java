package com.keithcollier.petdemo.bootstrap;

import com.keithcollier.petdemo.model.*;
import com.keithcollier.petdemo.service.OwnerService;
import com.keithcollier.petdemo.service.PetTypeService;
import com.keithcollier.petdemo.service.SpecialtyService;
import com.keithcollier.petdemo.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService,
                      PetTypeService petTypeService, SpecialtyService specialtyService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0){
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedcCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescption("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        radiology.setDescption("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        radiology.setDescption("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Woentem");
        owner1.setLastName("foo");
        owner1.setAddress("fake address for Mr.foo");
        owner1.setCity("nowhere");
        owner1.setTelephone("000-000-0000");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(cat);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("two");
        owner2.setLastName("foo2");
        owner2.setAddress("fake address for Mr.foo2");
        owner2.setCity("nowhere");
        owner2.setTelephone("000-000-0000");

        Pet fionasDog = new Pet();
        fionasDog.setName("Dogo");
        fionasDog.setBirthDate(LocalDate.now());
        fionasDog.setOwner(owner2);
        fionasDog.setPetType(dog);
        owner2.getPets().add(fionasDog);

        ownerService.save(owner2);

        System.out.println("Loaded Owners.... ");

        Vet vet = new Vet();
        vet.setFirstName("Sams");
        vet.setLastName("Last Name");
        vet.getSpecialties().add(savedRadiology);
        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setFirstName("Vet 2");
        vet1.setLastName("last name 2");
        vet1.getSpecialties().add(savedDentistry);
        vetService.save(vet1);

        System.out.println("Loaded Vets....");
    }


}
