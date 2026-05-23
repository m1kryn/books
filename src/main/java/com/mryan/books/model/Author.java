package com.mryan.books.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.util.Collection;

@Data
@NoArgsConstructor
@Node
public class Author {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;
    private String firstName;
    private String lastName;
}
