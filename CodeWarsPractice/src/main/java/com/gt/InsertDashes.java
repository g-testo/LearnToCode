package com.gt;

public class InsertDashes {
    public static void main(String[] args) {
        String result = insertDash(454793);
        System.out.println(result);
    }

    public static String insertDash(int num) { // Input: 454793

        // Convert num into String // "454793"
        String numStrings = Integer.toString(num);

        // Split into array of string numbers
        String[] stringArr = numStrings.split("");
        // [ "4", "5", "4", "7", "9", "3" ];

        // Create a string variable to store answer
        String strWithDashes = "";

        // Iterate through array of string nums
        for(int i=0;i < stringArr.length; i++) {

            boolean isLastEl = (i == stringArr.length-1);

            strWithDashes += stringArr[i];

            if (isLastEl) return strWithDashes;

            int currentNum = Integer.parseInt(stringArr[i]);
            int nextNum = Integer.parseInt(stringArr[i + 1]);

            boolean isCurrentNumOdd = currentNum % 2 == 1;
            boolean isNextNumOdd = nextNum % 2 == 1;

            // if current stringNum is odd and the next number is odd
            if (isCurrentNumOdd && isNextNumOdd) {
                strWithDashes += "-";
            }
        }
        return strWithDashes; // "4547-9-3"
    }
}
