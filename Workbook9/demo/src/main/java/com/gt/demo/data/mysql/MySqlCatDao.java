package com.gt.demo.data.mysql;

import com.gt.demo.data.CatDao;
import com.gt.demo.models.Cat;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MySqlCatDao implements CatDao {
    private DataSource dataSource;

    @Autowired
    public MySqlCatDao(BasicDataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public Cat create(Cat cat) {
        return null;
    }

    @Override
    public List<Cat> getAll() {
        List<Cat> cats = new ArrayList<>();

        String sql = "SELECT * FROM cats;";
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {

            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

        } catch(SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Cat getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Cat cat) {

    }

    @Override
    public void delete(Long id) {

    }
}
