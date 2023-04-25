package com.gt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExercise {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("./src/main/java/com/gt/animalsOutput.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Jaguar\n");
            bufferedWriter.write("Gorilla\n");
            bufferedWriter.write("Water spider\n");
            bufferedWriter.write("Spider monkeys\n");

//            for(int i=0;i<100_000;i++){
//                bufferedWriter.write(String.format("%d\n", i));
//            }

            bufferedWriter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
