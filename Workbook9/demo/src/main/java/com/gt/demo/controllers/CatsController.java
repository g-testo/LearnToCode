package com.gt.demo.controllers;

import com.gt.demo.data.CatDao;
import com.gt.demo.models.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/cats")
@CrossOrigin
public class CatsController {

    private CatDao catDao;

    @Autowired
    public CatsController(CatDao catDao){
        this.catDao = catDao;
    }

    @GetMapping
    public List<Cat> getAllCats() {
        return catDao.getAll();
    }

    @GetMapping("/{id}")
    public Cat getCatById(@PathVariable Long id){
        return catDao.getById(id);
    }

    @PostMapping
    @ResponseStatus(value= HttpStatus.CREATED)
    public Cat createCat(@RequestBody Cat cat){
        return catDao.create(cat);
    }

    @PutMapping("/{id}")
    public HashMap<String, String> updateCat(@PathVariable Long id, @RequestBody Cat cat){
        catDao.update(id, cat);

        HashMap<String, String> response = new HashMap<>();
        response.put("status", "Successful");
        response.put("message", "Cat updated successfully");
        return response;
    }

    @DeleteMapping("/{id}")
    public HashMap<String, String> deleteCat(@PathVariable Long id){
        catDao.delete(id);
        HashMap<String, String> response = new HashMap<>();
        response.put("status", "Successful");
        response.put("message", "Cat deleted successfully");
        return response;
    }


}
