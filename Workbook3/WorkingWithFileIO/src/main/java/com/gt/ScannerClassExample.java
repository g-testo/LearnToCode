package com.gt;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        try
        {
            FileInputStream poemFile = new FileInputStream("./src/main/java/com/gt/poem.txt");
            Scanner scanner = new Scanner(poemFile);

            String input;

            while(scanner.hasNextLine()){
                input = scanner.nextLine();
                System.out.println(input);
            }

            scanner.close();
        }
        catch(IOException e){
            System.out.println("This is from the catch statement");
            e.printStackTrace();
        }
    }
}