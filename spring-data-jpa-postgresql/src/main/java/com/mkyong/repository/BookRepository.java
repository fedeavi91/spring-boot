package com.mkyong.repository;

import com.mkyong.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

// Spring Data JPA creates CRUD implementation at runtime automatically.
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);
    List<Book> findByPrice(BigDecimal price);

    // Custom query
    @Query("SELECT b FROM Book b WHERE b.publishDate > :date")
    List<Book> findByPublishedDateAfter(@Param("date") LocalDate date);

}
