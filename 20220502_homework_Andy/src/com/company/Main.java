package com.company;

public class Main {

    public static void main(String[] args) {

        printRepeatedCharacter("Java is the best!", 'a');

        System.out.println(countsWord("It’s new task for me"));
        System.out.println(mixed("abcd", "qwerty"));

        split("Java       is  the  best!", ' ');

        String[] inputStrings = {"Hello", "Java", "is", "Cool"};
        System.out.println(getShortestString(inputStrings)); // is
    }

    /**
     * Task 1: Implement the method that print the String, which consists of given char of the
     * given source string and repeated as many times as the given character occurs in
     * the source string
     * “It’s new task for me”,’e’ -> “ee”;
     */
    public static void printRepeatedCharacter(String inputStr, char findChar) {
        char symbol;

        for (int i = 0; i < inputStr.length(); i++) {
            symbol = inputStr.charAt(i);

            if (symbol == findChar) {
                System.out.print(findChar);
            }
        }
        System.out.println();
    }

    /**
     * Task 2: Implement the method that counts how many words in the given String. The words are
     * separate by space. You have to use only length() and charAt() methods of String
     * class.
     * “It’s new task for me” -> 5;
     */
    public static int countsWord(String str) {
        return split(str, ' ').length;
    }

    /**
     * Task 3: Implement the method that takes two Strings and return the String that contain chars from the first
     * string mixed through one with chars from other String
     * “abcd”, “qwer” -> “aqbwcedr”
     * “ab”, “qwer” -> “aqbwer”
     * “abcd”, “qw” -> “aqbwcd”
     */
    public static String mixed(String str1, String str2) {
        String returnString = "";
        int strlen1 = str1.length();
        int strlen2 = str2.length();

        int maxLength;

        if (strlen1 > strlen2) {
            maxLength = strlen1;
        } else {
            maxLength = strlen2;
        }

        for (int i = 0; i < maxLength; i++) {
            if (i < strlen1) {
                char c = str1.charAt(i);
                returnString = returnString + c;
            }

            if (i < strlen2) {
                char c = str2.charAt(i);
                returnString = returnString + c;
            }
        }

        return returnString;
    }

    /**
     * Task 4: Implement your own split method. It should break a given string around matches of
     * the char delimiter. As a result it should return array of substrings. Don’t use the String.split method
     * For example:
     * (“Java is very easy!”, ’ ‘) -> {“Java”,”is”,”very”,”easy”}
     * (“Java is very easy!”, ’v‘) -> {“Ja”,“a is”,”ery easy”}
     * (“Java is very easy!”,’!‘) -> {“Java is very easy”}
     * (“Java is very easy!”,’:‘) -> {“Java is very easy!”}
     */
    public static String[] split(String inputString, char delimiter) {
        char symbol;
        String[] splitString = new String[20];
        String tmp = "";
        int index = 0;

        for (int i = 0; i < inputString.length(); i++) {
            symbol = inputString.charAt(i);

            if (symbol == delimiter) {
                // если нашли разделитель, все что во врменной переменной копируем в массив разделенных строк
                if (!tmp.equals("")) { // пропускаем пустые временные переменные (пробел вначале или подряд)
                    splitString[index] = tmp;
                    // после копирования очищаем временную переменную и увеличиваем индекс куда дальше сохранять
                    tmp = "";
                    index++;
                }
            } else {
                // до нахождения разделителя сохраням во временную переменную
                tmp = tmp + symbol;
            }
        }

        // если в конце не было пробела - не забыть добавить последний отрезок в массив
        if (!tmp.equals("")) {
            splitString[index] = tmp;
        }

        // копируем массив в новый и убираем все данные без значений
        String[] returnSplitString = new String[index + 1];

        for (int i = 0; i < returnSplitString.length; i++) {
            returnSplitString[i] = splitString[i];
        }

        return returnSplitString;
    }

    /**
     * Task 4: Given arrays String[]. Implement the method that returns the shortest String from it.
     */
    public static String getShortestString(String[] inputStrings) {
        int index = 0;

        for (int i = 0; i < inputStrings.length; i++) {
            if (inputStrings[i].length() < inputStrings[index].length()) {
                index = i;
            }
        }

        return inputStrings[index];
    }
}
