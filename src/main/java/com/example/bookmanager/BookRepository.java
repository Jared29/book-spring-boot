package com.example.bookmanager;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Use book instead of books
@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends MongoRepository<Book, String> {
  // Retrieve list based on Author value
  List<Book> findByAuthor(@Param("author") String author);
}