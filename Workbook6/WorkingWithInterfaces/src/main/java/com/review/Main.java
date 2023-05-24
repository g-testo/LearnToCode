package com.review;

public class Main {
    public static void main(String[] args) {
//        int area = calculateArea(5, 7);
//        System.out.println(area);

//        boolean isPrimeResult = isPrime(18);
//        System.out.println(isPrimeResult);

//        int[] numbers = new int[]{1,2,3,4,5};
//        int maxResult = findMax(numbers);
//        System.out.println(maxResult);

//        String reversedStringResult = reverseString("racecar");
//        System.out.println(reversedStringResult);

//        int[] numbers = new int[]{4,3,6,2,6};
//        int[] sortedNumsResult = sortArray(numbers);
//        System.out.println(sortedNumsResult);


    }

    public static int calculateArea(int length, int width){
        return length * width;
    }

    public static boolean isPrime(int num){
        for(int i=2;i<=Math.ceil(num/2);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int findMax(int[] numbers){
        // Variable store Max number at zero
        // For loop
        return 0;
    }

    public static String reverseString(String stringToReverse){
        return "";
    }

    public static int[] sortArray(int[] numbers){
        return new int[]{};
    }


}
