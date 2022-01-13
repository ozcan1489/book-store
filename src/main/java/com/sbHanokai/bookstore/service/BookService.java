package com.sbHanokai.bookstore.service;

import com.sbHanokai.bookstore.Repository.BookRepository;
import com.sbHanokai.bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    public final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }
}
