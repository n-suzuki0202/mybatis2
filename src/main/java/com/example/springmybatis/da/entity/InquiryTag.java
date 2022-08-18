package com.example.springmybatis.da.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InquiryTag {
  private int id;
  private int inquiryId;
  private String description;
  private LocalDateTime created;
}
