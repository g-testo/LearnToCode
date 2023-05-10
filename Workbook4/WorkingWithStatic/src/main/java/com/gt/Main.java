package com.gt;

import java.util.ArrayList;

// (Static vs instance) methods and variables
public class Main {
    public static void main(String[] args) {
        CounterCalculator counterCalculator1 = new CounterCalculator(); // Instances
        CounterCalculator counterCalculator2 = new CounterCalculator(); // Instances

        counterCalculator1.instanceCounter++; // instanceCounter1: 1
        counterCalculator1.instanceCounter++; // instanceCounter1: 2
        counterCalculator1.instanceCounter++; // instanceCounter1: 3
        counterCalculator1.staticCounter++; // staticCounter1: 1
        counterCalculator1.staticCounter++; // staticCounter1: 2
        counterCalculator1.staticCounter++; // staticCounter1: 3

        counterCalculator2.instanceCounter++; // instanceCounter2: 1
        counterCalculator2.instanceCounter++; // instanceCounter2: 2
        counterCalculator2.instanceCounter++; // instanceCounter2: 3
        counterCalculator2.instanceCounter++; // instanceCounter2: 4
        counterCalculator2.instanceCounter++; // instanceCounter2: 5
        counterCalculator2.staticCounter++; // staticCounter2: 4
        counterCalculator2.staticCounter++; // staticCounter2: 5
        counterCalculator2.staticCounter++; // staticCounter2: 6
        counterCalculator2.staticCounter++; // staticCounter2: 7
        counterCalculator2.staticCounter++; // staticCounter2: 8


        System.out.println(counterCalculator1.staticCounter);
        System.out.println(counterCalculator2.staticCounter);
        System.out.println(CounterCalculator.staticCounter);


    }
}
class CounterCalculator {
    int instanceCounter = 0;
    static int staticCounter = 0;

    public void instanceIncrement(){
        instanceCounter++;
    }

    public static void staticIncrement(){
        staticCounter++;
    }

}
