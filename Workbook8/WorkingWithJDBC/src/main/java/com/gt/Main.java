package com.gt;

import com.mysql.cj.jdbc.*;
import com.mysql.jdbc.*;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("dbc:mysql://ba4aff20914505:6884f4ee@us-cdbr-east-06.cleardb.net/heroku_4fe1d93c00fe86e?reconnect=true");
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM hotels;";

            ResultSet results = statement.executeQuery(query);

            while(results.next()){
                String hotel = results.getString("name");
                System.out.println(hotel);
            }

            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}