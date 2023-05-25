package com.gt;

public class Employee {
    private String firstName;
    private String lastName;
    private boolean hasEarnedEmployeeOfMonth;

    public Employee(String firstName, String lastName, boolean hasEarnedEmployeeOfMonth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hasEarnedEmployeeOfMonth = hasEarnedEmployeeOfMonth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean getHasEarnedEmployeeOfMonth() {
        return hasEarnedEmployeeOfMonth;
    }

    public void setHasEarnedEmployeeOfMonth(boolean hasEarnedEmployeeOfMonth) {
        this.hasEarnedEmployeeOfMonth = hasEarnedEmployeeOfMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hasEarnedEmployeeOfMonth=" + hasEarnedEmployeeOfMonth +
                '}';
    }
}
