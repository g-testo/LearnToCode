package com.gt;

public class StaticPractice {
    public static void main(String[] args) {
        // Room, static variable and an instance variable
        // numOfbeds, isDirty
        // 5 instances rooms


        // (static) numOfHotelRooms: 6
        // (static) roomsToClean: [ "room103", "room207", "roomPH1"]
        // (static method) markRoomToClean

        // RoomName, numOfBeds, isClean
        // room103, 3, false
        // room106, 2, true
        // room207, 1, false
        // room403, 2, true
        // roomPH1, 5, false
        // roomPH4, 7, true


//        Car car1 = new Car("Red");
//        Car car2 = new Car("Blue");
//        Car car3 = new Car("Purple");
//
//        car3.customMethod();
//
//        car3.staticMethod();

        BankAccount acct1 = new BankAccount("109","Bob", 745.00);
        BankAccount acct2 = new BankAccount("45","Susan", 1000.00);

        acct1.setInterestRate(3);

        acct2.setInterestRate(7);

        BankAccount.setInterestRate(10);

        System.out.println(BankAccount.getInterestRate());


    }
}

//class Car {
//    public String color;
//    public static int numOfWheels = 4;
//
//    public Car(String color){
//        this.color = color;
//    }
//    public void customMethod(){
//        System.out.println(this.color);
//    }
//
//    public static void staticMethod(){
////        System.out.println(this);
//    }
//
//}
