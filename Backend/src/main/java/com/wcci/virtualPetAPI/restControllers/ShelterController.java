package com.wcci.virtualPetAPI.restControllers;

import com.wcci.virtualPetAPI.entities.VirtualPetShelter;
import com.wcci.virtualPetAPI.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShelterController {
    private ShelterRepository shelterRepository;

    public ShelterController(final @Autowired ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    @GetMapping("/shelters")
    public Iterable<VirtualPetShelter> getShelters() {
        return shelterRepository.findAll();
    }
}


