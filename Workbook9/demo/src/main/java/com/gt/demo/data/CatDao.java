package com.gt.demo.data;

import com.gt.demo.models.Cat;

import java.util.List;

public interface CatDao {

    Cat create(Cat cat);
    List<Cat> getAll();
    Cat getById(Long id);
    void update(Long id, Cat cat);
    void delete(Long id);

}

//MVC Model, view, controller