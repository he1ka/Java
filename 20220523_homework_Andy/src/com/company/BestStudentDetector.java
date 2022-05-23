package com.company;

public class BestStudentDetector {
    Student[] students;

    public BestStudentDetector(Student[] students) {
        this.students = students;
    }

    public Student getBestStudent() {
        double bestGpa = 0;
        int indexBestStudent = 0;

        for (int i = 0; i < students.length; i++) {
            // Сравнимаем GPA текущего студента из массива с максиальным GPA
            if (students[i].gpa > bestGpa) {
                bestGpa = students[i].gpa;
                // сохраняем для дальнейшего вывода - индекс лучшего студента
                indexBestStudent = i;
            }
        }

        // возвращем студента по индексу
        return students[indexBestStudent];
    }
}
