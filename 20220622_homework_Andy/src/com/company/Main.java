package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("I", "do", "my", "homework");

        System.out.println(concatenateList(inputList));

        inputList = Arrays.asList("The", "homework", "is", "not", "done", "yet");

        System.out.println(sortAndCombine(inputList));
    }

    /**
     * Дан List<String>. Написать метод, который возвращает строку, которая
     * есть результат объединения всех строк исходного листа через пробел.
     * Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”.
     */
    public static String concatenateList(List<String> stringList) {
        String resultStr = "";

        for (String str : stringList) {
            if (resultStr.length() > 0) {
                // если в итоговой строке есть данные - соединяем через пробел
                // пока строка пустая пробел добавлять не надо
                resultStr += " ";
            }

            resultStr += str; // resultStr = resultStr + str;
        }

        return resultStr;
    }

    /**
     * Дан List<String>. Написать метод, который возвращает строку, которая есть
     * результат объединения всех строк исходного листа через пробел, при этом,
     * все слова, короче 4 символов должны идти вначале строки, остальные слова
     * должны сохранить свой порядок. Например:
     * {“The”, “homework”, “is”, ”not”, “done”, “yet”} ->
     * “The is not yet homework done”.
     */
    public static String sortAndCombine(List<String> stringList) {
        // Создаем список, где будем хранить правильно отсортированные строки
        List<String> sortedStringList = new ArrayList<>();

        // Проходим по исходному списку для выбора коротких строк
        for (String str : stringList) {
            // сначала добавляем строки меньше 4 (в начало)
            if (str.length() < 4) {
                sortedStringList.add(str);
            }
        }

        // Потом проходим еще раз для добавление длинных строк
        for (String str : stringList) {
            // после добавляем все остальные
            if (str.length() >= 4) {
                sortedStringList.add(str);
            }
        }

        // И вызываем метод для комбинации строк в одну строку
        return concatenateList(sortedStringList);
    }
}
