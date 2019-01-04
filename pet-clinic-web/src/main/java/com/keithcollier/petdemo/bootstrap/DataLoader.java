package com.keithcollier.petdemo.bootstrap;

import com.keithcollier.petdemo.model.Owner;
import com.keithcollier.petdemo.model.PetType;
import com.keithcollier.petdemo.model.Vet;
import com.keithcollier.petdemo.service.OwnerService;
import com.keithcollier.petdemo.service.PetTypeService;
import com.keithcollier.petdemo.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedcCatPetType = petTypeService.save(cat);

    Owner owner1 = new Owner();
    owner1.setFirstName("Woentem");
    owner1.setLastName("foo");

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("two");
    owner2.setLastName("foo2");

    ownerService.save(owner2);

    System.out.println("Loaded Owners.... ");

        Vet vet = new Vet();
        vet.setFirstName("Sams");
        vet.setLastName("Last Name");
        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setFirstName("Vet 2");
        vet1.setLastName("last name 2");
        vetService.save(vet1);

        System.out.println("Loaded Vets....");



    }


}
