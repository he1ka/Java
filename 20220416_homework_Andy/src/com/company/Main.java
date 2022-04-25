package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(countsWord("It's new task for me"));

        System.out.println(getEverySecondCharacter("Hello Java"));

        System.out.println(mixed("abcd", "qwer"));
        System.out.println(mixed("1000", "23456789"));
        System.out.println(isPalindrome("abc123 321cba"));
        System.out.println(isPalindromeExtended("А роза, упала, на лапу - Азора."));

        System.out.println(isParenthesesCorrect("9*(8+3)-( (9+1)5)"));
        System.out.println(isParenthesesCorrect("9(8+3)- (9+1)5)"));
        System.out.println(isParenthesesCorrect("98+3)-( (9+1)*5"));
    }

    /**
     * Task 1: Implement the method that counts how many words in the given String.
     * The words are separate by space. You have to use only length() and
     * charAt() methods of String class.
     * “It’s new task for me” -> 5;
     * "Ol a"
     * ['O', 'l', ' ', 'a']
     */
    public static int countsWord(String str) {
        char symbol;
        int countSpace = 0;
        int countWord;

        for (int i = 0; i < str.length(); i++) {
            // i: 0 => 'O', 1 => 'l', 2 => ' ', 3 => 'a'
            symbol = str.charAt(i);

            if (symbol == ' ') {
                countSpace++;
            }
        }

        countWord = countSpace + 1;

        return countWord;
    }

    /**
     * Task 2: Implement the method that takes a strings and returns the new string that
     * contains every second character of the original string “abcde” -> “bd”
     * “Hello Java” -> “el aa”
     */
    public static String getEverySecondCharacter(String str) {
        char symbol;
        String returnString = "";

        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);

            if ((i + 1) % 2 == 0) {
                returnString = returnString + symbol;
            }
        }

        return returnString;
    }

    /**
     * Task 3: Implement the method that takes two Strings and return the String that contain
     * chars from the first string mixed through one with chars from other String
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
     * Task 5: Write method boolean isPalindrome(String) that checks whether a given word is a
     * palindrome. A palindrome is a word that reads the same from the front and the back.
     * isPalindrome(“довод”) -> true isPalindrome(“невод”) -> false
     */
    public static boolean isPalindrome(String initialString) {
        String revertedString = "";
        boolean isPalindrome = false;

        for (int i = 0; i < initialString.length(); i++) {
            char c = initialString.charAt(i);
            revertedString = c + revertedString;
        }

        isPalindrome = revertedString.equals(initialString);

        return isPalindrome;
    }


    /**
     * Task 6: Implement the previous task for phrase. Ignore spaces, punctuation marks
     * ( “, . –“) and regardless of case. Hint: use the String.toLowerCase method
     * isPalindrome(“А роза упала на лапу Азора”) -> true
     */
    public static boolean isPalindromeExtended(String initialString) {
        String revertedString = "";
        String filteredString = "";
        boolean isPalindrome = false;

        initialString = initialString.toLowerCase();

        for (int i = 0; i < initialString.length(); i++) {
            char c = initialString.charAt(i);

            if (c != ' ' && c != ',' && c != '.' && c != '-') {
                revertedString = c + revertedString;
                filteredString = filteredString + c;
            }
        }

        isPalindrome = revertedString.equals(filteredString);

        return isPalindrome;
    }

    /**
     * Task 4: * Given the String like “20*((876/8)+19)” , implements the method that check if the
     * parentheses are correct. Try to solve it yourself without help of Google
     * “9*(8+3)-( (9+1)5)” -> true
     * “9(8+3)- (9+1)5)” -> false
     * “98+3)-( (9+1)*5” -> false
     */
    public static boolean isParenthesesCorrect(String str) {
        int parenthesesCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                parenthesesCount++;
            }

            if (c == ')') {
                parenthesesCount--;
            }

            if (parenthesesCount < 0) {
                return false;
            }
        }

        return parenthesesCount == 0;
    }
}
