package com.vehicle;

public class Car extends Vehicle{
    private float trunkSize;
    private boolean isSelfDriving;

    public Car(int numberOfWheels, String color, boolean hasSunRoof, float trunkSize, boolean isSelfDriving) {
        super(numberOfWheels, color, hasSunRoof);
        this.trunkSize = trunkSize;
        this.isSelfDriving = isSelfDriving;
    }

    public float getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(float trunkSize) {
        this.trunkSize = trunkSize;
    }

    public boolean isSelfDriving() {
        return isSelfDriving;
    }

    public void setSelfDriving(boolean selfDriving) {
        isSelfDriving = selfDriving;
    }

    @Override
    public String toString() {
        return "Car{" +
                "trunkSize=" + trunkSize +
                ", isSelfDriving=" + isSelfDriving +
                '}';
    }
}
