package com.gt;

public class ExerciseCreatingClasses {
    public static void main(String[] args) {

    }
}

class Room{
    private int numOfBeds;
    private float price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numOfBeds, float price, boolean isOccupied, boolean isDirty) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable(){
        return !isOccupied && !isDirty;
    }
}

class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public float getPrice(){
        String lcRoomType = this.roomType.toLowerCase();

        float roomPrice;

        if(lcRoomType.equals("king")){
            roomPrice = 139.00f;
        } else if(lcRoomType.equals("double")){
            roomPrice = 124.00f;
        } else {
            roomPrice = 139.00f;
        }

        if(this.isWeekend){
            return roomPrice*1.1f;
        } else {
            return roomPrice;
        }
    }
    public float getReservationTotal(){
        float pricePerNight = this.getPrice();
        return pricePerNight * this.numberOfNights;
    }
}

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