package com.product;

public class Product {
    // Properties
    private String name;
    private String type;
    private float price;

    // Constructor(s)

    public Product(String name, String type, float price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }


    // Methods
        // Getters/Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Custom methods
    public boolean calcIsOnSale(){
        return this.type.equalsIgnoreCase("cereal");
    }

    // Override methods
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
