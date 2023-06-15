package com.gt;

public class Hotel {
    private int id;
    private String name;
    private int totalFloors;
    private int totalOccupancy;

    public Hotel(String name, int totalFloors, int totalOccupancy) {
        this.name = name;
        this.totalFloors = totalFloors;
        this.totalOccupancy = totalOccupancy;
    }
    public Hotel(int id, String name, int totalFloors, int totalOccupancy) {
        this.id = id;
        this.name = name;
        this.totalFloors = totalFloors;
        this.totalOccupancy = totalOccupancy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getTotalOccupancy() {
        return totalOccupancy;
    }

    public void setTotalOccupancy(int totalOccupancy) {
        this.totalOccupancy = totalOccupancy;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalFloors=" + totalFloors +
                ", totalOccupancy=" + totalOccupancy +
                '}';
    }
}
