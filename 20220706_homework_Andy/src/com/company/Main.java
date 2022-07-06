package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("Warrior Cats");
        stringList.add("Wings of Fire");
        stringList.add("Die Chroniken von Mistle End");
        stringList.add("Hobbit");
        stringList.add("Warrior Cats");
        stringList.add("Sherlock Holmes");
        stringList.add("Die Schatzinsel");
        stringList.add("Sherlock Holmes");
        stringList.add("Kids");
        stringList.add("Das Wolkenschiff");
        stringList.add("Das magische Baumhaus");
        stringList.add("Works");

        System.out.println(getUniqueString(stringList));

    }

    /**
     * Дан список String. Необходимо получить список уникальных строк из исходного
     * списка, которые состоят не менее чем из двух слов (слова разделены пробелом)
     */
    public static Set<String> getUniqueString(List<String> stringList) {
        Set<String> resultSet = new HashSet<>();
        for (String s : stringList) {
            int numberOfWords = s.split(" ").length;
            if (numberOfWords >= 2) {
                // если слов больше или равно 2 - добавляем строку в Set
                resultSet.add(s);
            }
        }

        // Возвращаем уникальный набор строк из 2+ слов
        return resultSet;
    }
}
