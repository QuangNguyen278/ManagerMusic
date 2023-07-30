package com.example.managermusic.controller;

import com.example.managermusic.model.Post;
import com.example.managermusic.service.postService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/posts")
public class postController {
    @Autowired
    private postService postService;
    @GetMapping
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
    @GetMapping("/category/{genreName}")
    public List<Object[]> getPostByGenreName(@PathVariable String genreName){
        return postService.getPostByGenreName(genreName);
    }

    @GetMapping("/author/{authorName}")
    public List<Object[]> getPostByAuthorName(@PathVariable String authorName){
        return postService.getPostByAuthorName(authorName);
    }
    @GetMapping("/all")
    public  List<Object[]> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/song/g/{keyword}")
    public Set<Post> getPosthaveSongkeys(@PathVariable String keyword){
        return postService.caug(keyword);
    }
    @GetMapping("/song/h/{keyword}")
    public Set<Post> getPosthaveSongOrTitlekeys(@PathVariable String keyword){
        return postService.cauh(keyword);
    }
}