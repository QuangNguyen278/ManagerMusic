package com.example.managermusic.service;

import com.example.managermusic.model.Category;
import com.example.managermusic.repository.categoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoryService {
    @Autowired
    private categoryRepository categoryRepository;
    public List<Object[]> getGenredontHavePost(){
        return categoryRepository.getGenresdonthavePost();
    }
    public List<Object[]> getGenreHaveMaxPost(){
        return categoryRepository.getGenreHaveMaxPost();
    }
}
