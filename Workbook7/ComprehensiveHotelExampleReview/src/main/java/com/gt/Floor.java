package com.gt;
import com.gt.amenities.Amenity;

import java.util.ArrayList;


public class Floor {
    private int number;
    private static int totalNumFloors;
    private ArrayList<Amenity> availableAmenities;
    private ArrayList<Room> rooms;

    public Floor(){
        if(totalNumFloors == 12){
            totalNumFloors+=2;
        } else {
            totalNumFloors++;
        }
        this.number = totalNumFloors;

        this.availableAmenities = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public static int getTotalNumFloors() {
        return totalNumFloors;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "number=" + number +
                ", rooms=" + rooms +
                '}';
    }
}
