package com.gt;

class Employee {
    private int employeeId;
    private String name;
    private String department;
    private float payRate;
    private int hoursWorked;

    public Employee(int employeeId, String name, String department, float payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public float getTotalPay(){
        return this.payRate * this.hoursWorked;
    }
    public int getRegularHours(){
        if(this.hoursWorked > 40){
            return 40;
        } else {
            return this.hoursWorked;
        }
    }
    public int getOvertimeHours(){
        if(this.hoursWorked > 40){
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }


}