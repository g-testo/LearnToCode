package com.product;

public class Main {
    public static void main(String[] args) {
        // Test associative
        Inventory inventory = new Inventory("Wendy's");

        FoodItem fries = new FoodItem("Fries", "Veggie", 5.00f, "6-17-23");
        FoodItem burgers = new FoodItem("Burgers", "Meat", 10.00f, "6-17-23");
        FoodItem drinks = new FoodItem("Drinks", "Beverage", 4.00f, null);

        inventory.addProduct(fries);
        inventory.addProduct(burgers);
        inventory.addProduct(drinks);

        System.out.println(inventory);

        // Test inheritance

        System.out.println(fries.getType());

    }
}
