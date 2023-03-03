package com.wcci.virtualPetAPI.entities;

import com.wcci.virtualPetAPI.repositories.RoboticPet;

public class RoboticCat extends VirtualRoboticPet implements RoboticPet {

    protected int batteryLife;
    protected int oil;


    public RoboticCat(String name, int happiness, int health, int oil, int batteryLife) {
        super(name, happiness, health, oil, batteryLife);
        this.batteryLife = batteryLife;
        this.oil = oil;

    }


    public int oil() {
        return  oil;
    }

    public int batteryLife() {

        return batteryLife;
    }

    @Override
    public void tick() {
        batteryLife -= 5;
        oil -= 5;

    }
}

    

