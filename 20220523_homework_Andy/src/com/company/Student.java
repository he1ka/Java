package com.company;

/**
 * Task 2: Implement the previous task in OOP style. Create the Student class with name and grade fields.
 * Tip: grade should be an array.
 * <p>
 * Реализуйте предыдущую задачу в стиле ООП. Создайте класс Student с полями имени и оценки.
 * Совет: оценка должна быть массивом.
 */
public class Student {
    String name;
    int[] grades;
    double gpa;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
        // Расчитываем GPA для студента при создании объекта
        calculatedGpa();
    }

    public void calculatedGpa() {
        double gpa = 0;

        // суммируем оценки студента и делим на количество оценок
        for (int i = 0; i < grades.length; i++) {
            gpa += grades[i];
        }

        this.gpa = gpa / grades.length;
    }

    public void print() {
        System.out.println(name + " : " + gpa);
    }
}
