package com.gt;

import com.mysql.cj.jdbc.*;
import com.mysql.jdbc.*;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world");


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}