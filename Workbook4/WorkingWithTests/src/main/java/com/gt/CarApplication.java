package com.gt;

public class CarApplication {
    public static void main(String[] args) {

    }
}

class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
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

    // Get car description: brand & model
    public String getDescription(){

        return String.format("Description: Brand: %s, Model: %s", brand, model);
    }
}
