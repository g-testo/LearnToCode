package com.gt;

// UserInterface will be responsible for all output to the screen, reading of
// user input, and "dispatching" of the commands to the Dealership as needed.
// (ex:  when the user selects "List all Vehicles", UserInterface would call the
// appropriate Dealership method and then display the vehicles it returns.)

import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Dealership dealership;
    static Scanner scanner = new Scanner(System.in);
    private DealershipFileManager dealershipFileManager = new DealershipFileManager();


    private void init(){
        // Load dealership and inventory from a file
        this.dealership = dealershipFileManager.getDealership();
    }

    public void display(){
        init();
        System.out.println("Current Dealership: " + this.dealership);
        String input;

        do {
            System.out.println("Please enter a command: ");
            System.out.println("\t1: Get all vehicles");
            System.out.println("\t2: Get all vehicles by price");
            System.out.println("\t3: Add a Vehicle");
            System.out.println("\t4: Remove a Vehicle");
            System.out.println("\t5: Exit");

            System.out.print("Command: ");
            input = scanner.nextLine();

            switch(input){
                case "1":
                    processGetAllVehiclesRequest();
                    break;
                case "2":
                    processGetVehiclesByPriceRequest();
                    break;
                case "3":
                    processAddVehicleRequest();
                    break;
                case "4":
                    processRemoveVehicleRequest();
                    break;
                case "5":
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Command not found, please try again");
            }

        } while(!input.equalsIgnoreCase("5"));
    }

    public void processGetVehiclesByPriceRequest() {
        System.out.println("Please give me a min price");
        float minValue = scanner.nextFloat();
        System.out.println("Please give me a max price");
        float maxValue = scanner.nextFloat();

        ArrayList<Vehicle> vehiclesByPrice = this.dealership.getVehiclesByPrice(minValue, maxValue);
        for(Vehicle vehicle: vehiclesByPrice){
            System.out.println(vehicle);
        }

        scanner.nextLine();
    }

    public void processGetVehiclesByMakeModelRequest() {

    }

    public void processGetVehiclesByYearRequest() {

    }

    public void processGetVehiclesByColorRequest() {

    }

    public void processGetVehiclesByMileageRequest() {

    }

    public void processGetVehiclesByTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {
        ArrayList<Vehicle> allVehicles = this.dealership.getAllVehicles();
        for(Vehicle vehicle: allVehicles){
            System.out.println(vehicle);
        }
    }

    public void processAddVehicleRequest(){
//        int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price
        System.out.println("Please provide the the following: ");

        System.out.print("Vin: ");
        int vin = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();

        // We are clearing the scanner
        scanner.nextLine();

        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Odometer: ");
        int odometer = scanner.nextInt();
        System.out.print("Price: ");
        float price = scanner.nextFloat();

        this.dealership.addVehicle(new Vehicle(vin,year,make,model,type,color,odometer,price));

        dealershipFileManager.saveDealership(this.dealership);

        System.out.println("Vehicle added Successfully");
        // We are clearing the scanner
        scanner.nextLine();
    }

    public void processRemoveVehicleRequest(){
        // Display all vehicles and allow user to select one to remove
        System.out.println("Please enter the vehicle number to remove: ");

        ArrayList<Vehicle> allVehicles = this.dealership.getAllVehicles();
        for(int i=0;i<allVehicles.size();i++){
            System.out.println((i+1) + " " + allVehicles.get(i).toString());
        }
        int chosenVehicle = scanner.nextInt();

        this.dealership.removeVehicle(chosenVehicle-1);

        dealershipFileManager.saveDealership(this.dealership);

        System.out.println("Successfully removed vehicle");
        scanner.nextLine();
    }
}
