package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RoboticDog extends VirtualRoboticPet implements RoboticPet{

    protected int batteryLife;
    protected int oil;

    @OneToMany(mappedBy = "pets")
    public VirtualPetShelter shelter;

    public RoboticDog() {
        super();
    }

    public RoboticDog(String name, int happiness, int health, int oil, int batteryLife) {
        super(name, happiness, health, oil, batteryLife);
        this.batteryLife = batteryLife;
        this.oil = oil;

    }

    @Override
    public void tick() {
        batteryLife -= 5;
        oil -= 5;

    }

    @Override
    public int oil() {
        return 0;
    }

    @Override
    public int getOil() {
       return oil;
    }

}
