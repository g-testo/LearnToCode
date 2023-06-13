package com.gt;

import com.mysql.cj.jdbc.*;
import com.mysql.jdbc.*;

import java.sql.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String username = args[0];
        String password = args[1];
        try(
                Connection connection = DriverManager
                        .getConnection("jdbc:mysql://" +
                                username + ":" + password +
                                "@us-cdbr-east-06.cleardb.net/heroku_4fe1d93c00fe86e?reconnect=true"
                        );
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "SELECT * FROM hotels WHERE name LIKE ?"
                );
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            preparedStatement.setString(1, "St%");

            try(ResultSet results = preparedStatement.executeQuery()){
                while (results.next()) {
                    String hotel = results.getString("name");
                    int totalFloors = results.getInt("totalFloors");
                    System.out.println(totalFloors);
                    System.out.println(hotel);
                }
            }

        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}