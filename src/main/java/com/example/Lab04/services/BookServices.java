package com.example.Lab04.services;

import com.example.Lab04.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {
    public class BookService {
        @Autowired
        private IBookRepository bookRepository;
        public List<Book> getAllBooks(){
            return bookRepository.findAll();
        }
        public Book getBookById(Long id){
            return bookRepository.findById(id).orElse(null);
        }
        public void addBook(Book book){
            bookRepository.save(book);
        }
    }
}
