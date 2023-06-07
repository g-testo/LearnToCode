package com.yearup.paint;

public class Circle {
    private int radius;


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    private Circle(int radius) {
        this.radius = radius;


    }
}
