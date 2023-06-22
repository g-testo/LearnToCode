package com.gt.demo.data.mysql;

import com.gt.demo.data.CatDao;
import com.gt.demo.models.Cat;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
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
        String sql = "INSERT INTO cats(name, color, image_url) VALUES(?,?,?);";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ){
            preparedStatement.setString(1, cat.getName());
            preparedStatement.setString(2, cat.getColor());
            preparedStatement.setString(3, cat.getImageUrl());

            preparedStatement.executeUpdate();

            try (
                    ResultSet generatedKeys = preparedStatement.getGeneratedKeys()
            ){
                if(generatedKeys.next()){
                    Long id = generatedKeys.getLong(1);
                    cat.setId(id);
                    return cat;
                } else {
                    System.out.println("Cat creation unsuccessful");
                }
            }


        } catch(SQLException e){
            e.printStackTrace();
        }
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
        String sql = "SELECT * FROM cats WHERE id=?;";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setLong(1, id);

            try(
                ResultSet resultSet = preparedStatement.executeQuery();
            ){
                if(resultSet.next()){
                    return catShaper(resultSet);
                } else {
                    System.out.println("Kitty cat not found.");
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Long id, Cat cat) {
        String sql = "UPDATE cats SET name=?, color=?, image_url=? WHERE id=?";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setString(1, cat.getName());
            preparedStatement.setString(2, cat.getColor());
            preparedStatement.setString(3, cat.getImageUrl());
            preparedStatement.setLong(4, id);

            preparedStatement.executeUpdate();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM cats WHERE id=?";

        try(
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
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
