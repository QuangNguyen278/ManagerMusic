package com.example.managermusic.service;

import com.example.managermusic.repository.authorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class authorService {
    @Autowired
    private authorRepository authorRepository;
    public List<Object[]> findAuthorsWithMostPosts(){
        return authorRepository.findAuthorsWithMostPosts();
    }

}