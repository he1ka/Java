package com.company;

import java.util.List;

public class AdvancedBook {
    private String title;
    private List<Author> authors;
    private String ISBN;

    public AdvancedBook(String title, List<Author> authors, String ISBN) {
        this.title = title;
        this.authors = authors;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "[" + title + ' ' + "(" + ISBN + ')' + ']';
    }
}
