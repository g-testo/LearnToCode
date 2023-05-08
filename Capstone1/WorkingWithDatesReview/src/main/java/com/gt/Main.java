package com.gt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
//        // Converting from a string to a date ///////////
//        String date1 = "2000-12-01";
//        // 1: Create a pattern for the date
//        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        // 2: Parse/convert the date using the created pattern
//        LocalDate formattedDate1 = LocalDate.parse(date1, dateTimeFormatter1);
////        Print to confirm
////        System.out.println(formattedDate1.getYear());
//
//        // Converting from a date to a formatted date string
//        // 1: Create an output date format
//        DateTimeFormatter dateTimeFormatterOutput1 = DateTimeFormatter.ofPattern("yy-MM-dd");
//        // 2: Parse/convert the date object to the output pattern
//        String outputDate1 = formattedDate1.format(dateTimeFormatterOutput1);
//        System.out.println(outputDate1);
//
//        String date2 = "12-01-00";
//        // 1: Create a pattern for the date
//        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM-dd-yy");
//        // 2: Parse/convert the date using the created pattern
//        LocalDate formattedDate2 = LocalDate.parse(date2, dateTimeFormatter2);
////      System.out.println(formattedDate2.getYear());
//
//        String date3 = "01-12-2020";
//        // 1: Create a pattern for the date
//        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        // 2: Parse/convert the date using the created pattern
//        LocalDate formattedDate3 = LocalDate.parse(date3, dateTimeFormatter3);
////        System.out.println(formattedDate3.getYear());




        // Capstone Example ///////////////////////
        


//        String date = "2023-04-15";
//        String time = "10:13:25";
//        String dateTime = date + " " + time; // "2023-04-15 10:13:25"
//        // 1: Create a pattern for the date
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
////        2: Parse/convert the date using the created pattern
//        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, dateTimeFormatter);
//
//        System.out.println(localDateTime);

//        1) Month To Date
//        BeginningOfMonth Create a date LocalDate.now().getYear() + "-" LocalDate.now().getMonth() + "-" 00 + 00:00:00"
//        givenDateTime > BeginningOfMonth

//        2) Previous Month

//        prevMonth = LocalDate.now().getYear() + "-" LocalDate.now().minusMonths(1).getMonth() + "-" 00 + 00:00:00"
//        currentMonth = LocalDate.now().getYear() + "-" LocalDate.now().getMonth() + "-" 00 + 00:00:00"

//        givenDateTime > prevMonth && givenDateTime < currentMonth

//        3) Year To Date
            // From the beginning of the year
            // beginningYear = LocalDate.now().getYear() + "-01-01 00:00:00"
            // givenDateTime > beginningYear
//        4) Previous Year
        // All transactions from last year
        // beginningOfLastYear = LocalDate.now().minusYears(1).getYears() + "-01-01 00:00:00"
        // beginningOfCurrentYear = LocalDate.now().getYear() + "-01-01 00:00:00"

        // givenDateTime > beginningOfLastYear && givenDateTime < beginningOfCurrentYear

        // 2023-04-10 | 10:13:25 | Bluetooth Speaker | Samsung | 9.99
        // 2023-04-10 | 10:13:25 | Bluetooth Speaker | Samsung | 9.99
        // 2023-04-10 | 10:13:25 | Bluetooth Speaker | Samsung | 9.99
        // 2023-04-10 | 10:13:25 | Bluetooth Speaker | Samsung | 9.99

        // Read from file
        try {
            FileReader fileReader = new FileReader("./src/java/...");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            while(){
//                lineFromFile "2023-04-10 | 10:13:25 | Bluetooth Speaker | Samsung | 9.99"
                // Split it
//                 transactionArray ["2023-04-10", "10:13:25", "Bluetooth Speaker", "Samsung", "9.99"]
//                date: transactionArray[0]
//                time: transactionArray[1]
//                Transaction transaction = new Transaction();
//            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        String date = "2023-04-10";
        String time = "10:13:25";
        String dateTime = date + " " + time; // "2023-04-15 10:13:25"
        // 1: Create a pattern for the date
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

//        2: Parse/convert the date using the created pattern
        LocalDateTime transactionDateTime = LocalDateTime.parse(dateTime, dateTimeFormatter);

//        1) Month To Date
            LocalDateTime now = LocalDateTime.now();
            int currentYear = now.getYear();
            int currentMonth = now.getMonthValue();

            int transactionYear = transactionDateTime.getYear();
            int transactionMonth = transactionDateTime.getMonthValue();

            if(currentYear == transactionYear && currentMonth == transactionMonth){
                System.out.println("The transaction is from the current month");
            }

            ////////////////////////////////////////

//        prevMonth = LocalDate.now().getYear() + "-" LocalDate.now().minusMonths(1).getMonth() + "-" 00 + 00:00:00"
//        currentMonth = LocalDate.now().getYear() + "-" LocalDate.now().getMonth() + "-" 00 + 00:00:00"
        int previousMonth = now.minusMonths(1).getMonthValue();
        if(currentYear == transactionYear && previousMonth == transactionMonth){
            System.out.println("The transaction is from last month");
        }

        // Year to date
        if(currentYear == transactionYear){
            System.out.println("The transaction is from the same year");
        }

        // Transactions from the prior year
        int priorYear = now.minusYears(1).getYear();
        if(priorYear == transactionYear){
            System.out.println("The transaction is from the prior year");
        }




//        LocalDateTime now = LocalDateTime.now();
//        int comparison = transactionDateTime.compareTo(now);
//        if(comparison > 0){
//            System.out.println("Comes after");
//        } else {
//            System.out.println("Comes before");
//        }
//        System.out.println();

    }
}