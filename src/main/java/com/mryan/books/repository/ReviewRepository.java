package com.mryan.books.repository;

import com.mryan.books.model.Review;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ReviewRepository extends Neo4jRepository<Review, String> {

}
