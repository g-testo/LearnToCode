package com.gt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

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
            String[] dealershipDataArr = firstLine_dealershipData.split(Pattern.quote("|"));
            Dealership initialDealership = new Dealership(dealershipDataArr[0], dealershipDataArr[1], dealershipDataArr[2]);

            String vehicleData;
            while(scanner.hasNextLine()){
                vehicleData = scanner.nextLine();
                String[] vehicleDataArr = vehicleData.split(Pattern.quote("|"));

                Vehicle currentVehicle = new Vehicle(
                        Integer.parseInt(vehicleDataArr[0]),
                        Integer.parseInt(vehicleDataArr[1]),
                        vehicleDataArr[2],
                        vehicleDataArr[3],
                        vehicleDataArr[4],
                        vehicleDataArr[5],
                        Integer.parseInt(vehicleDataArr[6]),
                        Double.parseDouble(vehicleDataArr[7])
                );

                initialDealership.addVehicle(currentVehicle);
            }

            scanner.close();
            return initialDealership;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void saveDealership(Dealership dealership){
        // Write dealership information to an external file
    }

}
