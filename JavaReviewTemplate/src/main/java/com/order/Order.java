package com.order;

import java.util.ArrayList;

public class Order {
    private int id;
    private ArrayList<Item> items;


    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<Item>();
    }

    // getid, returnType: int
    // access modifier, static Modifier, returnType, Name of the method, Parameters(inputs)
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public float calculateTotal(){
        float total = 0;

        for(int i=0;i<this.items.size();i++){
            Item currentItem = this.items.get(i);
            total += currentItem.getPrice();
        }

        return total;
    }

    @Override
    public String toString(){
        return "Order{ id: " + this.id + ", Items: " + this.items + "}";
    }
}
