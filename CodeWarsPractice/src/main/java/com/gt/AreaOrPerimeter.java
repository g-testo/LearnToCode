package com.gt;

//Area or Perimeter
//Given 3 numbers, return if the 3rd number is the area or the
//perimeter of the first 2 numbers, "area", "perimeter", "neither"
//1st is width
//2nd is height
//3rd is a calculation

// Step 1
// Inputs: int width, int height and int givenCalculation
// Output: String Is whether the givenCalculation is the "area", "perimeter" or "neither"

// Inputs: 2, 5, 12
// Output: "Neither"

// 8, 26, 208
// Output: "Area"

// 7, 9, 32
// Output: "Perimeter"

// Step 2

// Inputs: int width, int height and int givenCalculation

// create variables that calculate both area and perimeter
    // area: width * height
    // perimeter: (width+height)*2 - Pemdas

// if area is equals givenCalculation then return "Area"
// Otherwise if perimeter is equal to givenCalculation then return "Perimeter"
// Otherwise return "Neither"

// Step 3
public class AreaOrPerimeter {
    public static void main(String[] args) {
        String returnValue = calcIfAreaPerimeter(2, 5, 14);
    }

    public static String calcIfAreaPerimeter(int width, int height, int givenCalculation){
        int area = width * height;
        int perimeter = (width + height)*2;

        if(givenCalculation == area){
            return "Area";
        } else if(givenCalculation == perimeter){
            return "Perimeter";
        } else {
            return "Neither";
        }
    }
}

// Step 4
// Can we make it better?
    // Efficiency
    // Readability
    // Maintainability
    // Use better conventions
        // Naming
        // DRY, Don't repeat yourself