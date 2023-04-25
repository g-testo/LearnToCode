package com.gt;

// All of the animals are having a feast! Each animal is bringing one dish. There is just one rule:
// the dish must start and end with the same letters as the animal's name. For example, the great blue
// heron is bringing garlic naan and the chickadee is bringing chocolate cake.
//
// Write a function feast that takes the animal's name and dish as arguments and returns true or
// false to indicate whether the beast is allowed to bring the dish to the feast.
//
// Assume that beast and dish are always lowercase strings, and that each has at least two letters.
// beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the
// string. They will not contain numerals.


//Polya’s First Principle: Understand the problem

// Input(s):
    // How many?
        // 2
    // What datatype is my input?
        // beast: String, dish String

// Output:
    // What datatype is my output?
        // Boolean

// Edge cases
    // What edge cases exist?
        // No inputs

// Input: great blue heron, garlic naan
// Output: true

// Input: chickadee, chocolate cake
// Output: true

// Input: beast: lion, dish: chicken
// Output: false

// Input: shark, steak
// Output: true

// Input: bear, Burger
// Output: true

// Input: nothing
// Output: null, log "Inputs not valid"


//Polya’s Second Principle: Devise a plan

// variable
// Data type conversion
// If statement
// Conditionals, ===, .equals
// AND &&, OR ||
// inputs, scanner
// Loops
// Arrays
// Guard Clause pattern
// .startsWith

// Pseudocode

// inputs: beast as a String, dish is also a String
// output: boolean

// Are we missing either inputs?
    // Log "Invalid inputs"
    // return null

// Store first letter of beast in variable: beastInitial
// Store last letter of beast in variable: beastLastLetter

// Store first letter of dish in variable: dishInitial
// Store last letter of dish in variable: dishLastLetter

// Does the beastInitial match dishInitial and Does the beastLastLetter match dishLastLetter?
    // return the boolean true
// otherwise
    // return the boolean false


//Polya’s Third Principle: Carry out the plan

public class Main {
    public static void main(String[] args) {
        // Input: great blue heron, garlic naan
        boolean result1 = feast("great blue heron", "garlic naan");
        System.out.println(result1);
        // Output: true

        // Input: chickadee, chocolate cake
        boolean result2 = feast("chickadee", "chocolate cake");
        System.out.println(result2);
        // Output: true

        // Input: beast: lion, dish: chicken
        boolean result3 = feast("lion", "chicken");
        System.out.println(result3);
        // Output: false

        // Input: shark, steak
        boolean result4 = feast("shark", "steak");
        System.out.println(result4);
        // Output: true

        // Input: bear, Burger
        boolean result5 = feast("bear", "burger");
        System.out.println(result5);
        // Output: true

        // Input: nothing
        boolean result6 = feast(null, null);
        System.out.println(result6);
        // Output: null, log "Inputs not valid"

    }

    public static boolean feast(String beast, String dish) {
        if(beast == null && dish == null){
            // Are we missing either inputs?
            // Log "Invalid inputs"
            // return false
            System.out.println("Invalid inputs");
            return false;
        }
        // Store first letter of beast in variable: beastInitial
        char beastInitial = beast.charAt(0);
        // Store last letter of beast in variable: beastLastLetter
        char beastLastLetter = beast.charAt(beast.length() - 1);

        // Store first letter of dish in variable: dishInitial
        char dishInitial = dish.charAt(0);
        // Store last letter of dish in variable: dishLastLetter
        char dishLastLetter = dish.charAt(dish.length() - 1);

        // Return true if the beastInitial match dishInitial and Does the beastLastLetter match dishLastLetter?
        return beastInitial == dishInitial && beastLastLetter == dishLastLetter;
    }
}

//Polya’s Fourth Principle: Look back

// Can I make the code better and how?
    // Can we make our code more readable?
    // Are we follow all the best practices/convention?
    // How maintainable is our code?
    // How testable is our code?
    // Can we make our code more efficient?
        // What is the big(O) notation? Time complexity/space complexity?



