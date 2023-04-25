package com.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args){
        try {
            FileReader poemFile = new FileReader("./src/main/java/com/gt/poem.txt");
            BufferedReader bufferedReader = new BufferedReader(poemFile);

            String input;

            while((input = bufferedReader.readLine()) != null){
                System.out.println(input);
            }

            bufferedReader.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
