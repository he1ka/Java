package com.company;

public class Student implements Comparable<Student> {
    private String name;
    private int tasksDone;  //количество решенных задач

    public Student(String name, int tasksDone) {
        this.name = name;
        this.tasksDone = tasksDone;
    }

    public String getName() {
        return name;
    }

    public int getTasksDone() {
        return tasksDone;
    }

    @Override
    public String toString() {
        return "{" + name + ", tasks:" + tasksDone + '}';
    }

    @Override
    public int compareTo(Student o) {
        int taskDiff = o.tasksDone - tasksDone;

        if (taskDiff == 0) {
            return o.name.compareTo(name);
        }

        return taskDiff;
    }
}

