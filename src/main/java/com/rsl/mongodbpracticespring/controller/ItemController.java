package com.rsl.mongodbpracticespring.controller;

import com.rsl.mongodbpracticespring.doc_collection.Item;
import com.rsl.mongodbpracticespring.repository.ItemRepository;
import com.rsl.mongodbpracticespring.service.ItemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/person")
public class ItemController {
    private final ItemService itemService;
    private final ItemRepository itemRepository;

    public ItemController(com.rsl.mongodbpracticespring.repository.ItemRepository itemRepository,
                          ItemService itemService){
        this.itemRepository = itemRepository;
        this.itemService = itemService;
    }


    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Item add(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @GetMapping("/pageable")
    public Page<Item> getAllPageable(Pageable pageable) {
        return itemRepository.findAll(pageable);
    }

    @GetMapping()
    public List<Item> getAll() {
        return itemRepository.findAll();
    }




////-- without MongoDbRepository, with MongoCollection --NOT WORK
//    @PostMapping("/new-without-repo")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void addItem(@RequestBody Item item){ itemService.saveItem(item);
//    }
//
//    @GetMapping("/without-repo/{idString}")
//    public Item getAllItemPageable(@PathVariable String idString) {
//        return itemService.getItemById(idString);
//    }

}




