package com.company;

public class Book extends Item {
    protected String author;

    public Book(String title, String barCode, String genre, String author) {
        super(title, barCode, genre);
        this.author = author;
    }
}
