package com.gt;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HotelDataManager {
    private BasicDataSource basicDataSource;

    public HotelDataManager(BasicDataSource basicDataSource) {
        this.basicDataSource = basicDataSource;
    }

    public List<Hotel> getAll() {
        List<Hotel> hotels = new ArrayList<>();

        String query = "SELECT * FROM hotels;";

        try (
                Connection connection = this.basicDataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int totalFloors = resultSet.getInt("totalFloors");
                int totalOccupancy = resultSet.getInt("totalOccupancy");

                Hotel hotel = new Hotel(id, name, totalFloors, totalOccupancy);

                hotels.add(hotel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hotels;
    }

    public Hotel getById(int id){
        Hotel hotel = null;
        String query = "SELECT * FROM hotels WHERE id=?;";

        try (
                Connection connection = this.basicDataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1, id);
            try(
                    ResultSet resultSet = preparedStatement.executeQuery();
            ){
                if(resultSet.next()){
                    int idFromDB = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int totalFloors = resultSet.getInt("totalFloors");
                    int totalOccupancy = resultSet.getInt("totalOccupancy");

                    hotel = new Hotel(idFromDB, name, totalFloors, totalOccupancy);
                } else {
                    System.out.println("No hotel found with that id");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hotel;
    }

    public void create(Hotel hotel){

    }

    public void delete(int id){

    }

    public void update(int id, Hotel hotel){

    }

    // Create, Read, Update, Delete
    // ReadAll, Read by id




}
