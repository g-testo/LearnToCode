package com.second;

// Method, arguments, parameters, calling/invoking, return value, access modifier, static modifier, primitives, classes

public class Main {
    public static void main(String[] args) {
        int volume = calculateVolume(5,7,10);

        String word = "bird";
        boolean isPalindromeResult = isPalindrome(word);

        int[] numArr = new int[] {1,2,3,4,5};
        int minVal = findMin(numArr);

        String mySentence = "Bird is the word";
        int wordCount = countWords(mySentence);

        int[] numbers = new int[] {10, 5, 9, 2, 1, 5};
        int[] descendingNumbers = sortDescending(numbers);

        String name1 = "greGorIo";
        String capitalizedName1 = capitalize(name1);

        String name2 = "joSE";
        String capitalizedName2 = capitalize(name2);

    }

    public static int calculateVolume(int length, int width, int height){
        return 0; // Write logic here
    }

    public static boolean isPalindrome(String str){
        return true; // Write logic here
    }

    public static int findMin(int[] numList){
        return 0; // Write logic here
    }

    public static int countWords(String sentence){
        return 0; // Write logic here
    }

    public static int[] sortDescending(int[] nums){
        return new int[]{}; // Write logic here
    }

    public static String capitalize(String str){
        return "";
    }

}
