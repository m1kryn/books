package com.mryan.books.repository;

import com.mryan.books.model.Publisher;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PublisherRepository extends Neo4jRepository<Publisher, String> {
}
