package com.wcci.virtualPetAPI.repositories;

import org.springframework.data.repository.CrudRepository;

public interface RoboticPet extends CrudRepository<RoboticPet, String> {

    void tick();

    int oil();
}
