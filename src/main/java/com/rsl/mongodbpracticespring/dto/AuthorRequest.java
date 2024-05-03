package com.rsl.mongodbpracticespring.dto;

import lombok.Data;

@Data
public class AuthorRequest {
    private String name;
    private Integer birthYear;
    private String nationality;
}
