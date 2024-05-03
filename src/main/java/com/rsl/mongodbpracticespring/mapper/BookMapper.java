package com.rsl.mongodbpracticespring.mapper;

import com.rsl.mongodbpracticespring.doc_collection.Book;
import com.rsl.mongodbpracticespring.dto.BookRequest;
import com.rsl.mongodbpracticespring.dto.BookResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class BookMapper {
    @Mapping(source = "author", target = "author")
    public abstract Book toDAO(BookRequest bookRequest);

    @Mapping(source = "author", target = "author")
    public abstract BookResponse toDTO(Book book);
}
