package com.mkyong.service;

import com.mkyong.model.Book;
import com.mkyong.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> findByPrice(BigDecimal price) {
        return bookRepository.findByPrice(price);
    }


    public List<Book> findByPublishedDateAfter(LocalDate date) {
        return bookRepository.findByPublishedDateAfter(date);
    }
}
