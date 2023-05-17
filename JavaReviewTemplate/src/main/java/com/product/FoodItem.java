package com.product;

public class FoodItem extends Product {
    private String expirationDate;
    public FoodItem(String name, String type, float price, String expirationDate){
        super(name, type, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "productName=" + super.getName() +
                "expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
