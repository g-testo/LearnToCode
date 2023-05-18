package com.order;

public class Main {
    public static void main(String[] args){
        Item item1 = new Item(1, "Peanut Butter Ice Cream", 7.00f);
        Item item2 = new Item(2, "Orange Soda", 3.00f);

        OnlineOrder onlineOrder = new OnlineOrder(1, "123 Fourth Ave");

        onlineOrder.addItem(item1);
        onlineOrder.addItem(item2);

        System.out.println(onlineOrder);

        System.out.println(onlineOrder.calculateTotal());

    }
}
