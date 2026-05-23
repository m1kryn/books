package com.mryan.books.repository;

import com.mryan.books.model.Author;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AuthorRepository extends Neo4jRepository<Author, String> {
}
