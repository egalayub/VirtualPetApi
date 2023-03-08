package com.wcci.virtualPetAPI.restControllers;

import com.wcci.virtualPetAPI.entities.VirtualPet;
import com.wcci.virtualPetAPI.repositories.PetRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class cdPetController {
    final private PetRepository petRepository;

    public PetController (final @Autowired PetRepository petRepository){
        this.petRepository = petRepository;
    }
    @GetMapping ("/pets")
    public Iterable<VirtualPet> getPets (){
        return petRepository.findAll();
    }
}
