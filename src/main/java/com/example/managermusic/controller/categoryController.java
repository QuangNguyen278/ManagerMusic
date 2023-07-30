package com.example.managermusic.controller;

import com.example.managermusic.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/genre")
public class categoryController {
    @Autowired
    private categoryService categoryService;

    @GetMapping("/notpost")
    public List<Object[]> getGenredontHavePost(){
        return categoryService.getGenredontHavePost();
    }

    @GetMapping("/maxpost")
    public List<Object[]> getGenreHaveMaxPost(){
        return categoryService.getGenreHaveMaxPost();
    }
}
