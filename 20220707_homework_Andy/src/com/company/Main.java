package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Group> groups = new ArrayList<>();

        Student alex = new Student("Alex", 10);
        Student ivan = new Student("Ivan", 1);
        Student oleg = new Student("Oleg", 7);
        Student svetlana = new Student("Svetlana", 17);
        Student mariana = new Student("Mariana", 0);
        Student marina = new Student("Marina", 19);
        Student nikolai = new Student("Nikolai", 4);
        Student liza = new Student("Elizaveta", 9);
        Student ira = new Student("Ira", 18);
        Student mia = new Student("Mia", 1);
        Student elena = new Student("Elena", 22);

        List<Student> studentsOfGroup1 = new ArrayList<>();
        studentsOfGroup1.add(alex);
        studentsOfGroup1.add(elena);
        studentsOfGroup1.add(ivan);
        studentsOfGroup1.add(mia);

        List<Student> studentsOfGroup2 = new ArrayList<>();
        studentsOfGroup2.add(alex);
        studentsOfGroup2.add(ivan);
        studentsOfGroup2.add(oleg);
        studentsOfGroup2.add(svetlana);
        studentsOfGroup2.add(ira);

        List<Student> studentsOfGroup3 = new ArrayList<>();
        studentsOfGroup3.add(mariana);
        studentsOfGroup3.add(marina);
        studentsOfGroup3.add(nikolai);
        studentsOfGroup3.add(liza);
        studentsOfGroup3.add(oleg);

        groups.add(new Group("Group 1", studentsOfGroup1));
        groups.add(new Group("Group 2", studentsOfGroup2));
        groups.add(new Group("Group 3", studentsOfGroup3));

        System.out.println(getThreeBestStudents(groups));
    }

    /**
     * У вас есть два класса Student{String name, int tasksDone}
     * (поле tasksDone – количество решенных задач) и
     * класс Group{String title, List<Student>}. Дан список Group.
     * Необходимо получить список из 3 студентов, решивших наибольшее количество
     * задач. Обратите внимание, один студент может посещать занятие в нескольких
     * группах. Подсказка: необходимо использовать Set студентов.
     */
    public static Set<Student> getThreeBestStudents(List<Group> groups) {
        TreeSet<Student> allStudents = new TreeSet<>();

        Set<Student> bestStudents = new HashSet<>();

        for (Group g : groups) {
            // Собираем студентов со всех групп - в одно множество
            // Каждый студент будет только раз
            //  Поскольку TreeSet - упорядоченное множество
            //  Student будут сравниваться друг с другом
            // на основании логики в методе compareTo
            allStudents.addAll(g.getStudents());
        }

        int addedElements = 0;

        // Перебираем список всех студентов и берем первых 3
        while (allStudents.size() > 0 && addedElements < 3) {
            bestStudents.add(allStudents.pollFirst());
            addedElements++;
        }

        return bestStudents;
    }
}
