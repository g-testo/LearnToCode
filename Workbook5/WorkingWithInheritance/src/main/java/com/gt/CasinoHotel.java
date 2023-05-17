package com.gt;

public class CasinoHotel extends Hotel {
    private String nameOfCasino;
    private double revenueFromCasino;

    public CasinoHotel(int numberOfRooms){
        super(numberOfRooms);
    }
    public CasinoHotel(int numberOfRooms, String nameOfCasino, double revenueFromCasino){
        super(numberOfRooms);
        this.nameOfCasino = nameOfCasino;
        this.revenueFromCasino = revenueFromCasino;
    }

    public String getNameOfCasino() {
        return nameOfCasino;
    }

    public void setNameOfCasino(String nameOfCasino) {
        this.nameOfCasino = nameOfCasino;
    }

    public double getRevenueFromCasino() {
        return revenueFromCasino;
    }

    public void setRevenueFromCasino(double revenueFromCasino) {
        this.revenueFromCasino = revenueFromCasino;
    }

    @Override
    public String toString() {
        return "CasinoHotel{" +
                "nameOfCasino='" + nameOfCasino + '\'' +
                ", revenueFromCasino=" + revenueFromCasino +
                ", numberOfRooms=" + super.getNumberOfRooms() +
                '}';
    }
}
