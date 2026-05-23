package com.mryan.books.repository;

import com.mryan.books.model.Tag;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TagRepository extends Neo4jRepository<Tag, String> {
}
