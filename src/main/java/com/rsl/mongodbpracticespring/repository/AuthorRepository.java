package com.rsl.mongodbpracticespring.repository;

import com.rsl.mongodbpracticespring.doc_collection.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
