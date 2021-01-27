package com.shnk.BrainsSpringElastic.repository;

import com.shnk.BrainsSpringElastic.Book.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
    List<Book> findByTitle(String title);

    List<Book> findByAuthor(String author);
}
