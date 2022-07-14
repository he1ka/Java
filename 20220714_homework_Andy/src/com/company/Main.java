package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("123", "2", "777a", "88"));

        System.out.println(convertStringListToIntegerList(stringList));

        validateInputWithOutput(null);

        int[][] input = {{1, 3, 4}, {1, 2, 2, 3}};
        validateInputWithOutput(input);

        int[][] inputValid = {
                {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10},
                {2, 2, 3, 4, 5, 6, 7 , 8, 9, 10},
                {3, 2, 3, 4, 5, 6, 7 , 8, 9, 10},
                {4, 2, 3, 4, 5, 6, 7 , 8, 9, 10},
                {5, 2, 3, 4, 5, 6, 7 , 8, 9, 10},
                {6, 2, 3, 4, 5, 6, 7 , 8, 9, 10},
                {7, 2, 3, 4, 5, 6, 7 , 8, 9, 10},
                {8, 2, 3, 4, 5, 6, 7 , 8, 9, 10},
                {9, 2, 3, 4, 5, 6, 7 , 8, 9, 10},
                {10, 2, 3, 4, 5, 6, 7 , 8, 9, 10}
        };

        validateInputWithOutput(inputValid);

    }

    /**
     * Есть List<String>. Все элементы в нем должны быть строки-целые числа
     * вида “231”, но некоторые данные повреждены (например, содержат символы).
     * Необходимо преобразовать данный список в List<Integer>. При этом вывести
     * на экран детализированный список «ошибок» т.е. в каких ячейках и какие
     * значения не были преобразованы.
     * Подсказка: необходимо использовать метод Integer.parseInt и обрабатывать
     * его эксэпшены.
     */
    public static List<Integer> convertStringListToIntegerList(List<String> stringList) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            try {
                integerList.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("Value [" + s + "] at position stringList[" + i + "] can't be converted to Integer.");
            }
        }

        return integerList;
    }

    public static void validateInputWithOutput(int[][] input)
    {
        try {
            validateInputArray(input);
            System.out.println("Input array [" + Arrays.deepToString(input) + "] is VALID");
        } catch (IllegalArgumentException e) {
            System.out.println("Input array [" + Arrays.deepToString(input) + "] is NOT VALID");
        }
    }

    /**
     * Допустим, Ваш метод должен получить массив int размером 10x10 элементов.
     * Необходимо, чтобы ваш метод бросал IllegalArgumentException, если размер
     * переданного массива некорректен или вместо массива пришел null.
     */
    public static void validateInputArray(int[][] input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        if (input.length != 10) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i].length != 10) {
                throw new IllegalArgumentException();
            }
        }
    }
}
