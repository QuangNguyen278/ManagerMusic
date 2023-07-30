package com.example.managermusic.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "theloai")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_tloai")
    private int id;
    @Column(name = "ten_tloai", nullable = false)
    private String name;
}
