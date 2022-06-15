package com.company;

import java.util.Comparator;

public class FilmByTitleComparator implements Comparator<Film> {
    @Override
    public int compare(Film film1, Film film2) {
        return film1.title.compareTo(film2.title);
    }
}
