package com.rsl.mongodbpracticespring.doc_collection;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authors")
@Data
public class Author {
    @Id
    private String id;
    private String name;
    private Integer birthYear;
    private String nationality;

}
