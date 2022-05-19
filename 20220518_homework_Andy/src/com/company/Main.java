package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 2},
                {2, -4, -6, 30, 57},
                {9, 8, -300},
                {0, 1},
        };

        System.out.println(checkIfAverageMoreZero(arr, 1));
        System.out.println(checkIfAverageMoreZero(arr, 3));

        printArray(flatArray(arr));
    }

    /**
     * Task 2 Implement the method that takes int[][] array and line number and check checks that the
     * average of the elements in a row is greater than 0
     */
    public static boolean checkIfAverageMoreZero(int[][] array, int num) {
        int sum = 0;

        // проверить, что num меньше, чем количество строк массива
        if (num > array.length - 1) {
            return false;
        }

        // сделать цикл по строке массива num, array[num] от 0 до array[num].length
        for (int i = 0; i < array[num].length; i++) {
            // посчитать сумму элементов и поделить на количество
            sum += array[num][i];
        }

        // если больше 0 вернуть true / иначе false
        return (float) sum / array[num].length > 0;
    }

    /**
     * Task 3 Implement the method that takes a two-dimensional array and return the single-dimensional
     * array with all elements of the given array
     * ({ {1,2},{3,4},{5,6} }) -> {1,2,3,4,5,6}
     */
    public static int[] flatArray(int[][] inputArray) {
        // считаем общее количество элементнов в 2х мерном массиве
        int totalElements = 0;

        for (int i = 0; i < inputArray.length; i++) { //строка
            totalElements += inputArray[i].length;
        }

        // создать одномерный массив с длинной = общему количеству элементов
        int[] result = new int[totalElements];

        // проходим по каждому элементу двумерного массива и добавляем его в нужный индекс
        // одномерного массива
        int index = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                result[index] = inputArray[i][j];
                index++;
            }
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
