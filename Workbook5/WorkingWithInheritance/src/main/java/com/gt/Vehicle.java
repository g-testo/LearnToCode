package com.gt;

public class Vehicle {
    private int numberOfWheels;
    private String color;
    private boolean hasSunRoof;

    public Vehicle(int numberOfWheels, String color, boolean hasSunRoof) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.hasSunRoof = hasSunRoof;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfWheels=" + numberOfWheels +
                ", color='" + color + '\'' +
                ", hasSunRoof=" + hasSunRoof +
                '}';
    }
}
