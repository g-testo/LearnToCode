package com.customer;

public class Customer {
    private String name;
    private boolean isMember;
    private float shoppingCartTotal;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, boolean isMember, float shoppingCartTotal) {
        this.name = name;
        this.isMember = isMember;
        this.shoppingCartTotal = shoppingCartTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }

    public float getShoppingCartTotal() {
        return shoppingCartTotal;
    }

    public void setShoppingCartTotal(float shoppingCartTotal) {
        this.shoppingCartTotal = shoppingCartTotal;
    }

    public float getTotal(){
        float total;
        if(this.isMember){
            total = this.shoppingCartTotal*.9f;
        } else {
            total = this.shoppingCartTotal;
        }
        return total;
    }

    public void purchaseItemsInCart(){
        System.out.println("You have successfully checked out. Your total was " + getTotal());
    }
    public void purchaseItemsInCart(float additionalDiscount){
        System.out.println("You have successfully checked out. Your total was " + (getTotal() - additionalDiscount));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", isMember=" + isMember +
                ", shoppingCartTotal=" + shoppingCartTotal +
                '}';
    }
}
