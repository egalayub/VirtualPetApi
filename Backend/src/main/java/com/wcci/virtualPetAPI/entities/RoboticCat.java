package com.wcci.virtualPetAPI.entities;

import com.wcci.virtualPetAPI.repositories.RoboticPetRepository;

import javax.persistence.*;

@Entity
public class RoboticCat extends VirtualRoboticPet implements RoboticPetRepository {

    @Id
    @GeneratedValue
    private Long id;
    protected int batteryLife;

    @OneToMany(mappedBy = "pets")
    public VirtualPetShelter shelter;

    public RoboticCat(String name, int happiness, int health, int oil, int batteryLife) {
        super(name, happiness, health, oil, batteryLife);
        this.batteryLife = batteryLife;

    }

    @Override
    public int batteryLife() {

        return batteryLife;
    }

    @Override
    public void tick() {
        batteryLife -= 5;

    }

    @Override
    public int oil() {
        return 0;
    }
}



