package entities;

import repositories.OrganicPet;

public class VirtualOrganicPet extends VirtualPet implements OrganicPet {
    protected int hunger;
    protected int thirst;




    public VirtualOrganicPet(String name, int happiness, int health, int hunger, int thirst, int waste)/*, int oilLevel, int maintenanceLevel)*/ {
        super(name, happiness, health);

        this.thirst = thirst;
        this.hunger = hunger;



    }

    // Getters
  @Override
    public String getOrganicPetType() {
        return "Organic";
    }

    public int getPetThirst() {
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

     @Override
     public void thirst() {

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


    public int getPetHunger() {
        return hunger;
    }
}



