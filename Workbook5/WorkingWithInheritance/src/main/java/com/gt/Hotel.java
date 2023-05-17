package com.gt;

public class Hotel {
    private int numberOfRooms;

    public Hotel(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "Hotel{numberOfRooms=" + numberOfRooms + '}';
    }
}
