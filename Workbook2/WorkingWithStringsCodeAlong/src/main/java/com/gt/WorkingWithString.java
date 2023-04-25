package com.gt;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;

import javax.sound.midi.SysexMessage;
public class WorkingWithString {
    public static void main(String[] args){
//        String word1 = "Hello ";
//        String word2 = "World!";
//        String result = word1.concat(word2);
//
//        int wordLength = result.length();
//        System.out.println((wordLength));
        ////////////
//        char myChar = 'G';
//        String myName = "Greg";
//
//        String phrase = "Big tex says\n \"Hello\"! test";
//        System.out.println(phrase);

        /////////////
//        int num1 = 10;
//        int num2 = 10;
//        System.out.println(num1 == num2);

//        String phrase1 = new String("Hello World"); // 234g23h
//        String phrase2 = new String("Hello World"); // sdc454d

//        System.out.println(phrase1 == phrase2); // A
//        System.out.println(phrase1.equals(phrase2)); // B

        // Primitives: int long short boolean char double float // Compare with ==
        // Non-primitive: String // Compare .equals

        ///////////

        //        String myName = "Salha";
        //
        //        String myUpperCaseName = myName.toUpperCase();
        //
        //        System.out.println(myUpperCaseName);

        //////////
//        String phrase = "                   Hello World    !  ";
//        System.out.println(phrase.trim());

//        String myPhrase = "Braynel is so awesome!!!!!";
//        System.out.println(myPhrase.startsWith("bray"));

        ////////////

//        String trackingCode = "USA-12981-Y-22";
//        char hasShipped = trackingCode.charAt(1);
//        System.out.println(hasShipped);

        ///////////////

//        String productCode1 = "ACME-12213"; // "ACME", "12213"
//        int dashPosition1 = productCode1.indexOf("-"); // 4
//        String vendor1 = productCode1.substring(0, dashPosition1); // "ACME"
//        String productNum1 = productCode1.substring(dashPosition1 + 1); // "12213"
//        System.out.println("Vendor1: " + vendor1 + " ProductNum1: " + productNum1);
//
//
//        String productCode2 = "SAMSUNG-320233242"; // "SAMSUNG", "320233242"
//        int dashPosition2 = productCode2.indexOf("-"); // 7
//        String vendor2 = productCode2.substring(0, dashPosition2); // "SAMSUNG"
//        String productNum2 = productCode2.substring(dashPosition2+1); // "320233242"
//        System.out.println("Vendor2: " + vendor2 + " ProductNum2: " + productNum2);


        ////////////

//        String str = "my@dear@aunt@sally";
////        System.out.println(str.substring(3, 7));
//        System.out.println(Arrays.toString(str.split("@")));


        ////////////
        // Start week2day2 here
//        String str = "34344";
//        int num = 10;
//
//        int parsedInt = Integer.parseInt(str);
//        int sum = num + parsedInt;
//        System.out.println("Result is: " + sum);
        ///////


        // string contains "id|description|quantity|price"

//        String input = "111|Hot Chocolate (12-count)|21|4.99";
//
//        String[] tokens = input.split(Pattern.quote("|"));
//
//        int id = Integer.parseInt(tokens[0]);
//        String name = tokens[1];
//        int quantity = Integer.parseInt(tokens[2]);
//        double price = Double.parseDouble(tokens[3]);



        //////////
//        String userInput = "2002-10-17";
//        LocalDate birthday = LocalDate.parse(userInput);
//        System.out.println(birthday);

        /////////





    }


}
