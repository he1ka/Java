package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Иванов", "Василий", 35));
        users.add(new User("Петрова", "Анна", 42));
        users.add(new User("Степанова", "Ирина", 19));
        users.add(new User("Федорова", "Инна", 29));
        users.add(new User("Денисов", "Олексiй", 11));

        System.out.println(fixUserList(users));

        System.out.println(excludeYoungPeople(users));

        List<Integer> intList = new ArrayList<>(Arrays.asList(3,8,6,1,33,9));

        System.out.println(checkNumber(intList, 10));
        System.out.println(checkNumber(intList, 11));
        System.out.println(checkNumber(intList, 12));
        System.out.println(checkNumber(intList, 13));
        System.out.println(checkNumber(intList, 41));
    }

    /**
     * Пусть дан список List объектов типа User{String fName, String lName, int age }.
     * Предположим, при чтение User-ов из базы данных случилась ошибка и у всех пользователей
     * из списка поменялись местами fName и lName. Необходимо написать метод, который исправит
     * данную ситуацию.
     */
    public static List<User> fixUserList(List<User> users) {
        for (User u : users) {
            String tmp = u.getlName();
            u.setlName(u.getfName());
            u.setfName(tmp);
        }

        return users;
    }

    /**
     * Пусть дан список List объектов типа User{String fName, String lName, int age }.
     * Необходимо исключить из списка всех пользователей моложе 18 лет.
     */
    public static List<User> excludeYoungPeople(List<User> users) {

        List<User> tmpUsers = new ArrayList<>();

        for (User u : users) {
            // Сохраняем всех юзеров старше 18 во временный список
            if (u.getAge() >= 18) {
                tmpUsers.add(u);
            }
        }

        // Заменяем список юзеров на временный список
        users = tmpUsers;

        return users;
    }

    /**
     * Пусть дан List Integer. Необходимо проверить, есть ли в нем такая пара
     * чисел, что в сумме они дают заданное число. Задачу необходимо решить всеми
     * известными вам способами.
     */
    public static boolean checkNumber(List<Integer> numbers, int sum) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                int firstElement = numbers.get(i);
                int secondElement = numbers.get(j);

                if (firstElement + secondElement == sum) {
                    return true;
                }
            }
        }

        return false;
    }
}
