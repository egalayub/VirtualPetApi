package com.wcci.virtualPetAPI.restControllers;

import com.wcci.virtualPetAPI.entities.RoboticDog;
import com.wcci.virtualPetAPI.entities.VirtualPet;
import com.wcci.virtualPetAPI.repositories.PetRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.security.PublicKey;
import java.util.Optional;

@RestController
public class cdPetController {
    final private PetRepository petRepository;

    public PetController (final @Autowired PetRepository petRepository){
        this.petRepository = petRepository;
    }
    @GetMapping ("/pets")
    public Iterable<VirtualPet> getAllPets (){
        return petRepository.findAll();
    }
    @GetMapping ("/pets/{petId}")
    public VirtualPet getSinglePet (@PathVariable String petId){
        return petRepository.findById(petId).get();
    }
    @DeleteMapping("pets/{petId}")
    public void adoptPet (@PathVariable String petId){
        Optional<VirtualPet> optionalVirtualPet = petRepository.findById(petId);
optionalVirtualPet .ifPresentOrElse((VirtualPet) -> {
    petRepository.delete(VirtualPet);
        },
        () -> {
    throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Cannot Adopt non existing pet" + petId);
        });
    }
    @PostMapping ("pets/{petId}")
    public void admitPet (@PathVariable String petId, @RequestBody RoboticDog admitPet){
      admitPet.getRoboticPetName();
      admitPet.getHappiness();
      admitPet.getHealth();
      admitPet.oil();
      admitPet.batteryLife();
      petRepository.save(admitPet);
    }

}
