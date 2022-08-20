package com.example.springmybatis.da.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Inquiry {
    private int id;
    private int sendUserId;
    private String contents;
    private boolean invalid;
    private LocalDateTime created;
}
