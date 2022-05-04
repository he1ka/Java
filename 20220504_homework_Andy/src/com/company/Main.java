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
        if (number1 % number2 == 0) {
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
            if (i % 4 == 0) {
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


}
