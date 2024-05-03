package com.rsl.mongodbpracticespring.service;

import com.rsl.mongodbpracticespring.dto.AuthorRequest;
import com.rsl.mongodbpracticespring.dto.AuthorResponse;
import com.rsl.mongodbpracticespring.mapper.AuthorMapper;
import com.rsl.mongodbpracticespring.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    public AuthorResponse add(AuthorRequest authorRequest){
        return authorMapper.toDTO(authorRepository.save(authorMapper.toDAO(authorRequest)));
    }

    public List<AuthorResponse> get(){
        return authorRepository.findAll().stream().map(authorMapper::toDTO).toList();
    }
}
