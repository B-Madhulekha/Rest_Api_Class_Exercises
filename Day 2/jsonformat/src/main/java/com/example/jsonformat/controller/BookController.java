package com.example.jsonformat.controller;


import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsonformat.model.Book;

@RestController
public class BookController {
    
    @GetMapping("/book")
    public Book getDateMethod() {
        Book book = new Book("XYZ", "LMN",new Date());
        return book;
    }
}
