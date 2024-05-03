package com.rsl.mongodbpracticespring.service;

import com.rsl.mongodbpracticespring.dto.BookRequest;
import com.rsl.mongodbpracticespring.dto.BookResponse;
import com.rsl.mongodbpracticespring.mapper.BookMapper;
import com.rsl.mongodbpracticespring.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookResponse add(BookRequest bookRequest){
        return bookMapper.toDTO(bookRepository.save(bookMapper.toDAO(bookRequest)));
    }

    public List<BookResponse> get(){
        return bookRepository.findAll().stream().map(bookMapper::toDTO).toList();
    }
}
