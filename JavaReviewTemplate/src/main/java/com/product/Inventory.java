package com.product;

import java.util.ArrayList;

public class Inventory {
    private String companyName;
    private ArrayList<Product> products;

    public Inventory(String companyName) {
        this.companyName = companyName;
        this.products = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "companyName='" + companyName + '\'' +
                ", products=" + products +
                '}';
    }
}
