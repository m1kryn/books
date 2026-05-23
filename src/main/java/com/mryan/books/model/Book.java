package com.mryan.books.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.util.Collection;

@Data
@NoArgsConstructor
@Node
public class Book {
    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    private String id;
    private String title;

    @Relationship(type = "WRITTEN_BY", direction = Relationship.Direction.OUTGOING)
    private Collection<Author> authors;

    private Collection<Tag> tags;
    private int publicationYear;
    private Publisher publisher;
}
