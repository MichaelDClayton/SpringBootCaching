package com.example.SpringBootCaching.repository;


import com.example.SpringBootCaching.model.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
