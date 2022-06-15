package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Создать класс Film и полями класса: название, жанр, рейтинг, год ;
     * Создать список фильмов. Программа должна спрашивать какая сортировка нужна
     * пользователю (по названию, по рейтингу, по жанру или году) и выводить отсортированный
     * список на экран.
     */
    public static void main(String[] args) {
        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film("Harry Potter", "fantasy", 5, 2001));
        filmList.add(new Film("The lord of the Rings", "fantasy", 5, 1978));
        filmList.add(new Film("Star Wars", "fantasy", 5, 1977));
        filmList.add(new Film("Split", "thriller", 4, 2016));
        filmList.add(new Film("Friends", "comedy", 4, 1994));

        System.out.println("Please select sorting");
        System.out.println("1) Title");
        System.out.println("2) Rating");
        System.out.println("3) Genre");
        System.out.println("4) Year");

        Scanner sc = new Scanner(System.in);
        int sortType = sc.nextInt();

        Comparator<Film> comparator;

        switch (sortType) {
            case 1:
                comparator = new FilmByTitleComparator();
                break;
            case 2:
                comparator = new FilmByRatingComparator();
                break;
            case 3:
                comparator = new FilmByGenreComparator();
                break;
            case 4:
                comparator = new FilmByYearComparator();
                break;
            default:
                comparator = new FilmByTitleComparator();
        }

        filmList.sort(comparator);

        System.out.println(filmList);
    }
}
