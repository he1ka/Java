package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Возьмите любую предметную областъ - онлайн магазин, библиотека и т.д. и
     * попробуйте сделать родителький и
     * дочерний класс и описать их в коде.
     */
    public static void main(String[] args) {
        // Library
        Film gladiator = new Film("Gladiator", "012111a", "history", Film.TYPE_DVD);
        Film batman = new Film("Batman", "0321322a", "action", Film.TYPE_CD);

        VideoGame witcher3 = new VideoGame("Witcher III", "4242532", "RPG", "PS4");
        VideoGame zelda = new VideoGame("The Legend of Zelda", "112111d1", "J-RPG", "Switch");

        Book warriorCats = new Book("Warrior Cats", "5511226611", "Kids fantasy", "Erin Hunter");
        Book lordOfTheRing = new Book("LordOfTheRing", "2323211", "Fantasy", "JRR Tolkien");

        List<Item> itemsList = new ArrayList<>();

        itemsList.add(gladiator);
        itemsList.add(batman);
        itemsList.add(witcher3);
        itemsList.add(zelda);
        itemsList.add(warriorCats);
        itemsList.add(lordOfTheRing);

        User nick = new User("Stoun", "Nick", "nick@stoun.com", "London", "0123-33-22", "001", 0);
        User maria = new User("Stoun", "Maria", "maria@stoun.com", "London", "0123-33-23", "002", 20.10);

        Employee michaela = new Employee("Guzman", "Michaela", "michael@guzman.com", "London", "0123-33-23", 1600, 20);
        Employee solo = new Employee("Guzman", "Solo", "solo@guzman.com", "London", "0123-33-23", 420, 5);

        List<Person> personList = new ArrayList<>();

        personList.add(nick);
        personList.add(maria);
        personList.add(michaela);
        personList.add(solo);
    }
}
