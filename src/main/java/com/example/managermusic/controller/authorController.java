package com.example.managermusic.controller;

import com.example.managermusic.service.authorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class authorController {
    @Autowired
    private authorService authorService;
    @GetMapping("/mostpost")
    public List<Object[]> findAuthorsWithMostPost(){
        return authorService.findAuthorsWithMostPosts();
    }

}

