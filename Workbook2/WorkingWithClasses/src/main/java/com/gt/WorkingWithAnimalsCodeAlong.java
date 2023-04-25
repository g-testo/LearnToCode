package com.gt;

public class WorkingWithAnimalsCodeAlong {
    public static void main(String[] args) {

        Animal dog = new Animal("Max", 4);
        Animal horse = new Animal("James Baxter", 2);
        Animal cat = new Animal("Cake", 4);
        Animal lion = new Animal("Leo", 4);

        Animal turtle = new Animal("Donatello", 2);
        Animal rat = new Animal("Master Splinter", 2);

    }
}

class Animal {
    // Property
    private String name;
    private int numOfLegs;

    // Constructor
    public Animal(String name, int numOfLegs){
        this.name = name;
        this.numOfLegs = numOfLegs;
    }

    // Getter and Setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getNumOfLegs(){
        return this.numOfLegs;
    }
    public void setNumOfLegs(int numOfLegs){
        this.numOfLegs = numOfLegs;
    }

}