package com.yearup.paint;

public class Square {
    private int sides;

    public Square(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sides=" + sides +
                '}';
    }
}
