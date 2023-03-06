package com.wcci.virtualPetAPI.entities;

public class VirtualRoboticPet extends VirtualPet {
    protected String name;
   protected int happiness;
   protected int health;
   private int oil;
   private final int batteryLife;



    public VirtualRoboticPet(String name, int happiness, int health, int oilLevel, int batteryLife){
        super(name,happiness, health);
        this.name = name;
        this.happiness = happiness;
        this.health = health;
        this.oil = oil;
        this.batteryLife = batteryLife;
    }

    // Getters
    public String name(){
        return name;
    }

    public String getRoboticPetType(){
        return "Robotic";
    }

    public int happiness(){
        return happiness;
    }

    public int oil() {
        return oil;
    }

    public int getRoboticPetHealth(){
        return health;
    }

    public int batteryLife() {
        return batteryLife;
    }

    public void play(){
        happiness += 10;

        if(oil<= 20){
            System.out.println("Please oil Robotic Pet before Health declines");
        }
    }

    public void tick(){
        happiness -= 20;
        health -= 10;
        

    }




}
