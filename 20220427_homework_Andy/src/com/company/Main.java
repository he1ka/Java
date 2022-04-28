package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {10, 33, 3, 5, -9};
        System.out.println(indexOfBiggestElement(arr1));

        int[] arr2 = {10, 3, 23, 5, -9};
        System.out.println(sumOfElements(arr2));

        int[] arr3 = {2, 6, 5, 3};
        printsAllElements(arr3);

        int[] arr4 = powerOfTwo(5);

        int[] arr5 = {10, 3, 3, 5, -9};
        int[] revertedArray = reverseOrder(arr5);

        revertedArray = reverseOrderWithoutExtrqArray(arr5);
    }

    /**
     * Implement a method that returns the index of the biggest element of a given array of int
     * {10, 33, 3, 5, -9} -> 1
     */
    public static int indexOfBiggestElement(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }

        return index;
    }

    /**
     * Implement a method that returns the sum of elements of the given array of int
     * {10, 3, 23, 5, -9} -> 32
     */
    public static int sumOfElements(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    /**
     * Implement a method that prints all elements of the given array that bigger than
     * average value of array elements
     * {2, 6, 5, 3} -> 6 5
     */
    public static void printsAllElements(int[] arr) {
        int avg = sumOfElements(arr) / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * Implement a method that returns new array of int. Every element of the array is next power of two. The length
     * of the array is given n (the max value of n is 30. Why do you think?)
     * powerOfTwo (5) -> {1,2,4,8,16}
     */
    public static int[] powerOfTwo(int size) {
        int[] result = new int[size];

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) Math.pow(2, i);
        }

        return result;
    }

    /**
     * Implement a method that returns the new array that is the given array in reverse order
     * {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
     */
    public static int[] reverseOrder(int[] input) {
        int[] result = new int[input.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = input[result.length - 1 - i];
        }

        return result;
    }

    /**
     * Implement a method that makes a given array in reverse order. It’s look like previous
     * but you should solve it without new array
     * {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
     */
    public static int[] reverseOrderWithoutExtrqArray(int[] input) {
        int maxArrayIndex = input.length - 1;
        int reverseIndex;

        for (int index = 0; index < input.length / 2; index++) {
            reverseIndex = maxArrayIndex - index;

            int tmpValue = input[index];
            input[index] = input[reverseIndex];
            input[reverseIndex] = tmpValue;
        }

        return input;
    }
}
