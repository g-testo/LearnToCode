package com.gt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(12121212, "Honda/Accord", "White", 200_000, 2_000);
        // 1: Id: 12121212, Make/Model: Honda Accord, Color: White, Odometer Reading: 200000, price: 2000
        vehicles[1] = new Vehicle(12121213, "Honda/Fit", "White", 120_000, 1_900);
        vehicles[2] = new Vehicle(12121214, "Tesla/Type S", "Red", 130_000, 1_800);
        vehicles[3] = new Vehicle(12121215, "Toyota/Camry", "Orange", 140_000, 1_700);
        vehicles[4] = new Vehicle(12121216, "Ford/Focus", "Black", 150_000, 1_600);
        vehicles[5] = new Vehicle(12121217, "Ferrari/Enzo", "Yellow", 160_000, 1_500);

        int totalNumOfVehicles = 6;

        int commandInput;
        do {
//            Thread.sleep(1000);
            System.out.println("What do you want to do?\n" +
                    "\t1 - Find vehicles that match make/model\n" +
                    "\t2 - Find vehicles that fall within a price range\n" +
                    "\t3 - Find vehicles that match a color\n" +
                    "\t4 - List all vehicles\n" +
                    "\t5 - Add a vehicle\n" +
                    "\t6 - Quit\n" +
                    "Enter your command:\n"
            );
            commandInput = scanner.nextInt();


            switch(commandInput){
                case 1:
                    System.out.print("Please provide a make/model: ");
                    String userInput = scanner.next();

                    for(int i=0;i<vehicles.length;i++){
                        if(vehicles[i] == null){
                            break;
                        }
                        String currentMakeModel = vehicles[i].getMakeModel();
                        if(currentMakeModel.equalsIgnoreCase(userInput)) { // if the given make/model matches
                            System.out.printf("%d: Id: %d, Make/Model: %s, Color: %s, Odometer Reading: %d, price: %f\n",
                                    i + 1,
                                    vehicles[i].getVehicleId(),
                                    vehicles[i].getMakeModel(),
                                    vehicles[i].getColor(),
                                    vehicles[i].getOdometerReading(),
                                    vehicles[i].getPrice()
                            );
                        }
                    }
                    break;
                case 2:
                    System.out.println("Find vehicle by price");
                    break;
                case 3:
                    System.out.println("Find vehicle by color");
                    break;
                case 4:
                    System.out.println("List all vehicles");
                    for(int i=0;i<vehicles.length;i++){
                        if(vehicles[i] == null){
                            break;
                        }

                        System.out.printf("%d: Id: %d, Make/Model: %s, Color: %s, Odometer Reading: %d, price: %f\n",
                                i+1,
                                vehicles[i].getVehicleId(),
                                vehicles[i].getMakeModel(),
                                vehicles[i].getColor(),
                                vehicles[i].getOdometerReading(),
                                vehicles[i].getPrice()
                        );
                    }
                    break;
                case 5:
                    // Incomplete but should demonstrate how to complete this case
                    System.out.println("Please provide information for a new vehicle: ");
                    System.out.print("Make/Model: ");
                    String makeModelInput = scanner.next();
                    System.out.print("Color: ");
                    String colorInput = scanner.next();

                    vehicles[totalNumOfVehicles] = new Vehicle(0,makeModelInput,colorInput,0,0);

                    totalNumOfVehicles++;

                    System.out.println("Vehicle added successfully");

                    break;
                case 6:
                    System.out.println("Quiting");
                    break;
                default:
                    System.out.println("Command not found");
            }
        } while(commandInput != 6);
    }
}

class Vehicle {
    // Properties
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    // Constructor(s)
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    // Getters and Setters
    public long getVehicleId(){
        return this.vehicleId;
    }

    public void setVehicleId(long vehicleId){
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    // Custom methods

}