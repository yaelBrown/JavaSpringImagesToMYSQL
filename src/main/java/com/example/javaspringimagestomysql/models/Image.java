package com.example.javaspringimagestomysql.models;

import javax.persistence.*;

@Entity
@Table(name = "imgs")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(11) UNSIGNED")
    private long id;



}
