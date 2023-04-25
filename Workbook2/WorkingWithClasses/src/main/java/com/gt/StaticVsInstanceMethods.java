package com.gt;

import java.util.*;
public class StaticVsInstanceMethods {
    public static void main(String[] args){
//        Car myCar = new Car();
//        myCar.name = "Batmobile!";
//        System.out.println(myCar.getName());
//
//        Car yourCar = new Car();
//        yourCar.name = "Sheldon";
//        System.out.println(yourCar.getName());

        Math.random();
        Scanner myScan = new Scanner(System.in);
        myScan.nextInt();


    }
}

class Car{
    String name;
    static int totalCarsCreated;

    // Instance Method
    public String getName(){
        return this.name;
    }

    public static void honk(){
        System.out.println("AAaaaarrooooooooggggaaahhhhh");
    }
}


class Calculator{
    int number1;
    int number2;

    public int addInstance(){
        return this.number1 + this.number2;
    }

    public static int addStatic(int num1, int num2) {
        return num1 + num2;
    }
}
