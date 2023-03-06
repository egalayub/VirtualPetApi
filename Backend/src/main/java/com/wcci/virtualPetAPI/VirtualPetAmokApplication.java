package com.wcci.virtualPetAPI;

import com.wcci.virtualPetAPI.entities.*;


import java.util.Scanner;

public class VirtualPetAmokApplication {
    public static void main(String[] args) {

        VirtualOrganicPet pet = new OrganicDog("Oscar   Dog", 10, 10, 10, 10, 10);
        VirtualOrganicPet pet3 = new OrganicCat("Raymond   Cat", 10, 10, 20, 15, 10);
        VirtualRoboticPet pet2 = new RoboticDog("Wrigley   Dog", 10, 10, 20, 10);
        VirtualRoboticPet pet4 = new RoboticCat("Whiskers   Cat", 10, 10, 10, 10);
        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.addOrganicPet(pet);
        myShelter.addOrganicPet(pet3);
        myShelter.addRoboticPet(pet2);
        myShelter.addRoboticPet(pet4);


        Scanner input = new Scanner(System.in);
        boolean run = true;

        System.out.println();
        System.out.println();
        myShelter.tickAllPets();
        myShelter.tickAllPets();
        myShelter.showOrganicPets();
        myShelter.showAllRoboticPets();
        System.out.println();
        System.out.println();
        System.out.println("Welcome to Playful pet looking for parents");

        String showMenu = """

                \t	Please choose an option:\s

                \t  1. Feed organic pet
                \t  2. Water organic pet
                \t  3. Clean the dog and cat cages.
                \t  4. Clean the litter box.
                \t  5. Walk the dogs.
                \t  6. Oil Robotic Pets.\s
                \t  7. Adopt a pet
                \t  8. Admit a pet
                \t  9. Play with a pet\s
                \t 10. Show pet in shelter
                \t 11. Quit""";

        System.out.println(showMenu);

        int userChoice;
        // while (myOrganicShelter.hasPets()) {
        do {

            userChoice = input.nextInt();
            switch (userChoice) {
                //feeding all organic animals.
                case 1 -> {
                    myShelter.tickAllPets();
                    myShelter.showOrganicPets();
                    myShelter.showOrganicPets();
                    myShelter.feedPets();
                    System.out.println();
                    System.out.println("You feed all organic pets");
                    System.out.println();
                    System.out.println(showMenu);

                }
                //water organic pet
                case 2 -> {
                    myShelter.tickAllPets();
                    myShelter.showOrganicPets();
                    myShelter.waterAllPets();
                    System.out.println();
                    System.out.println("You watered all organic pet");
                    System.out.println(showMenu);
                }
                //Clean all dogs cages.
                case 3 -> {
                    myShelter.tickAllPets();
                    myShelter.showOrganicPets();
                    myShelter.cleanAllCages();
                    System.out.println();
                    System.out.println("Organic Dog and Cat cage cleaned");
                    System.out.println(showMenu);
                }

                case 4-> {

                    myShelter.tickAllPets();
                    myShelter.tickAllPets();
                    myShelter.showOrganicPets();
                    myShelter.showAllRoboticPets();
                    myShelter.emptyLitterBox();
                    System.out.println();
                    System.out.println("LitterBox Cleaned");
                    System.out.println();
                    System.out.println("Litter has been replaced in cats litter box.");
                    System.out.println(showMenu);
                }
                //Walk all dogs.
                case 5 -> {
                    myShelter.tickAllPets();
                    myShelter.tickAllPets();
                    myShelter.showOrganicPets();
                    myShelter.showAllRoboticPets();
                    myShelter.walkDogs();
                    System.out.println();
                    System.out.println("All dogs have been walked");
                    System.out.println();
                    System.out.println(showMenu);
                }
                //Oil all Robotic Pets
                case 6 -> {

                    myShelter.tickAllPets();
                    myShelter.tickAllPets();
                    myShelter.showOrganicPets();
                    myShelter.showAllRoboticPets();
                    System.out.println();
                    System.out.println("All robotic pet parts have been oiled");
                    System.out.println();
                    System.out.println(showMenu);

                }
                //Pet adoption.
                case 7 -> {
                    myShelter.tickAllPets();
                    myShelter.tickAllPets();
                    myShelter.showOrganicPets();
                    myShelter.showAllRoboticPets();
                    System.out.println();
                    System.out.println("Would you like to adopt one of the pet?");
                    String upForAdoptions = input.nextLine();
                    myShelter.removeOrganicPet(upForAdoptions);
                    myShelter.removeOrganicPet(upForAdoptions);
                    System.out.println("Pet has been adopted" + upForAdoptions);
                    System.out.println();

                }
                //Add a pet.
                case 8 -> {
                    myShelter.tickAllPets();
                    myShelter.tickAllPets();
                    myShelter.showOrganicPets();
                    myShelter.showAllRoboticPets();;
                    System.out.println(
                            "Do you have a: \n\t A. Organic Dog \n\t B. Organic Cat \n\t C. Robotic Dog \n\t D. Robotic Cat");
                    String petType = input.nextLine();
                    switch (petType.toUpperCase()) {
                        // Add organic dog.
                        case "A" -> {
                            System.out.println("Name the Dog");
                            String organicDogName = input.nextLine();
                            VirtualOrganicPet newOrganicDog = new OrganicDog(organicDogName, 10, 10, 10, 10, 10);
                            myShelter.addOrganicPet(newOrganicDog);
                        }

                        // Add organic cat.
                        case "B" -> {
                            System.out.println("Please name the new cat: ");
                            String organicCatName = input.nextLine();
                            VirtualOrganicPet newOrganicCat = new OrganicCat(organicCatName, 10, 10, 0, 0, 0);
                            myShelter.addOrganicPet(newOrganicCat);
                        }
                        // Add robotic dog.
                        case "C" -> {
                            System.out.println("Please name the new robotic dog: ");
                            String roboticDogName = input.nextLine();
                            VirtualRoboticPet newRoboticDog = new RoboticDog(roboticDogName, 10, 10, 0, 10);
                            myShelter.addRoboticPet(newRoboticDog);
                        }
                        // Add robotic cat.
                        case "D" -> {
                            System.out.println("Please name the new robotic cat: ");
                            String roboticCatName = input.nextLine();
                            VirtualRoboticPet newRoboticCat = new RoboticCat(roboticCatName, 10, 10, 10, 10);
                            myShelter.addRoboticPet(newRoboticCat);
                        }
                    }
//                    System.out.println("Congratulations! You've got a new pet!");
//                    System.out.println(showMenu);
                }

                // play wit pet
                case 9 -> {
                    myShelter.tickAllPets();
                    myShelter.tickAllPets();
                    System.out.println("Which pet would you like to play with?");
                    System.out.println();
                    myShelter.showOrganicPets();
                    myShelter.showAllRoboticPets();
                    String chosenPet = input.nextLine();
                    VirtualPet playPet = myShelter.getPetNamed(chosenPet);
                    playPet.play();
                    System.out.println(chosenPet + " had a great time!");
                }

                case 10 -> {
                    myShelter.tickAllPets();
                    myShelter.tickAllPets();
                    System.out.println("These are the pet in the shelter: ");
                    myShelter.showOrganicPets();
                    myShelter.showAllRoboticPets();

                }

                // System.out.println(myOrganicShelter.showOrganicPets(playPet);
                case 11-> {
                    System.out.println("See you next time!");
                    run = false;
                }
                default -> System.out.println("error, Try again.");
            }

            myShelter.tickAllPets();
            myShelter.tickAllPets();

        } while (run);
        // //(!myOrganicShelter.hasPets()) ;

        input.close();


    }
}
