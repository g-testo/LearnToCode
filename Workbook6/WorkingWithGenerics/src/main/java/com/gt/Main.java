package com.gt;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Wrappers
        // int, short, long, char, boolean, float, double, byte

//        int num = 25;
//        Integer num =  25;
//        System.out.println(num);

//        Boolean boolVar = true;
//        Byte byteVar = 0;
//        Float floatVar = 2.2f;

        /////////////////////////

        IntegerPair integerPair = new IntegerPair(10, 30);
        System.out.println(integerPair);
//        pair.swap();
//        System.out.println(pair);

        Pair<String> pairString = new Pair<>("First", "Second");
        pairString.setLeft("Third");
        Pair<Integer> pairInteger = new Pair<>(20, 25);
        Pair<Boolean> pairBoolean = new Pair<>(true, false);


        HashMap<String, Integer> hashMap = new HashMap<>();

    }
}