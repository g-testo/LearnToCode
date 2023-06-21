package com.gt.demo.controllers;

import com.gt.demo.data.CatDao;
import com.gt.demo.models.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
