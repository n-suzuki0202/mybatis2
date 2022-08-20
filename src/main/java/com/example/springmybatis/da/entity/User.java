package com.example.springmybatis.da.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private int id;
    private String userName;
    private String email;

    private LocalDateTime created;

    private String memo;
}
