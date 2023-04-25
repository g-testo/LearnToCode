package com.gt;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExercise {
    public static void main(String[] args) {
//        Scanner is to BufferedReader
//        fileWriter is to BufferedWriter
        try {
            FileWriter fileWriter = new FileWriter("./src/main/java/com/gt/animalsOutput.txt");
            fileWriter.write("Kissy poison dart frog\n");
            fileWriter.write("Toucan\n");
            fileWriter.write("Monkey\n");
            fileWriter.write("Cute Ant Eater\n");

            System.out.println("Animals saved to file successfully");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Animals saved to file failed");
            e.printStackTrace();
        }

    }
}
