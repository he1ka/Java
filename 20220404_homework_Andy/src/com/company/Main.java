package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printFirstWord("Пример строки");

        System.out.println(substring("It is my own method", 9, 12));

        intSum();

        System.out.println(replace("Hello Java Word!", ' ', '_'));
    }

    /**
     * Task 1: Implement the method that takes String and print the first word of the String
     * (all charsbefore the first space) (“Пример строки”) ->”Пример”
     */
    public static void printFirstWord(String str) {
        char strSymbol;

        for (int i = 0; i < str.length(); i++) {
            strSymbol = str.charAt(i);

            if (strSymbol == ' ') {
                break;
            } else {
                System.out.print(strSymbol);
            }
        }

        System.out.println();
    }

    /**
     * Task2: Implement the method that takes String, int startIndex, int endIndex. The method returns
     * the substring of the given String between startIndex and endIndex (startIndex inclusive endIndex
     * exclusive). You have to use only length() and charAt() methods of String class.
     * substring(“It is my own method”,9,12) ->”own”
     */
    public static String substring(String str, int startIndex, int endIndex) {
        String returnString = "";

        for (int i = startIndex; i <= endIndex; i++) {
            returnString = returnString + str.charAt(i);
        }

        return returnString;
    }

    /**
     * Task3: Implement the program that read Integers from Scanner and prints the sum of all integers were input.
     * The program will finish when 0 input.
     */
    public static void intSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers;

        do {
            numbers = scanner.nextInt();
            sum = sum + numbers;
        } while (numbers != 0);

        System.out.println("Сумма введенных чисел " + sum);
    }

    /**
     * Task: Write a method that takes a String and a two chars. As the result it returns the given String,
     * where each the first char was replaced by the second char. You have to use only length()
     * and charAt() methods of String class.
     */
    public static String replace(String str, char search, char replace) {
        String returnString = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == search) {
                c = replace;
            }
            returnString = returnString + c;
        }

        return returnString;
    }
}
