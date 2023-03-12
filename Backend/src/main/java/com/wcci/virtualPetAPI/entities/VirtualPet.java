package com.wcci.virtualPetAPI.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class VirtualPet {

    @Id
    @GeneratedValue
    private Long id;

    protected String petName;
    protected int happiness;
    protected int health;

    @ManyToOne
    private VirtualPetShelter shelter;


    public VirtualPet() {
    }

    public VirtualPet(String petName, int happiness, int health) {
        this.petName = petName;
        this.happiness = happiness;
        this.health = health;



    }


    // Getters
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
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

    public void put(String petName, VirtualPet virtualPet) {
    }
}

