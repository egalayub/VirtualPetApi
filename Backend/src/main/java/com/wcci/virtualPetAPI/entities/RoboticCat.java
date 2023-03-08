package com.wcci.virtualPetAPI.entities;

import com.wcci.virtualPetAPI.repositories.RoboticPet;

import javax.persistence.Entity;

@Entity
public class RoboticCat extends VirtualRoboticPet implements RoboticPet {

    protected int batteryLife;


    public RoboticCat(String name, int happiness, int health, int oil, int batteryLife) {
        super(name, happiness, health, oil, batteryLife);
        this.batteryLife = batteryLife;

    }



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



