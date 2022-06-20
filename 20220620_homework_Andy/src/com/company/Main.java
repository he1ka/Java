package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
         * Пусть дан список List объектов типа User{String fName, String lName, int age }.
         * Предположим, при чтение User-ов из базы данных случилась ошибка и у всех пользователей
         * из списка поменялись местами fName и lName. Необходимо написать метод, который исправит
         * данную ситуацию.
         */

        List<User> users = new ArrayList<>();

        users.add(new User("Иванов", "Василий", 35));
        users.add(new User("Петрова", "Анна", 42));
        users.add(new User("Степанова", "Ирина", 19));
        users.add(new User("Федорова", "Инна", 29));
        users.add(new User("Денисов", "Олексiй", 11));

        for (User u : users) {
            String tmp = u.getlName();
            u.setlName(u.getfName());
            u.setfName(tmp);
        }

        System.out.println(users);

        /**
         * Пусть дан список List объектов типа User{String fName, String lName, int age }.
         * Необходимо исключить из списка всех пользователей моложе 18 лет.
         */
        List<User> tmpUsers = new ArrayList<>();

        for (User u : users) {
            // Сохраняем всех юзеров старше 18 во временный список
            if (u.getAge() >= 18) {
                tmpUsers.add(u);
            }
        }

        // Заменяем список юзеров на временный список
        users = tmpUsers;

        System.out.println(users);
    }
}
