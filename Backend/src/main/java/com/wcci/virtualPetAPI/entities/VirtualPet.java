package com.wcci.virtualPetAPI.entities;

import java.util.Map;

public class VirtualPet {
    protected final String name;
    protected int happiness;
    protected int health;



    public VirtualPet(String name, int happiness, int health) {
        this.name = name;
        this.happiness = happiness;
        this.health = health;



    }


    // Getters
    public String getName() {
        return name;
    }

    public String getOrganicPetType() {
        return "Organic";
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }



    public void setHappiness(int happiness) {
        this.happiness = happiness;

    }

    public void setHealth(int health) {
        this.health = health;

    }

    public void play() {
        happiness += 10;
        health += 10;


        // add code here
    }

    public void feed() {
        happiness += 10;
        health += 10;


//        if (petHunger == 20) {
//            System.out.println("Please feed Pet before Health declines");
//        }
    }


    public void tick() {
        happiness -= 5;
        health -= 5;

    }

    public void petHappiness() {
        happiness -= 5;
        health -= 5;


    }

    public Map.Entry<String, VirtualPet>[] entrySet() {
        return new Map.Entry[0];
    }
}


