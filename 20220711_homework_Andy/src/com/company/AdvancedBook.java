package com.company;

import java.util.List;

public class AdvancedBook implements Comparable<AdvancedBook> {
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

    @Override
    public int compareTo(AdvancedBook o) {
        return o.getISBN().compareTo(getISBN());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdvancedBook)) return false;

        AdvancedBook that = (AdvancedBook) o;

        if (title != null ? !title.equals(that.title) : that.title != null) {
            return false;
        }
        if (authors != null ? !authors.equals(that.authors) : that.authors != null) {
            return false;
        }
        return ISBN != null ? ISBN.equals(that.ISBN) : that.ISBN == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        result = 31 * result + (ISBN != null ? ISBN.hashCode() : 0);
        return result;
    }
}
