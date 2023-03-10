package com.wcci.virtualPetAPI.restControllers;

import com.wcci.virtualPetAPI.entities.*;
import com.wcci.virtualPetAPI.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.Id;
import java.util.Optional;

@RestController
public class PetController {
    final private PetRepository petRepository;

    public PetController(final @Autowired PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @GetMapping("/pets")
    public Iterable<VirtualPet> getAllPets() {
        return petRepository.findAll();
    }

    @GetMapping("/pets/{petId}")
    public VirtualPet getSinglePet(@PathVariable String petId) {
        return petRepository.findById(petId).get();
    }

    @DeleteMapping("/pets/{petId}")
    public void adoptPet(@PathVariable String petId) {
        Optional<VirtualPet> optionalVirtualPet = petRepository.findById(petId);
        optionalVirtualPet.ifPresentOrElse((VirtualPet) -> {
                    petRepository.delete(VirtualPet);
                },
                () -> {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cannot Adopt non existing pet" + petId);
                });
    }

    @PostMapping("/pets")
    public void admitPet(@RequestBody OrganicDog admitPet) {
        admitPet.getName();
        admitPet.getHappiness();
        admitPet.getHealth();
        admitPet.getThirst();
        admitPet.getWaste();
        petRepository.save(admitPet);
    }

    @PostMapping("/pets/{petId}/feed")
    public void feedOrganicDog(@PathVariable String petId) {
      VirtualPet organicDog= petRepository.findById(petId).get();
      organicDog.feed();
      petRepository.save(organicDog);
    }
    @PostMapping ("/pets/{petId}/play")
    public void playWithOrganicDog (@PathVariable String petId){
        VirtualPet organicDog = petRepository.findById(petId).get();
        organicDog.play();
        petRepository.save(organicDog);
    }
    @GetMapping ("/pets/{petId}/walk")
    public void WalkOrganicDog(@PathVariable String petId){
        OrganicDog organicDog = (OrganicDog) petRepository.findById(petId).get();
        organicDog.walk();
        petRepository.save(organicDog);
    }
    @GetMapping ("/pets/{petId}/stats")
    public void getOrganicDogStats (@PathVariable String petId){
        OrganicDog organicDog = (OrganicDog) petRepository.findById(petId).get();
        organicDog.getName();
        organicDog.getHappiness();
        organicDog.getHealth();
        organicDog.getWaste();
        organicDog.getHunger();
        petRepository.save(organicDog);
    }
}
