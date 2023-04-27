package com.gt;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class WorkingWithDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
//        System.out.println(today.getMonthValue()%2 == 0); // Is month even

//        System.out.println(today.getNano());

//        DateTimeFormatter dateFormatPattern = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
//
//        String formattedDate = today.format(dateFormatPattern);
//
//        System.out.println(formattedDate);

//        aug 3 2000 8am

//        String userInput = "08-03-2000 08:00:00";
//        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
//        LocalDateTime timeTravelDate = LocalDateTime.parse(userInput, inputFormatter);
//
//        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("G, E, MMM dd, yyyy HH:mm:ss");
//        System.out.println(timeTravelDate.format(outputFormatter));

        String userInputBC = "08-03-2000 08:00:00 BC";
        DateTimeFormatter inputFormatterBC = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss GG");
        LocalDateTime timeTravelDateBC = LocalDateTime.parse(userInputBC, inputFormatterBC);

        DateTimeFormatter outputFormatterBC = DateTimeFormatter.ofPattern("GG, E, MMM dd, yyyy HH:mm:ss");
        System.out.println(timeTravelDateBC.format(outputFormatterBC));







    }


}
