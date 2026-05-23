# Books

A personal book review blog backend. Spring Boot REST API backed by Neo4j, consumed by an Angular frontend.

## Concept

Reviews are the primary entity. Everything else — books, authors, publishers, tags — is metadata that supports navigating and filtering reviews.

## Data Model

### Nodes

| Node | Description |
|---|---|
| `Review` | The root entity. Contains the review content and dates. |
| `Book` | Metadata about the reviewed book (title, publication year). |
| `Author` | A book's author. |
| `Publisher` | The book's publisher. |
| `Tag` | A genre or category label. |

### Relationships

```
(Review)-[:REVIEWS]->(Book)-[:WRITTEN_BY]->(Author)
                          |-[:PUBLISHED_BY]->(Publisher)
                          |-[:TAGGED_WITH]->(Tag)
```

- A `Review` points to the `Book` it covers.
- A `Book` points to its `Author(s)`, `Publisher`, and `Tag(s)`.
- `Author` and `Publisher` are leaf nodes — no outbound relationships stored. Querying "all books by Author X that I've reviewed" traverses the graph rather than following a stored collection.

## Stack

- Java 21
- Spring Boot 3.5
- Spring Data Neo4j
- Neo4j (bolt://localhost:7687)
- Lombok
