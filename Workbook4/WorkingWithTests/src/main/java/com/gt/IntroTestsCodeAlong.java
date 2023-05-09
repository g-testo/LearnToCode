package com.gt;

public class IntroTestsCodeAlong {
    public static void main(String[] args) {
        int result = sum(50, 100);
        // assert given 50 and 100 it should give us 150; >> Pass
        // assertion given 0 and 0 it should give us 0; >> Pass
        // assert given 10 and 20 it should give us 30; >> Pass

    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
}
