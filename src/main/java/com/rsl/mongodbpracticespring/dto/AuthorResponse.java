package com.rsl.mongodbpracticespring.dto;

import lombok.Data;

@Data
public class AuthorResponse {
    private String id;
    private String name;
    private Integer birthYear;
    private String nationality;
}
