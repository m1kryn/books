package com.mryan.books.repository;

import com.mryan.books.model.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BookRepository extends Neo4jRepository<Book, String> {
}
