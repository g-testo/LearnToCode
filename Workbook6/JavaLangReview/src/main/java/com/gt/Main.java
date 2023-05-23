package com.gt;

public class Main {

    // Method, Access modifier, return type, parameters, arguments, static
    public static void main(String[] args) {

//        int returnVal = add(1, 2);
//
//        System.out.println(returnVal);

//        if(){
//
//        } else if () {
//
//        } else {
//
//        }

//        for(int i=100;i>0;i--){
//
//        }

        // Array of prices

        float[] prices = new float[5]; // Create an array
        prices[0] = 29.99f; // Add an element to an array

        prices[0] = 0; // Zero out element

        prices[0] = 24.99f; // Update an element in an array

        for(int i=0;i<prices.length;i++){
            System.out.println(prices[i]);
        }

    }

    public static int add(int number1, int number2){
        return number1 + number2;
    }

}