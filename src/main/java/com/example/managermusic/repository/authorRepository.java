package com.example.managermusic.repository;

import com.example.managermusic.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface authorRepository extends JpaRepository<Author,Integer> {
    @Query("select a from Post p join p.author a group by a.id order by count (p.id) desc limit 2")
    public List<Object[]> findAuthorsWithMostPosts();
}
