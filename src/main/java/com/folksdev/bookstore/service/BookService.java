package com.folksdev.bookstore.service;

import com.folksdev.bookstore.model.Book;
import com.folksdev.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) { //Autowired yazmama gerek yok
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookid){
        return bookRepository.findById(bookid);
    }
}
