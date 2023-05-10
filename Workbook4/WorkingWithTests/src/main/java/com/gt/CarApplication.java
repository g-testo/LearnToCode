package com.gt;

public class CarApplication {
    public static void main(String[] args) {

    }
}

class Car {
    private String brand;
    private String model;
    private String owner;
    private int speed;

    public Car(String brand, String model, String owner) {
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpeed(){
        return speed;
    }

    // Get car description: brand & model
    public String getCarDescription(){
        return String.format("Description: Brand: %s, Model: %s", brand, model);
    }

    public boolean isStringOwner(String owner){
        return this.owner.equalsIgnoreCase(owner);
    }

    public void accelerate(int changeInSpeed){
        this.speed += changeInSpeed;
    }

    public void brake(int changeInSpeed){
        if(changeInSpeed > this.speed){
            this.speed = 0;
        } else {
            this.speed -= changeInSpeed;
        }
    }
}
