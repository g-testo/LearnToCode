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

                Cat cat = catShaper(resultSet);

                cats.add(cat);
            }

        } catch(SQLException e){
            e.printStackTrace();
        }

        return cats;
    }

    @Override
    public Cat getById(Long id) {
        String sql = "SELECT * FROM cats WHERE id=?";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setLong(1, id);

            try(
                ResultSet resultSet = preparedStatement.executeQuery();
            ){
                if(resultSet.next()){
                    Cat cat = catShaper(resultSet);
                }
            }


        } catch(SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(Long id, Cat cat) {

    }

    @Override
    public void delete(Long id) {

    }

    public Cat catShaper(ResultSet resultSet) throws SQLException {
        Long id = resultSet.getLong("id");
        String name = resultSet.getString("name");
        String color = resultSet.getString("color");
        String imageUrl = resultSet.getString("image_url");
        Cat cat = new Cat(id, name, color, imageUrl);
        return cat;
    }

}