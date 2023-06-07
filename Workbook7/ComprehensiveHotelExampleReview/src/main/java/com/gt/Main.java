package com.gt;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hotel gregsGregariousGamesAndFun = new Hotel();
        gregsGregariousGamesAndFun.addFloor();
        gregsGregariousGamesAndFun.addFloor();
        gregsGregariousGamesAndFun.addFloor();

        ArrayList<Floor> currentFloors = gregsGregariousGamesAndFun.getFloors();

        System.out.println(currentFloors);

    }

}
// Create an application for a Hotel
// Keeping track of billing, reservations, appointments, occupancy, room service, foodOrders, service request

// UI / User Journey
    // Home Screen
        // Check in/out
        // Booking a room

// System Design

    // Hotel
        // Floor - Hotel has many floors
            // Room - Floor has many rooms

    // Amenity - Hotel has many amenities
        // Restaurant - Hotel has any restaurant
        // Casino - Hotel has many Casinos
        // Pool - Hotel has many Pools
        // Gym - Hotel has many Gyms
        // Spa - Hotel has many Spa


    // Physical Locations
        // Atrium
        // Parking Lot -  Hotel has many parking lots
            // Parking Spot - Parking Lot has many parking spots
        // Lobby - Hotel has a lobby
            // Front Desk - Lobby has a front desk
    // Services


    // Equipment Hotel has many/a lot of equipment
        // Poker table
        // Air conditioner
        // Beds

    // Customers Hotel has many customers

    // Services Hotel has many services
        // Services has room service


    // Kitchen - Restaurant has a kitchen


    // Reservation
    // Order
        // Food Orders
    // Appointment
    // Service request






// Hotel
    // id (Primary Key)
    // name

// Floor
    // id (Primary Key)
    // number
    // hotelId (Foreign key)

// Room
    // id (Primary Key)
    // number
    // floorId (Foreign key)
