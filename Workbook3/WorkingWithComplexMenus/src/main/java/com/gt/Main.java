package com.gt;
import java.util.ArrayList;
import java.util.Scanner;

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
    static ArrayList<Villain> villains = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input;
        do {
            System.out.println("Please enter a command: ");
            System.out.println("\t1: Add Villain");
            System.out.println("\t2: List Villains");
            System.out.println("\t3: Exit");
            System.out.print("Command: ");
            input = scanner.nextLine();

            switch(input){
                case "1":
                    addVillain();
                    break;
                case "2":
                    handleListSubMenu();
                    // Nest more commands
                    break;
                case "3":
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid input!");
            }

//            if(input.equals("1")){
//                addVillain();
//            } else if(input.equals("2")){
//                // Nest more commands
//            } else if(input.equals("3")){
//                System.out.println("Exiting");
//            } else {
//                System.out.println("Invalid input!");
//            }

        } while(!input.equalsIgnoreCase("3"));
    }
    public static void addVillain(){
        System.out.println("Villain Added");
        // Prompt user for properties
//        villains.add();
    }

    public static void handleListSubMenu(){
        // 1) List all villain alphabetically
        // 2) Search by name
        // Prompt for name to search
        // 3) Sorted by origin
        // Prompt for the origin
        // 4) Exit to main menu

        String subInput;

        do{
            System.out.println("Please enter a command: ");
            System.out.println("\t1: List all");
            System.out.println("\t2: Search by name");
            System.out.println("\t3: Sort by origin");
            System.out.println("\t4: Back to main menu");
            System.out.print("Command: ");

            subInput = scanner.nextLine();

            switch(subInput){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Invalid input!");
            }

        } while(!subInput.equalsIgnoreCase("4"));
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
