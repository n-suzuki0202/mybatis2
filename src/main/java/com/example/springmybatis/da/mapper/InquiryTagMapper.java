package com.example.springmybatis.da.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.springmybatis.da.entity.InquiryTag;
import com.example.springmybatis.da.query.InquiryTagSelectQuery;

@Repository
@Mapper
public interface InquiryTagMapper {
  InquiryTag find(int id);
  List<InquiryTag> select(InquiryTagSelectQuery query);
  
}
