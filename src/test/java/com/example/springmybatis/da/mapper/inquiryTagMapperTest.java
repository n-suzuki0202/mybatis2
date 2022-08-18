package com.example.springmybatis.da.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class inquiryTagMapperTest {
  @Autowired
  InquiryTagMapper inquiryTagMapper;
  
  @Test
  void find() {
    var inquiryTag = inquiryTagMapper.find(1);
    assertNotNull(inquiryTag);
    assertEquals("問い合わせ", inquiryTag.getDescription());
  }
}
