package com.wcci.virtualPetAPI.repositories;

import org.springframework.data.repository.CrudRepository;

public interface OrganicPet extends CrudRepository<OrganicPet,String> {
    void walk();

    void feed();
    void thirst();


}
