# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
# Build
./mvnw clean package

# Run
./mvnw spring-boot:run

# Run all tests
./mvnw test

# Run a single test class
./mvnw test -Dtest=BooksApplicationTests

# Run a single test method
./mvnw test -Dtest=BooksApplicationTests#contextLoads
```

## Project Context

Learning project for Spring Boot and Angular. User writes code themselves — provide guidance and explain concepts, but do not write code unless explicitly asked.

The backend (this repo) is a REST API consumed by an Angular frontend.

## Architecture

Spring Boot 3.5 REST API (Java 21) using Neo4j as the graph database via Spring Data Neo4j.

**Key dependencies:** `spring-boot-starter-data-neo4j` (SDN), `spring-boot-starter-webmvc`, Lombok.

**Neo4j connection** is configured in `application.properties`:
- Default URI: `bolt://localhost:7687`
- Password is blank — set `spring.neo4j.authentication.password` before running.

## Known Issues

- `BooksApplication.java` is currently in `src/main/resources/` instead of `src/main/java/com/mryan/books/` — it should be moved there for the app to compile correctly.
- `Book.java` has `@Node` commented out — uncomment it and add fields/`@Id` when building out the model.
