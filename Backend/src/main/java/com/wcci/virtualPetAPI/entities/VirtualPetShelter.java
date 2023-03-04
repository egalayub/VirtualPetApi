package com.wcci.virtualPetAPI.entities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

    Map<String, VirtualOrganicPet> myOrganicShelter = new HashMap<>();
    Map<String, VirtualRoboticPet> myRoboticShelter = new HashMap<>();


//    Map<String, VirtualPet> myShelter = new HashMap<>();

//    public Collection<VirtualPet> availablePets() {
//        return myShelter.values();
//    }
////
////    public void addPet(VirtualPet adoptablePet) {
////        String petsAvailable = adoptablePet.getName();
////        myShelter.put(petsAvailable, adoptablePet);
////    }
////
////    public void removeOrganicPet(String upForAdoption) {
////        myShelter.remove(upForAdoption);
////
////    }


    //////


    public void addRoboticPet(VirtualRoboticPet adoptablePet) {
        String petsAvailable = adoptablePet.getRoboticPetType();
        myRoboticShelter.put(petsAvailable, adoptablePet);
    }

    public void addOrganicPet(VirtualOrganicPet adoptablePet) {
        String petsAvailable = adoptablePet.getOrganicPetType();
        myOrganicShelter.put(petsAvailable, adoptablePet);
    }

    public void removeOrganicPet(String adoptablePet) {
        myOrganicShelter.remove( adoptablePet);
    }


    ///////

    public Collection<VirtualRoboticPet> availableRoboticPets() {
        return myRoboticShelter.values();
    }




    public void showOrganicPets() {
        for (Map.Entry<String, VirtualOrganicPet> entry : myOrganicShelter.entrySet()) {
            entry.getValue();
            System.out.println("Name: " + entry.getValue().getName()
                    + "\t| Type: " + entry.getValue().getOrganicPetType()
                    + "\t| Health: " + entry.getValue().getHealth()
                    + "\t| Happiness: " + entry.getValue().getHappiness()
                    + "\t| Hunger: " + entry.getValue().getPetHunger()
                    + "\t| Thirst: " + entry.getValue().getPetThirst()
                    + "\t| Waste Level: " + entry.getValue().getWasteLevel()
            );

        }


    }


    public void showAllRoboticPets() {
        for (Map.Entry<String, VirtualRoboticPet> entry : myRoboticShelter.entrySet()) {
            entry.getValue();
            System.out.println("Name: " + entry.getKey()
                    + "\t| Type: " + entry.getValue().getRoboticPetType()
                    + "\t| Health: " + entry.getValue().getRoboticPetHealth()
                    + "\t| Happiness: " + entry.getValue().happiness()
                    + "\t| Oil Level: " + entry.getValue().oil()
                    + "\t| Maintenance Level: " + entry.getValue().batteryLife()

            );
        }
    }



    public void getPetStats(VirtualPet adoptablePet) {
        for (Entry<String, VirtualOrganicPet> entry : myOrganicShelter.entrySet()) {
            entry.getValue();
            System.out.println("Name : " + entry.getKey() + "\t| Health " + entry.getValue().getHealth()
                    + "\t| Happiness: " + entry.getValue().getHappiness());
        }
    }

    public VirtualPet getPetNamed(String name) {
        return myOrganicShelter.get(name);
    }

    public void playPets(){
        for (Entry<String, VirtualOrganicPet> pet : myOrganicShelter.entrySet()){
            pet.getValue().play();
        }
    }
    public void feedPets(){
        for (Entry<String, VirtualOrganicPet> pet : myOrganicShelter.entrySet()){
            pet.getValue().feed();

        }

    }

//    public void feedPets() {
//        for (VirtualPet pet : availablePets()) {
//            if (pet instanceof OrganicPet) {
//                OrganicPet organicPet = (OrganicPet) pet;
//                organicPet.tick();
//            } else if (pet instanceof RoboticPet) {
//                RoboticPet roboticPet = (RoboticPet) pet;
//                roboticPet.tick();
//            }
//
//
//        }
//    }
//
//    public void tickAllPets(VirtualPet adoptablePet) {
//        for (VirtualPet pet : availablePets()) {
//            if (pet instanceof OrganicPet) {
//                OrganicPet organicPet = (OrganicPet) pet;
//                organicPet.water();
//            }
//
//        }
//
//    }
//
//    public void waterAllPets() {
//        for (VirtualPet pet : availablePets()) {
//            if (pet instanceof OrganicPet) {
//                OrganicPet organicPet = (OrganicPet) pet;
//                organicPet.water();
//            }
//        }
//    }
//
//    public void oilAllRobots() {
//        for (VirtualPet pet : availablePets()) {
//            if (pet instanceof RoboticPet) {
//                RoboticPet roboticPet = (RoboticPet) pet;
//                roboticPet.oil();
//            }
//        }
//    }
//
//    public boolean hasPets() {
//        return !myShelter.isEmpty();
//    }
//
//    public void cleanAllCages() {
//        for (VirtualPet pet : availablePets()) {
//            if (pet instanceof OrganicDog) {
//                OrganicDog organicDog = (OrganicDog) pet;
//                organicDog.cleanCages();
//            }
//        }
//    }
//
//    public void emptyLitterBox() {
//        for (VirtualPet pet : availablePets()) {
//            if (pet instanceof OrganicCat) {
//                OrganicCat organicCat = (OrganicCat) pet;
//                organicCat.emptyLitterBox();
//            }
//        }
//    }
//
//    public void walkDogs() {
//        for (VirtualPet pet : availablePets()) {
//            if (pet instanceof Dog) {
//                Dog aDog = (Dog) pet;
//                aDog.walk();
//            }
//        }
//    }

    public void showPetName(VirtualPet virtualPet) {
        for (Entry<String, VirtualPet> entry : virtualPet.entrySet()) {
            System.out.println(entry.getKey() + "\n");
        }
    }

    public void tickAllPets() {
    }

    public void oilAllRobots() {
    }

    public void walkDogs() {
    }

    public void emptyLitterBox() {
    }

    public void cleanAllCages() {

    }

    public boolean hasPets() {
        return false;
    }

    public void waterAllPets() {
    }
}