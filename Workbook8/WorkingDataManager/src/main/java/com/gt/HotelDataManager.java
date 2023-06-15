package com.gt;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

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

    public List<Hotel> searchByName(String nameToSearchBy){ // "fun"
        String query = "SELECT * FROM hotels WHERE name LIKE '%?%';";
        // SELECT * FROM hotels WHERE name LIKE '%fun%';
        return null;
    }

    public List<Hotel> filterByTotalOccupancy(int totalOccupancy, String comparator){
        if(comparator.equalsIgnoreCase("greater")){
            return null;
        } else {
            return null;
        }
    }

    public void create(Hotel hotel){
        String query = "INSERT INTO hotels(name, totalFloors, totalOccupancy) VALUES(?, ?, ?);";

        try(
                Connection connection = this.basicDataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setString(1,  hotel.getName());
            preparedStatement.setInt(2, hotel.getTotalFloors());
            preparedStatement.setInt(3, hotel.getTotalOccupancy());

            int rows = preparedStatement.executeUpdate();
            System.out.printf("Rows updated %d\n", rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Hotel hotel){
        // Create a query
        String query = "UPDATE hotels SET name=?, totalFloors=?, totalOccupancy=? WHERE id=?;";

        // Make a connection / prepare statement
        try(
                Connection connection = this.basicDataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            // Set parameters
            preparedStatement.setString(1, hotel.getName());
            preparedStatement.setInt(2, hotel.getTotalFloors());
            preparedStatement.setInt(3, hotel.getTotalOccupancy());
            preparedStatement.setInt(4, id);

            // Execute prepared statement
            int rows = preparedStatement.executeUpdate();

            // Print confirmation
            System.out.printf("Rows updated %d\n", rows);

        }catch (SQLException e) {
            // Handle errors
            e.printStackTrace();
        }
    }

    public void delete(int id){
        // Create a query
        String query = "DELETE FROM hotels WHERE id=?;";
        // Make a connection / prepare statement
        try(
                Connection connection = this.basicDataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            // Set parameters
            preparedStatement.setInt(1, id);

            // Execute prepared statement
            int rows = preparedStatement.executeUpdate();

            // Print confirmation
            System.out.printf("Rows updated %d\n", rows);

        }catch (SQLException e) {
            // Handle errors
            e.printStackTrace();
        }
    }
}
