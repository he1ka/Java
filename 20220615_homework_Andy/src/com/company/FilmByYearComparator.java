package com.company;

import java.util.Comparator;

public class FilmByYearComparator implements Comparator<Film> {

    @Override
    public int compare(Film film1, Film film2) {
        return film1.year - film2.year;
    }
}
