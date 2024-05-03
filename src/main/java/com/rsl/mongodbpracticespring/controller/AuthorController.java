package com.rsl.mongodbpracticespring.controller;

import com.rsl.mongodbpracticespring.dto.AuthorRequest;
import com.rsl.mongodbpracticespring.dto.AuthorResponse;
import com.rsl.mongodbpracticespring.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("author")
public class AuthorController {
    private final AuthorService authorService;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public AuthorResponse add(@RequestBody AuthorRequest request) {
        return authorService.add(request);
    }


    @GetMapping
    public List<AuthorResponse> getAll() {
        return authorService.get();
    }
}
