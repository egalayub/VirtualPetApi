package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class VirtualOrganicPet extends VirtualPet implements OrganicPet{

    protected int hunger;
    protected int thirst;

    @ManyToOne
    public VirtualPetShelter shelter;

    public VirtualOrganicPet() {
        super();
    }

    public VirtualOrganicPet(String name, int happiness, int health, int hunger, int thirst, int waste)/*, int oilLevel, int maintenanceLevel)*/ {
        super(name, happiness, health);
        this.thirst = thirst;
        this.hunger = hunger;



    }

    // Getters
    public int getThirst() {
        return thirst;
    }

    public int getWasteLevel() {
        int petWaste = 20;
        return petWaste;
    }


    @Override
    public void feed() {
        super.feed();
    }


     public void setThirst(int thirst) {
        this.thirst = thirst;
     }



////    @Override
////    public void water() {
////        happiness += 5;
////        hunger -= 2;
////        health += 5;
////        thirst -=5;
//
//    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void walk() {
        happiness += 5;
        hunger -= 2;
        health += 5;
    }

    public void tick() {
        happiness -= 5;
        hunger += 2;
        health -= 5;
    }


    public int getHunger() {
        return hunger;
    }
}



