package com.company;

public class Film implements Comparable<Film>{
    String title;
    String genre;
    int rating;
    int year;

    public Film(String title, String genre, int rating, int year) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public int compareTo(Film o) {
        return title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "{" + title + ", " + genre + ", " + rating + ", "+  year + '}';
    }
}
