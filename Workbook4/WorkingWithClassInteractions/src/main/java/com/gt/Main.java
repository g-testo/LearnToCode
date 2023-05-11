package com.gt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Hotel
        // Reservation
        // Guest
        // Room

        Hotel hotel1 = new Hotel(1);
        Reservation reservation1 = new Reservation(1);
        Guest guest1 = new Guest(1);
        Room room1 = new Room(1);
    }
}

class Hotel{
    private int id;
    public Hotel(int id){
        this.id = id;
    }
    private ArrayList<Reservation> reservations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }
}
class Reservation{
    private int id;
    private Guest owner;
    private Room room;

    public Reservation(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Guest getOwner() {
        return owner;
    }

    public void setOwner(Guest owner) {
        this.owner = owner;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
class Guest{
    private int id;
    public Guest(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Room{
    private int id;
    public Room(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}