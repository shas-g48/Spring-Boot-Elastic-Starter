package com.shnk.BrainsSpringElastic.Book;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "booksindex")
public class Book {

    @Id
    private String Id;

    // not sure what should go in name field
    @Field(type = FieldType.Text, name = "Title")
    private String title;

    @Field(type = FieldType.Integer, name = "Height")
    private Integer height;

    @Field(type = FieldType.Keyword, name = "Genre")
    private String genre;

    @Field(type = FieldType.Text, name = "Publisher")
    private String publisher;

    @Field(type = FieldType.Keyword, name = "Author")
    private String author;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(String id, String title, Integer height, String genre, String publisher, String author) {
        Id = id;
        this.title = title;
        this.height = height;
        this.genre = genre;
        this.publisher = publisher;
        this.author = author;
    }
}
