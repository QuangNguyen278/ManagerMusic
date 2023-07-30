package com.example.managermusic.service;
import com.example.managermusic.repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.managermusic.model.Post;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class postService {
    @Autowired
    private postRepository postRepository;

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    public List<Object[]> getPostByGenreName(String genreName) {
        return postRepository.getPostByGenreName(genreName);
    }

    public List<Object[]> getPostByAuthorName(String author) {
        return postRepository.getPostByAuthorName(author);
    }

    public List<Object[]> getAllPosts() {
        return postRepository.getAllPosts();
    }

    public Set<Post> caug(String s) {
        String[] keyword = s.split(" ");
        Set<Post> list = new HashSet<>();
        for (String s1 : keyword) {
            list.addAll(postRepository.caug(s1));
        }
        return list;
    }

    public Set<Post> cauh(String s) {
        String[] keyword = s.split(" ");
        Set<Post> list = new HashSet<>();
        for (String s1 : keyword) {
            list.addAll(postRepository.cauh(s1));
        }
        return list;
    }

}