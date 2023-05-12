package com.gt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// DealershipFileManager will be responsible for reading the dealership file,
// parsing the data, and creating a Dealership object full of vehicles from the
// file.  It will also be responsible for saving a dealership and the vehicles
// back into the file in the same pipe-delimited format

public class DealershipFileManager {
    public Dealership getDealership(){

        try {
            FileInputStream dealershipFile = new FileInputStream("./src/main/java/com/gt/dealership.txt");
            Scanner scanner = new Scanner(dealershipFile);

            // Read dealership information from the first line in an external file
            String firstLine_dealershipData = scanner.nextLine();
            System.out.println("Dealership Data: " + firstLine_dealershipData);


            String vehicleData;
            while(scanner.hasNextLine()){
                vehicleData = scanner.nextLine();
                System.out.println("Vehicle: " + vehicleData);
            }

            scanner.close();
            return new Dealership("", "", "");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void saveDealership(Dealership dealership){
        // Write dealership information to an external file
    }

}
