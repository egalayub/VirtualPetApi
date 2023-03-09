package com.wcci.virtualPetAPI.entities;

import org.springframework.data.repository.CrudRepository;

public interface OrganicPet  {
    void walk();

    void feed();
    void thirst();


}
