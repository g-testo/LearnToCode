package com.gt;

import com.gt.amenities.Amenity;
import com.gt.amenities.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
    private String name;
    private ArrayList<Floor> floors;
    private ArrayList<Amenity> amenities;

    public Hotel(){
        this.floors = new ArrayList<>();
        this.amenities = new ArrayList<>(
                Arrays.asList(new Restaurant("Default"))
        );
    }

    public void addFloor(){
        this.floors.add(new Floor());
    }

    public ArrayList<Floor> getFloors(){
        return this.floors;
    }

}
