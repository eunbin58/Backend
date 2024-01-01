package com.example.backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "db_conection")
public class Member {
    @Id
    @Column(name = "id",nullable = false,unique = true)
    private String id;
    @Column(name = "name",nullable = false)
    private String name;


    @Column(name = "pw",nullable = false)
    private String pw;
    @Column(name = "sex",nullable = false)
    private boolean sex;
    @Column(name = "email",nullable = true)
    private String email;