package com.book.RequestModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.testng.annotations.Test;

public class AddBookRequest {
    String book_name;
    String isbn;
    String aisle;
    String author_name;


    @JsonProperty("name")
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }
    @JsonProperty("author")
    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAisle() {
        return aisle;
    }

    public String getAuthor_name() {
        return author_name;
    }
}


