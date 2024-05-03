package com.rsl.mongodbpracticespring.doc_collection;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Data
public class Book {
    @Id
    private String id;
    private String title;
    private Author author;
    private String genre;
    private Integer publicationYear;

}
