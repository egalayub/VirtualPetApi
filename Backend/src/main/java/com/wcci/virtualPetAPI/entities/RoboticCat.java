package com.wcci.virtualPetAPI.entities;

import com.wcci.virtualPetAPI.repositories.RoboticPet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RoboticCat extends VirtualRoboticPet implements RoboticPet {

    @Id
    @GeneratedValue
    private Long id;
    protected int batteryLife;

    @ManyToOne
    public VirtualPet virtualPet;

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



