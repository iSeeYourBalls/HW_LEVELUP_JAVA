package com.company;

public class Book {
    String name;
    String author;
    int year;
    BookType bookType;

    public Book(String name, String author, int year, BookType bookType) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.bookType = bookType;
    }
}

