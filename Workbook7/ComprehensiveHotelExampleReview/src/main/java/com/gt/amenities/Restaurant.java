package com.gt.amenities;

public class Restaurant extends Amenity {
    private String name;

    public Restaurant(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
