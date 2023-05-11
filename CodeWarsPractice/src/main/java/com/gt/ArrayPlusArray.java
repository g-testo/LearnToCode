package com.gt;

public class ArrayPlusArray {
    public static void main(String[] args) {
        arrayPlusArray(new int[] {1,2,3}, new int[] {4,5,6});
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
//        arr1: [1,2,3] 6
//        arr2: [4,5,6] 15
//        Output: 21

        // Accumulator pattern

        // 1: create a variable for accumulation
        // 2: Iterate/loop through
            // 3: Accumulating
        int total = 0; // 0+1, 1+2=3, 3+3=6
        for(int i=0;i<arr1.length;i++){
            total += arr1[i];
            // index (i): 0, 1, 2
            // element value (arr1[i]):  1, 2, 3
        }
        for(int i=0;i<arr2.length;i++){
            total += arr2[i];
            // index (i): 0, 1, 2
            // element value (arr1[i]):  4, 5, 6
        }
        return total;
    }

}