package com.example.springmybatis.da.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class InquiryViewN extends Inquiry {
    private List<InquiryTag> tags;
}
