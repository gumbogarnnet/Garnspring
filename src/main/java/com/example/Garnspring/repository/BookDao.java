package com.example.Garnspring.repository;

import com.example.Garnspring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Garnet
 */
@Repository
public interface BookDao extends JpaRepository<Book, Long> {
    
}
