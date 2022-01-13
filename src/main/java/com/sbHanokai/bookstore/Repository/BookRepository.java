package com.sbHanokai.bookstore.Repository;

import com.sbHanokai.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
