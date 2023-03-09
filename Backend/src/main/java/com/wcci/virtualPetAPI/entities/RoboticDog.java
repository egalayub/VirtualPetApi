package com.wcci.virtualPetAPI.entities;

import com.wcci.virtualPetAPI.repositories.RoboticPet;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class RoboticDog extends VirtualRoboticPet implements RoboticPet {

    @Id
    @GeneratedValue
    private Long id;
    protected int batteryLife;
    protected int oil;

    @OneToMany(mappedBy = "/pets")
    public VirtualPetShelter shelter;

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
