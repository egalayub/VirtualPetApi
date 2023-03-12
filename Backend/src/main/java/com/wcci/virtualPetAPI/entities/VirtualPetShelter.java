package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@Entity
public class VirtualPetShelter {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany()
    final Set<VirtualOrganicPet> myOrganicShelter = new HashSet<>();
    @OneToMany()
    final Set<VirtualRoboticPet> myRoboticShelter = new HashSet<>();


//    Map<String, VirtualPet> myShelter = new HashMap<>();

//    public Collection<VirtualPet> availablePets() {
//        return myShelter.values();
//    }
////
////    public void addPet(VirtualPet adoptablePet) {
////        String petsAvailable = adoptablePet.getPetName();
////        myShelter.put(petsAvailable, adoptablePet);
////    }
////
////    public void removeOrganicPet(String upForAdoption) {
////        myShelter.remove(upForAdoption);
////
////    }


    //////
public void addPet(VirtualPet virtualPet) {
    virtualPet.put(virtualPet.getPetName(), virtualPet);

}

    public void addRoboticPet(VirtualRoboticPet adoptablePet) {
        String name = adoptablePet.getRoboticPetName();
        myRoboticShelter.add(adoptablePet);
    }

    public void removeRoboticPet(String adoptablePet) {
        myRoboticShelter.remove(adoptablePet);
    }


    public void addOrganicPet(VirtualOrganicPet adoptablePet) {
        String name = adoptablePet.getPetName();
        myOrganicShelter.add(adoptablePet);
    }

    public void removeOrganicPet(String adoptablePet) {
        myOrganicShelter.remove(adoptablePet);
    }


    ///////

    public Collection<VirtualRoboticPet> roboticPets() {
        return myRoboticShelter;
    }

    public Collection<VirtualOrganicPet> OrganicPets() {
        return myOrganicShelter;
    }


    public void showOrganicPets() {
        for (VirtualOrganicPet pet : myOrganicShelter) {
            System.out.println("Name: " + pet.getPetName()
                    + "\t| Type: " + pet.getPetName()
                    + "\t| Health: " + pet.getHealth()
                    + "\t| Happiness: " + pet.getHappiness()
                    + "\t| Hunger: " + pet.getHunger()
                    + "\t| Thirst: " + pet.getThirst()
                    + "\t| Waste Level: " + pet.getWasteLevel()
            );

        }


    }


    public void showAllRoboticPets() {
        for (VirtualRoboticPet pet : myRoboticShelter) {
            System.out.println("Name: " + pet.getPetName()
                    + "\t| Type: " + pet.getRoboticPetName()
                    + "\t| Health: " + pet.getRoboticPetHealth()
                    + "\t| Happiness: " + pet.happiness()
                    + "\t| Oil Level: " + pet.getOil()
                    + "\t| Maintenance Level: " + pet.batteryLife()

            );
        }
    }


    public void getPetStats(VirtualPet adoptablePet) {
        for (VirtualOrganicPet pet : myOrganicShelter) {
            System.out.println("Name : " +pet.getPetName() + "\t| Health " + pet.getHealth()
                    + "\t| Happiness: " + pet.getHappiness());
        }
    }

    public String getPetNamed(String petName) {
        return petName;
    }


    public void playPets() {
        for (VirtualOrganicPet pet : myOrganicShelter) {
            pet.play();
        }
    }

    public void feedPets() {
        for (VirtualOrganicPet pet : myOrganicShelter) {
            pet.feed();

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
//                roboticPet.getOil();
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