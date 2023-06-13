package com.gt;

public class InsertDashes {
    public static void main(String[] args) {
        // Convert num into String // "454793"
        String result = insertDash(454793);
        System.out.println(result);
    }

    public static String insertDash(int num) { // 454793
        String numStrings = Integer.toString(num);

        String[] stringArr = numStrings.split("");
        // [ "4", "5", "4", "7", "9", "3" ];

        String strWithDashes = "";

        for(int i=0;i < stringArr.length; i++){
            // if current stringNum is odd and the next number is odd
                // Add a dash

            boolean isNotLastEl = (i != stringArr.length-1);
            boolean isCurrentNumOdd = Integer.parseInt(stringArr[i]) % 2 == 1;
            boolean isNextNumOdd = Integer.parseInt(stringArr[i+1]) % 2 == 1;
            if(isNotLastEl && isCurrentNumOdd && isNextNumOdd){
                strWithDashes += "-";
            }

            strWithDashes += stringArr[i];
        }

        return strWithDashes; // "4547-9-3"
    }

}
