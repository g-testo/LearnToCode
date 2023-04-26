package com.gt;

import java.util.HashMap;
import java.util.Scanner;

public class SearchInventoryMapExercise {
    // the key is the product id, the value is a product object
    static HashMap<String, Product> inventory = new HashMap<String, Product>(); // Keys: "1", "2", Values: new Product

//    Example: Using a HashMap for Lookup cont'd
    static void main(String[] args) {
        // this method loads product objects into inventory

        loadInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f", matchedProduct.getName(), matchedProduct.getPrice());
    }

    public static void loadInventory(){
//        inventory.put()
    }

}

class Product {
    private int id;
    private String name;
    private float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    } }
