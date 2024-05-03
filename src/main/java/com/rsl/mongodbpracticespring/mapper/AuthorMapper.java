package com.rsl.mongodbpracticespring.mapper;

import com.rsl.mongodbpracticespring.doc_collection.Author;
import com.rsl.mongodbpracticespring.dto.AuthorRequest;
import com.rsl.mongodbpracticespring.dto.AuthorResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class AuthorMapper {

    public abstract Author toDAO(AuthorRequest authorRequest);

    public abstract AuthorResponse toDTO(Author author);
}
