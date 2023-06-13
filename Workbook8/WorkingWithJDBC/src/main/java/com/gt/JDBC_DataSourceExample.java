package com.gt;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

public class JDBC_DataSourceExample {
    public static void main(String[] args) {

        String username = args[0];
        String password = args[1];

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://us-cdbr-east-06.cleardb.net/heroku_4fe1d93c00fe86e?reconnect=true");

        dataSource.setUsername(username);
        dataSource.setPassword(password);

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM hotels;");
        ) {

            try (
                    ResultSet resultSet = preparedStatement.executeQuery()
            ) {
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    System.out.println(name);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}