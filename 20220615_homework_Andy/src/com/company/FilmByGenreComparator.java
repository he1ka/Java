package com.company;

import java.util.Comparator;

public class FilmByGenreComparator implements Comparator<Film> {
    @Override
    public int compare(Film film1, Film film2) {
        return film1.genre.compareTo(film2.genre);
    }
}
