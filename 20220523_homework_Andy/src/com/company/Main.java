package com.company;

import com.company.WebShop.Product;

public class Main {

    public static void main(String[] args) {
        String[] student = {"Jack", "Nick"};

        int[][] grades = {
                {1, 2, 3, 2},
                {2, 4, 5, 5, 1},
        };

        printBestStudent(student, grades);

        // Task 2
        printBestStudentOopStyle();
    }

    /**
     * Task 1: Given two arrays. The first is String[n] students – names of students.
     * The second is int[n][] grades – the array of grades for student homework.
     * Every row of grades array is one student's grades (grades[k] is the grades of students[k]).
     * Note, that each student has a different number of grades.
     * You should implement the program that finds and displays the student
     * with highest GPA and the score.
     * Example:
     * {Jack, Nick} { { 3,4,2}, { 5,5,5,4} } -> Nick 4.75
     * <p>
     * Даны два массива. Первый — это String[n] student — имена учеников.
     * Второй — int[n][]grades — массив оценок за домашнее задание ученика.
     * Каждая строка массива оценок — это оценки одного ученика (grades[k] —
     * это оценки студентов[k]). Обратите внимание, что у каждого ученика разное количество оценок.
     * Вы должны реализовать программу, которая находит и отображает учащегося
     * с самым высоким средним баллом и баллом.
     * Пример: {Джек, Ник} { { 3,4,2}, { 5,5,5,4} } -> Ник 4,75
     */
    public static void printBestStudent(String[] student, int[][] grades) {
        double bestGpa = 0;
        int indexBestStudent = 0;

        for (int i = 0; i < student.length; i++) {
            double gpa = 0;

            for (int j = 0; j < grades[i].length; j++) {
                gpa += grades[i][j];
            }

            gpa = gpa / grades[i].length;

            if (gpa > bestGpa) {
                bestGpa = gpa;
                indexBestStudent = i;
            }
        }

        System.out.println(student[indexBestStudent] + " : " + bestGpa);
    }

    /**
     * Task 2: Implement the previous task in OOP style. Create the Student class with name and grade fields.
     * Tip: grade should be an array.
     *
     * Реализуйте предыдущую задачу в стиле ООП. Создайте класс Student с полями имени и оценки.
     * Совет: оценка должна быть массивом.
     */
    private static void printBestStudentOopStyle() {
        Student jack = new Student("Jack", new int[]{1, 2, 3, 2});
        Student nick = new Student("Nick", new int[]{2, 4, 5, 5, 1});

        Student[] students = new Student[]{jack,nick};

        // Создаем сервис, который определит лучшего студента
        // Для работы передаем ему массив студентов
        BestStudentDetector bestStudentDetector = new BestStudentDetector(students);

        // Вызываем метод для опредления лучшего студента
        Student bestStudent = bestStudentDetector.getBestStudent();

        bestStudent.print();
    }
}
