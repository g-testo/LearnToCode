package com.gt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp2.BasicDataSource;

public class JDBC_DataSourceExample {
    public static void main(String[] args) {
        // Create a DataSource object
        BasicDataSource dataSource = new BasicDataSource();

        // Set database connection details
        dataSource.setUrl("jdbc:mysql://ba4aff20914505:6884f4ee@us-cdbr-east-06.cleardb.net/heroku_4fe1d93c00fe86e?reconnect=true");
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM hotels;";

            ResultSet results = statement.executeQuery(query);

            // Process the result set
            while (results.next()) {
                String hotel = results.getString("Name");
                System.out.println(hotel);
            }
            connection.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}