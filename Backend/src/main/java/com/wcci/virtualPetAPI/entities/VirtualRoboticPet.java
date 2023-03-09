package com.wcci.virtualPetAPI.entities;

import javax.persistence.*;

@Entity

public abstract class VirtualRoboticPet extends VirtualPet {


    @Id
    @GeneratedValue
    private Long id;
    protected String name;
    protected int happiness;
    protected int health;
    private int oil;
    private final int batteryLife;

    @ManyToOne
    public VirtualPetShelter shelter;


    public VirtualRoboticPet(String name, int happiness, int health, int oilLevel, int batteryLife) {
        super(name, happiness, health);
        this.name = name;
        this.happiness = happiness;
        this.health = health;
        this.oil = oil;
        this.batteryLife = batteryLife;
    }

    // Getters
    public String name() {
        return name;
    }

    public String getRoboticPetName() {
        return name;
    }

    public int happiness() {
        return happiness;
    }

    public int getOil() {
        return oil;
    }

    public int setOil() {

        return 0;
    }

    public int getRoboticPetHealth() {
        return health;
    }

    public int batteryLife() {
        return batteryLife;
    }

    public void play() {
        happiness += 10;

        if (oil <= 20) {
            System.out.println("Please getOil Robotic Pet before Health declines");
        }
    }

    public void tick() {
        happiness -= 20;
        health -= 10;


    }


}
