package com.example.managermusic.repository;

import com.example.managermusic.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface postRepository extends JpaRepository<Post,Integer> {
    @Query("select p from Post p join p.category g where g.name=:genreName")
    List<Object[]> getPostByGenreName(String genreName);
    @Query("select p from Post p join p.author a where a.name=:authorName")
    List<Object[]> getPostByAuthorName(String authorName);
    @Query("select  p.id, p.title,p.author.name,p.songName,p.category.name, p.date  from Post p")
    List<Object[]> getAllPosts();
    @Query("select p from Post p where p.songName like %:keyword%")
    Set<Post> caug(String keyword);
    @Query("select p from Post p where p.songName like %:keyword% or p.title like %:keyword%")
    Set<Post> cauh(String keyword);
}

