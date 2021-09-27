package com.techreturners.bookmanager.service;

import com.techreturners.bookmanager.model.Book;

import java.util.List;

public interface BookManagerService {

    List<Book> getAllBooks();
    Book insertBook(Book book);
}