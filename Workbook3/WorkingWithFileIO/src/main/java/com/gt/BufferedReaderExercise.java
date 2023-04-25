package com.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class BufferedReaderExercise {
    public static void main(String[] args){

        try {
            FileReader employeeDataFile = new FileReader("./src/main/java/com/gt/employeeData.txt");
            BufferedReader bufferedReader = new BufferedReader(employeeDataFile);

            String input;

            while((input = bufferedReader.readLine()) != null){
                String[] splitInput = input.split(Pattern.quote("|")); // [ "10", "Dana Wyatt", "52.5", "12.50" ]

                int employeeIdInput = Integer.parseInt(splitInput[0]);
                String employeeNameInput = splitInput[1];
                float employeeHoursWorkedInput = Float.parseFloat(splitInput[2]);
                float employeePayRateInput = Float.parseFloat(splitInput[3]);

                Employee currentEmployee = new Employee(employeeIdInput, employeeNameInput, employeeHoursWorkedInput, employeePayRateInput);

                System.out.printf("Employee Id: %d, Name: %s, Gross Pay: $%.2f\n",
                        currentEmployee.getEmployeeId(),
                        currentEmployee.getName(),
                        currentEmployee.getGrossPay()
                );
//                System.out.println(currentEmployee);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Understand the problem: Create examples
        // Create a plan: PseudoCode
            //Tools:
            // .split
            // Create a file

        // Implement plan: Create code
        // Look back: Refactor
    }
}

class Employee {
    private int employeeId;
    private String name;
    private float hoursWorked;
    private float payRate;

    public Employee(int employeeId, String name, float hoursWorked, float payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float getGrossPay(){
        return this.payRate * this.hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee Id: " + this.employeeId + ", Name: " + this.name + ", Gross Pay: " + getGrossPay();
    }
}
