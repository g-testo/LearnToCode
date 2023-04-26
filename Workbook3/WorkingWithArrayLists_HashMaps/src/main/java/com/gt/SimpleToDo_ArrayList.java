package com.gt;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

// Write a ToDo Java program that takes input from the user and adds the input to an ArrayList.
// The program should continue accepting input until the user types “done”.
// After the user types “done”, the program should print out all the elements
// in the ArrayList.


// 1:
// Create a program
// Takes in input from a user, String
// while user inputs anything but "done"
    // Add to an arraylist
// otherwise
    // Write the arraylist to a file
    // print out the arraylist for the user to see

public class SimpleToDo_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> inputs = new ArrayList<String>();

        String userInput;
        do{
            System.out.println("Please provide a ToDo item or enter \"done\" to exit");
            userInput = scanner.nextLine();
            if(!userInput.equalsIgnoreCase("done")){
                inputs.add(userInput);
            }
        } while(!userInput.equalsIgnoreCase("done"));

        System.out.println(inputs);

        try {
            FileWriter fileWriter = new FileWriter("./src/main/java/com/gt/inputsOutputted.txt");

            for(int i=0; i<inputs.size();i++){
                fileWriter.write(inputs.get(i) + "\n");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
