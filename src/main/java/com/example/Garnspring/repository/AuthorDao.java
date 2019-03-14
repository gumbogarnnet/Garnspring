package com.example.Garnspring.repository;

import com.example.Garnspring.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Garnet
 */
@Repository
public interface AuthorDao extends JpaRepository<Author, Long> {
    
}
