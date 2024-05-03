package com.rsl.mongodbpracticespring.dto;

import lombok.Data;

@Data
public class BookResponse {
    private String id;
    private String title;
    private AuthorResponse author;
    private String genre;
    private Integer publicationYear;
}
