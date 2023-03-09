package com.wcci.virtualPetAPI.entities;

import org.springframework.data.repository.CrudRepository;

public interface RoboticPet  {

    void tick();

    int oil();
}
