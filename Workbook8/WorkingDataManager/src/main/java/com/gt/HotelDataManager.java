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

    public HotelDataManager(BasicDataSource dataSource) {
        this.basicDataSource = dataSource;
    }

    public List<Hotel> getAllHotels() {
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
}
