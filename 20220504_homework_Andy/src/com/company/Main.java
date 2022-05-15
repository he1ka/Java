package com.company;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int number = 17;
        boolean isEvenResult = isEven(number);

        printCheckResultMessage(number, isEvenResult);

        // Task 2
        int number1 = 10;
        int number2 = 2;
        boolean isDivisibleResult = isDivisible(number1, number2);

        printCheckResultMessage(number1, number2, isDivisibleResult);

        // Task 3
        number1 = 10;
        number2 = 15;
        int number3 = 5;
        boolean isThreeDivisibleResult = isThreeDivisible(number1, number2, number3);
        printCheckResultMessage(number1, number2, number3, isThreeDivisibleResult);

        // Task 4
        System.out.println(max3(number1, number2, number3));

        //Task 5
        System.out.println(longestString("java", "welcome", "hello"));

        //Task 6
        printFromZeroToHundred();

        //Task 7
        System.out.println(sumOfAllNumbers(2, 4));

        //Task 9
        System.out.println(findFirstCharIndex("Hello, JavaScript!", 'o'));

        //Task 10
        System.out.println(findLastCharIndex("let’s talk about java", 't'));

        //Task 11
        System.out.println(commonPrefixOfStrings("Helo 1234567890", "Hello Java"));

        //Task 12
        System.out.println(commonPostfixOfStrings("Hello 123", "Hello Java 123"));

        //Task 13
        printsGivenString("Hello");

        //Task 14
        System.out.println(substring("let’s talk about java", 7, 20));

        //Task 15
        System.out.println(makeBankAccountSecret("DE5128279087265"));

        //Task 16
        int[] arr1 = {1, 3, 6, 1, 4, 5, 9};
        System.out.println(returnMinValue(arr1));

        //Task 17
        int[] arr2 = {1, 3, 6, -1, 4, -3, 1};
        System.out.println(indexMinValue(arr2));

        //Task 18
        int[] arr3 = {1, 3, 6, -1, 4, -3, 1};
        System.out.println(sumOfPositiveElements(arr3));

        //Task 19
        printArray(returnOfEvenNumbers(8, 21));

        //Task 20
        char[] arr4 = {'a', 'b', 'c', 'd'};
        char[] arr5 = {'d', 'b', 'c', 'f'};

        compareArrays(arr4, arr5);

        //Task 21
        int[] arr6 = {10, 14, 1, 4, 3};
        int[] arr7 = {0, 1, 6, 10, 1, 4, 13};

        System.out.println(numOfEqualsElementsInArrays(arr6, arr7));

        //Task 22
        int[] arr8 = {1, 3, 7};
        System.out.println(combineIntoLong(arr8));

        //Task 23
        printArray(extractLongToArray(13457));
    }

    /**
     * Task1: Реализовать метод boolean isEven(int number) который возвращает true если переданное
     * число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int
     * number, boolean result) который выводит на экран строку вида «10 это четное число» или
     * “15 это не четное число»
     * Подсказка: Используем конструкцию if и оператор % modulo
     */
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printCheckResultMessage(int number, boolean result) {
        if (result) {
            System.out.println(number + " это четное число");
        } else {
            System.out.println(number + " это не четное число");
        }
    }

    /**
     * Task2:Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
     * true если number1 делится на number2 без остатка. Аналогично первой задаче
     * реализовать метод печати результата.
     */
    public static boolean isDivisible(int number1, int number2) {
        if (number2 != 0 && number1 % number2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printCheckResultMessage(int number1, int number2, boolean result) {
        if (result) {
            System.out.println(number1 + "/" + number2 + " делится без остатка");
        } else {
            System.out.println(number1 + "/" + number2 + " делится с остатком");
        }
    }

    /**
     * Task3: Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
     * должен возвращать true если и первое, и второе число делятся без остатка на третье.
     * Подсказка: Используйте метод, написанный в пункте 2
     */
    public static boolean isThreeDivisible(int number1, int number2, int number3) {
        if (isDivisible(number1, number3) && isDivisible(number2, number3)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printCheckResultMessage(int number1, int number2, int number3, boolean result) {
        if (result) {
            System.out.println("первое(" + number1 + "), и второе(" + number2 + ") число делятся без остатка на третье (" + number3 + ")");
        } else {
            System.out.println("Увы, но первое(" + number1 + "), и второе(" + number2 + ") число НЕ делятся без остатка на третье(" + number3 + ")");
        }
    }

    /**
     * Task 4: Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
     * наибольшее из трех переданных чисел:
     * Например: max3(10,19,0) -> 19
     */
    public static int max3(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        }

        if (num2 >= num1 && num2 >= num3) {
            return num2;
        }

        return num3;
    }

    /**
     * Task5: Реализовать метод String longestString (String str1, String str2, String str3) который
     * возвращает самую длинную строку из трех заданных строк:
     * Подсказка: Используйте метод, написанный в пункте 4
     * Например: longestString (“java”,”welcome”,”hello”) -> “welcome”
     */
    public static String longestString(String str1, String str2, String str3) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        int str3Length = str3.length();

        int longestStringSize = max3(str1Length, str2Length, str3Length);

        if (longestStringSize == str1Length) {
            return str1;
        }

        if (longestStringSize == str2Length) {
            return str2;
        }

        return str3;
    }

    /**
     * Task6: Реализовать метод, который печатает все числа в диапазоне от 0 до 100, которые не
     * делятся на 4
     */
    public static void printFromZeroToHundred() {
        for (int i = 0; i <= 100; i++) {
            if (i % 4 != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Task7: Реализовать метод, который принимает 2 параметра int start и int finish и возвращает сумму
     * всех чисел от start до finish включительно.
     * Например: sum(10,15) -> 75
     */
    public static int sumOfAllNumbers(int start, int finish) {
        int sum = 0;

        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }

        return sum;
    }

    /**
     * Task9: Реализовать метод, который int findFirstCharIndex(String str, char ch) который возвращает
     * позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
     * возвращаем -1.
     * Например: find(“let’s talk about java”,’t’) -> 2
     */
    public static int findFirstCharIndex(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (ch == c) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Task10: Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
     * позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
     * нет, возвращаем -1.
     * Например: find(“let’s talk about java”,’t’) -> 15
     */
    public static int findLastCharIndex(String str, char ch) {
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);

            if (ch == c) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Task11: Реализовать метод, который возвращает длину общего префикса двух строк, т.е. сколько
     * символов начиная с начала одинаковые у обеих строк.
     */
    public static int commonPrefixOfStrings(String str1, String str2) {
        int strLength1 = str1.length();
        int strLength2 = str2.length();

        int minLength = strLength1 < strLength2 ? strLength1 : strLength2;

        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 != c2) {
                return i;
            }
        }

        return minLength;
    }

    /**
     * Task12: Реализовать метод, который возвращает длину общего постфикса двух строк, т.е. сколько
     * символов начиная с конца одинаковые у обеих строк.
     */
    public static int commonPostfixOfStrings(String str1, String str2) {
        int strLength1 = str1.length();
        int strLength2 = str2.length();

        int minLength = strLength1 < strLength2 ? strLength1 : strLength2;

        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(strLength1 - 1 - i);
            char c2 = str2.charAt(strLength2 - 1 - i);

            if (c1 != c2) {
                return i;
            }
        }

        return minLength;
    }

    /**
     * Task13: Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
     * в [] Например: “Hello” -> [H][e][l][l][o]
     */

    public static void printsGivenString(String str) {

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print("[" + c + "]");

        }
        System.out.println();
    }

    /**
     * Task14: Реализовать метод, который возвращает часть заданной строки, начиная с позиции start,
     * заканчивая позицией finish. (разбирали в классе, но можно реализовать самостоятельно).
     * Например: substring(“let’s talk about java”, 7,20) -> “talk about ja”
     */
    public static String substring(String str, int start, int finish) {
        String returnStr = "";

        for (int i = start - 1; i < finish - 1; i++) {
            returnStr = returnStr + str.charAt(i);
        }

        return returnStr;
    }

    /**
     * Task15: Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
     * который вместо заданной строки с номером счета (например ”DE5128279087265”)
     * возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
     * засекреченных цифр)
     */
    public static String makeBankAccountSecret(String accountNumber) {
        String returnStr = "";

        for (int i = 0; i < accountNumber.length(); i++) {
            if (i >= 4 && i < accountNumber.length() - 2) {
                returnStr = returnStr + '*';
            } else {
                returnStr = returnStr + accountNumber.charAt(i);
            }
        }

        return returnStr;
    }

    /**
     * Task16: Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение
     * в данном массиве.
     * Например: {1,3,6,-1,4,-5,9} -> -5
     */
    public static int returnMinValue(int[] arr) {
//        int minValue = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < minValue) {
//                minValue = arr[i];
//            }
//        }
//
//        return minValue;
        return arr[indexMinValue(arr)];
    }

    /**
     * Task17: Дан массив целых чисел. Реализовать метод, который возвращает индекс минимальнго
     * значение в данном массиве.
     * Например: {1,3,6,-1,4,-3,1} -> 5
     */
    public static int indexMinValue(int[] arr) {
        int indexMinValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[indexMinValue]) {
                indexMinValue = i;
            }
        }

        return indexMinValue;
    }

    /**
     * Task18: Дан массив целых чисел. Реализовать метод, который возвращает сумму всех
     * положительных элементов данного массива
     * Например: {1,3,6,-1,4,-3,1} -> 15
     */
    public static int sumOfPositiveElements(int[] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                totalSum = totalSum + arr[i];
            }
        }

        return totalSum;
    }

    /**
     * Task19: Реализовать метод, который возвращает массив из первых n четных чисел, начиная с
     * заданного числа start
     * Например, для заданных n=4, start=21: {22,24,26,28,4}
     */
    public static int[] returnOfEvenNumbers(int n, int start) {
        int[] result = new int[n];
        int foundNumber = 0;

        int i = start;

        while (foundNumber < n) {
            if (i % 2 == 0) {
                result[foundNumber] = i;
                foundNumber++;
            }
            i++;
        }

        return result;
    }

    /**
     * Task20: Дано два массива char одинаковой длинны. Написать метод, который выводит все символы,
     * которые совпадают и имеют одинаковые индексы и в первом и во втором массиве.
     * Например: {‘a’,’b’,’c’,’d’}, {‘d’,’b’,’c’,’f’} ->bc
     */
    public static void compareArrays(char[] arr1, char[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                System.out.print(arr1[i]);
            }
        }

        System.out.println();
    }

    /**
     * Task21: *Дано два массива int. Написать метод, который считает, сколько значений из первого
     * массива присутствуют во втором. Например: {10, 14,1,4,3}, {0,1, 6,10, 1,4,13} ->3
     */
    public static int numOfEqualsElementsInArrays(int[] array1, int[] array2) {
        int equalElements = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    equalElements++;
                    break;
                }
            }
        }

        return equalElements;
    }

    /**
     * Task22: *Допустим, дан массив int, каждое значение в котором лежит в диапазоне от 0 до 9.
     * Реализовать метод, который вернет число long, которое поразрядно состоит из элементов
     * заданного массива
     * Например: {1,3,7} -> 137
     */
    public static long combineIntoLong(int[] array1) {
        long combinedLong = 0;

        for (int i = 0; i < array1.length; i++) {
            // цифры с конца массива - умножаем на 10^i, 7 * 10^0, 3 * 10^1 ...
            combinedLong += array1[array1.length - 1 - i] * Math.pow(10, i);
        }

        return combinedLong;
    }

    /**
     * Task23: *Задача обратная предыдущему пункту. Допустим, дано число long реализовать метод,
     * который вернет массив int состоящий из разрядов этого числа.
     * Например: 137 -> {1,3,7}
     */
    public static int[] extractLongToArray(long num) {
        // Считаем количество цифр в числе, переводим число в строку и получаем длину строки
        int numberCount = String.valueOf(num).length();
        // Создаем массив для возврата равный количеству цифр
        int[] result = new int[numberCount];

        for (int i = 0; i < numberCount; i++) {
            // Получаем значение разряда в единичной, десятичной, сотой позиции
            // Это остаток от деления числа на 10 в степени равной позиции
            // 10^1 - для первой, 10^2 для второго (десятки) ...
            int singleNum = (int) (num % Math.pow(10, i + 1));

            // Сохраняем в возвращаемый массив в обратном порядке, и вместо 300, записываем 3 (делим на 100)
            result[numberCount - 1 - i] = singleNum / (int) Math.pow(10, i);
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
