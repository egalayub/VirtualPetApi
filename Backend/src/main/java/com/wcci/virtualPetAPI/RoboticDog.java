package com.wcci.virtualPetAPI;

public class RoboticDog extends VirtualRoboticPet implements RoboticPet {

    protected int batteryLife;
    protected int oil;

    public RoboticDog(String name, int happiness, int health, int oil, int batteryLife) {
        super(name, happiness, health, oil, batteryLife);
        this.batteryLife = batteryLife;
        this.oil = oil;

    }

    @Override
    public void tick() {
        batteryLife -= 5;
        oil -= 5;

    }

    public int oil() {
       return oil;
    }

}
