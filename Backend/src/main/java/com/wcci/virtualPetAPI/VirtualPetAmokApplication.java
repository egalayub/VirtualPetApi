package com.wcci.virtualPetAPI;

import java.util.Scanner;

public class VirtualPetAmokApplication {
    public static void main(String[] args) {

        VirtualOrganicPet pet = new OrganicDog("Oscar ", 10, 10, 10, 10, 10);
        VirtualPetShelter myOrganicShelter = new VirtualPetShelter();
        myOrganicShelter.addOrganicPet(pet);

        VirtualRoboticPet pet2 = new RoboticDog("Wrigley ", 10, 10, 20, 10);
        VirtualPetShelter myRoboticShelter = new VirtualPetShelter();
        myRoboticShelter.addRoboticPet(pet2);

        VirtualOrganicPet pet3 = new OrganicCat("Raymond ", 10, 10, 20, 15, 10) ;
        VirtualPetShelter myOrganicShelter2 = new VirtualPetShelter();
        myOrganicShelter.addOrganicPet(pet3);

        VirtualRoboticPet pet4 = new RoboticCat("Whiskers ", 10, 10, 10, 10);
        VirtualPetShelter myRoboticShelter2 = new VirtualPetShelter();
        myRoboticShelter2.addRoboticPet(pet4);

        Scanner input = new Scanner(System.in);
        boolean run = true;

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

        String userChoice;
        // while (myOrganicShelter.hasPets()) {
        do {
            System.out.println(showMenu);
            userChoice = input.nextLine();
            switch (userChoice) {
                //feeding all organic animals.
                case "1" -> {
                    myOrganicShelter.tickAllPets(pet);
                    myOrganicShelter2.tickAllPets(pet3);
                    myOrganicShelter2.showOrganicPets();
                    myOrganicShelter.feedPets();
                    System.out.println();
                    System.out.println("You feed all organic pet");
                }
                //water organic pet
                case "2" -> {
                    myOrganicShelter2.tickAllPets(pet);
                    myOrganicShelter2.tickAllPets(pet3);
                    myOrganicShelter2.showOrganicPets();
                    myOrganicShelter2.showOrganicPets();
                    myOrganicShelter.waterAllPets();
                    System.out.println("You watered all organic pet");
                }
                //Clean all dogs cages.
                case "3" -> {
                    myOrganicShelter.tickAllPets(pet);
                    myOrganicShelter.tickAllPets(pet3);
                    myOrganicShelter.showOrganicPets();
                    myOrganicShelter.cleanAllCages();
                    System.out.println("Organic Dog and Cat cage cleaned");
                }
                case "4" -> {
                    myOrganicShelter2.tickAllPets(pet);
                    myOrganicShelter2.showOrganicPets();
                    myOrganicShelter2.emptyLitterBox();
                    System.out.println();
                    System.out.println("LitterBox Cleaned ");
                    System.out.println("Litter has been replaced in cats litter box. ");
                }
                //Walk all dogs.
                case "5" -> {
                    myOrganicShelter2.tickAllPets(pet);
                    myOrganicShelter2.showOrganicPets();
                    myRoboticShelter.showAllRoboticPets();
                    myOrganicShelter.showOrganicPets();
                    myRoboticShelter2.showAllRoboticPets();
                    myOrganicShelter2.walkDogs();
                    System.out.println("All organic and robotic pet have been walked ");
                }
                //Oil all Robotic Pets
                case "6" -> {
                    myOrganicShelter2.showOrganicPets();
                    myRoboticShelter.showAllRoboticPets();
                    myRoboticShelter2.showAllRoboticPets();
                    myOrganicShelter.tickAllPets(pet);
                    myOrganicShelter.tickAllPets(pet3);
                    myOrganicShelter.oilAllRobots();
                    System.out.println();
                    System.out.println("All robotic pet parts have been oiled ");
                }
                //Pet adoption.
                case "7" -> {
                    myOrganicShelter.tickAllPets(pet);
                    myOrganicShelter2.tickAllPets(pet3);
                    myOrganicShelter.showOrganicPets();
                    System.out.println("Would you like to adopt one of the pet? ");
                    String upForAdoptions = input.nextLine();
                    myOrganicShelter.removeOrganicPet(upForAdoptions);
                    System.out.println("Pet has been adopted " + upForAdoptions);
                }
                //Add a pet.
                case "8" -> {
                    myOrganicShelter.tickAllPets(pet);
                    System.out.println(
                            "Do you have a: \n\t A. Organic Dog \n\t B. Organic Cat \n\t C. Robotic Dog \n\t D. Robotic Cat");
                    String petType = input.nextLine();
                    switch (petType.toUpperCase()) {
                        // Add organic dog.
                        case "A" -> {
                            System.out.println("Name the Dog");
                            String organicDogName = input.nextLine();
                            VirtualOrganicPet newOrganicDog = new OrganicDog(organicDogName, 10, 10, 10, 10, 10);
                            myOrganicShelter.addOrganicPet(newOrganicDog);
                        }

                        // Add organic cat.
                        case "B" -> {
                            System.out.println("Please name the new cat: ");
                            String organicCatName = input.nextLine();
                            VirtualOrganicPet newOrganicCat = new OrganicCat(organicCatName, 10, 10, 0, 0, 0);
                            myOrganicShelter.addOrganicPet(newOrganicCat);
                        }
                        // Add robotic dog.
                        case "C" -> {
                            System.out.println("Please name the new robotic dog: ");
                            String roboticDogName = input.nextLine();
                            VirtualRoboticPet newRoboticDog = new RoboticDog(roboticDogName, 10, 10, 0, 10);
                            myRoboticShelter.addRoboticPet(newRoboticDog);
                        }
                        // Add robotic cat.
                        case "D" -> {
                            System.out.println("Please name the new robotic cat: ");
                            String roboticCatName = input.nextLine();
                            VirtualRoboticPet newRoboticCat = new RoboticCat(roboticCatName, 10, 10, 10, 10);
                            myRoboticShelter.addRoboticPet(newRoboticCat);
                        }
                    }
                    System.out.println("Congratulations! You've got a new pet!");
                }

                // play wit pet
                case "9" -> {
                    myOrganicShelter.tickAllPets(pet);
                    System.out.println("Which pet would you like to play with?");
                    System.out.println();
                    myOrganicShelter.showPetName(pet);
                    String chosenPet = input.nextLine();
                    VirtualPet playPet = myOrganicShelter.getPetNamed(chosenPet);
                    playPet.play();
                    System.out.println(chosenPet + " had a great time!");
                }
                case "10" -> {
                    myOrganicShelter.tickAllPets(pet);
                    myOrganicShelter.tickAllPets(pet3);
                    System.out.println("These are the pet in the shelter: ");
                    myOrganicShelter.showOrganicPets();
                    myRoboticShelter.showAllRoboticPets();
                    myOrganicShelter2.showOrganicPets();
                    myRoboticShelter2.showAllRoboticPets();
                }

                // System.out.println(myOrganicShelter.showOrganicPets(playPet);
                case "11" -> {
                    System.out.println("See you next time!");
                   run = false;
                }
                default -> System.out.println("error, Try again.");
            }

            myOrganicShelter.tickAllPets(pet);
        } while (run);
        // //(!myOrganicShelter.hasPets()) ;

        input.close();


    }
}
