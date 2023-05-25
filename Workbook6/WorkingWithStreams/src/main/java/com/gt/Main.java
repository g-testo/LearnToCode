package com.gt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee greg = new Employee("Greg", "T", false);
        Employee scarlet = new Employee("Scarlet", "C", true);
        Employee pavel = new Employee("Pavel", "N", true);
        // ...

        ArrayList<Employee> employees = new ArrayList<>(
                Arrays.asList(greg, scarlet, pavel)
        );

//        employees.forEach(employee -> {
//            System.out.println(employee.getFirstName());
//        });

        List<String> filteredList = employees.stream()
                .filter(employee -> employee.getHasEarnedEmployeeOfMonth())
                .sorted((employee1, employee2)->employee1.getFirstName().compareTo(employee2.getFirstName()))
                .map((employee)->employee.getFirstName())
                .collect(Collectors.toList());
//
        System.out.println(filteredList);

//        Stream<Employee> employeeStream = employees.stream();
//        Stream<Employee> filteredStream = employeeStream.filter(employee -> employee.getHasEarnedEmployeeOfMonth());
//        Stream<Employee> sortedStream = filteredStream.sorted((employee1, employee2)->employee1.getFirstName().compareTo(employee2.getFirstName()));
//        List<Employee> filteredList = sortedStream.collect(Collectors.toList());

        // Sort
        // Collect total of EOMs
        //

    }
}