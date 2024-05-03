package com.rsl.mongodbpracticespring.repository;

import com.rsl.mongodbpracticespring.doc_collection.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
