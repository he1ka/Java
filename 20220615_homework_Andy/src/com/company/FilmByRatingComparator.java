package com.company;

import java.util.Comparator;

public class FilmByRatingComparator implements Comparator<Film> {
    @Override
    public int compare(Film film1, Film film2) {
        return film1.rating - film2.rating;
    }
}
