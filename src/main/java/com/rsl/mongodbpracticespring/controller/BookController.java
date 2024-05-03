package com.rsl.mongodbpracticespring.controller;

import com.rsl.mongodbpracticespring.dto.BookRequest;
import com.rsl.mongodbpracticespring.dto.BookResponse;
import com.rsl.mongodbpracticespring.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public BookResponse add(@RequestBody BookRequest request) {
        return bookService.add(request);
    }


    @GetMapping
    public List<BookResponse> getAll() {
        return bookService.get();
    }
}
