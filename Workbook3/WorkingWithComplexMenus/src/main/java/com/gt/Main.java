package com.gt;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Villain> villains = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        loadVillains();

        String input;
        do {
            System.out.println("Please enter a command: ");
            System.out.println("\t1: Recruit Villain");
            System.out.println("\t2: List Villains");
            System.out.println("\t3: Exit");
            System.out.print("Command: ");
            input = scanner.nextLine();

            switch(input){
                case "1":
                    recruitVillain();
                    break;
                case "2":
                    handleListSubMenu();
                    break;
                case "3":
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid input!");
            }

        } while(!input.equalsIgnoreCase("3"));
    }

    public static void loadVillains(){
        Villain joker = new Villain("Joker", "Batman", "Chaos");
        Villain darthVader = new Villain("Darth Vader", "Star Wars", "More power");
        Villain garou = new Villain("Garou", "One Punch Man", "Helping monster underdogs");
        Villain magneto = new Villain("Magneto", "X-Men", "Equality for mutants");

        villains.add(joker);
        villains.add(darthVader);
        villains.add(garou);
        villains.add(magneto);
    }
    public static void recruitVillain(){
        System.out.println("Please provide the properties of this new villain: ");

        System.out.print("Name: ");
        String villainName = scanner.nextLine();

        System.out.print("Origin: ");
        String origin = scanner.nextLine();

        System.out.print("Motivation: ");
        String motivation = scanner.nextLine();

        Villain newVillain = new Villain(villainName, origin, motivation);

        villains.add(newVillain);

        System.out.println("Villain added");
    }

    public static void handleListSubMenu(){

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
                    displayAll();
                    System.out.println("List all");
                    break;
                case "2":
                    searchByName();
                    System.out.println("Search by name");
                    break;
                case "3":
                    displayAllSortByOrigin();
                    System.out.println("Sort by origin");
                    break;
                case "4":
                    System.out.println("Back to main menu");
                    break;
                default:
                    System.out.println("Invalid input!");
            }

        } while(!subInput.equalsIgnoreCase("4"));
    }
    public static void displayAll(){
        for(int i=0; i<villains.size();i++){
            Villain currentVillain = villains.get(i);
            System.out.println(currentVillain);
        }
    }
    public static void searchByName(){}
    public static void displayAllSortByOrigin(){}

}