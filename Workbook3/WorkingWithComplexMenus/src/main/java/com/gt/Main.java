package com.gt;

// 1: Create a complex menu

// Main class
    // Static variable of type ArrayList of all villains

// Villain Class

// Name String
// origin String
// Motivation String

// 1) Add a villain
// 2) List villains
    // 1) List all villain alphabetically
    // 2) Search by name
        // Prompt for name to search
    // 3) Sorted by origin
        // Prompt for the origin
    // 4) Exit to main menu
// 3) Exit

public class Main {
    public static void main(String[] args) {

    }

}

class Villain {
    private String name;
    private String origin;
    private String motivation;

    public Villain(String name, String origin, String motivation) {
        this.name = name;
        this.origin = origin;
        this.motivation = motivation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", motivation='" + motivation + '\'' +
                '}';
    }
}
