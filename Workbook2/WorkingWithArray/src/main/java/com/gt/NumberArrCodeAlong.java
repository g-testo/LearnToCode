package com.gt;

import java.util.Arrays;import java.util.Arrays;


public class NumberArrCodeAlong {
    public static void main(String[] args){
        // Ways to access static methods
        // Accessing a method from a different class i.e. Main class
//        Main.methodInAnotherClass();
//        int[] nums = {1, 2, 4, 8, 16, 32};
//        int result = sum(nums);
//        System.out.println(result);
        ////////////
        // Given a number, num, return an array that starts at 0 and counts up to num
        // input: (int) 5, output: (int[]) [0, 1, 2, 3, 4]
        // input: (int) 9, output: (int[]) [0, 1, 2, 3, 4, 5, 6, 7, 8]

//        int[] result = numArrGenny(12); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
//        System.out.println(Arrays.toString(result));

        /////////////

        int[] unsortedArray = {7, 15, 3, 21, 100, 55, 1}; // Location: 43543534
        int[] unsortedCopyArray = new int[4]; // Location: 4748844

//        for(int i=0;i<unsortedArray.length;i++){
//            unsortedCopyArray[i] = unsortedArray[i];
//        }
        System.arraycopy(unsortedArray, 3, unsortedCopyArray,0, 4);

        Arrays.sort(unsortedArray);

        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(unsortedCopyArray));

    }
    public static int[] numArrGenny(int num){
        int[] numArr = new int[num];
        for(int i=0;i<num;i++){
            numArr[i] = i;
        }
        return numArr;
    }


    // Accumulator pattern
    public static int sum(int[] numsToAdd){ // Utility method, helper method
        // 1: Create a variable, accumulator
        int total = 0;
        // 2: Create a loop/Iterate
        for(int i=0;i<numsToAdd.length;i++){
            // 3: Accumulate
            total += numsToAdd[i];
        }
        // 4: return
        return total;
    }
    // Method overloading
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

}
