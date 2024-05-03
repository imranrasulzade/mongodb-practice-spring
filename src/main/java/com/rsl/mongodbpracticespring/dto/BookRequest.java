package com.rsl.mongodbpracticespring.dto;

import com.rsl.mongodbpracticespring.doc_collection.Author;
import lombok.Data;

@Data
public class BookRequest {
    private String title;
    private Author author;
    private String genre;
    private Integer publicationYear;
}
