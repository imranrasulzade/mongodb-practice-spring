package com.rsl.mongodbpracticespring.doc_collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "people")
@Data
public class Item {

    @Id
    private String id;
    private String name;
    private int age;

    public Item(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}