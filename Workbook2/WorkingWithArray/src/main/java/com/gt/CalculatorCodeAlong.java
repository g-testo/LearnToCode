package com.gt;

import java.util.Scanner;

public class CalculatorCodeAlong {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String command;

        Number[] numArr = new Number[20];

        numArr[0] = new Number(10);
        numArr[1] = new Number(30);
        numArr[2] = new Number(50);
        numArr[3] = new Number(80);
        numArr[4] = new Number(90);

        System.out.println(numArr[0]);

        do {
            printCommands();
            command = userInput.next();
            switch (command) {
                case "a":
                case "add":

                    System.out.println("Add");
                    handleAdd(10, 10);
                    break;
                case "s":
                case "subtract":
                    System.out.println("Subtract");
                    break;
                case "d":
                case "divide":
                    System.out.println("Divide");
                    break;
                case "m":
                case "multiply":
                    System.out.println("Multiply");
                    break;
                default:
                    System.out.println("Command not found");
            }
        } while(!command.equals("q"));
    }

    public static void printCommands(){
        System.out.println("Give me a command:");
        System.out.println("(a)dd");
        System.out.println("(s)ubtract");
        System.out.println("(d)ivide");
        System.out.println("(m)ulitply");
        System.out.println("(q)quit");
    }

    public static int handleAdd(int num1, int num2){
        // Ask user for two numbers
        return num1 + num2;
    }

}

class Number{
    int value;
    public Number(int value){
        this.value = value;
    }
}