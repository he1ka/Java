package com.company;

public class Employee extends Person {
    protected double salary;
    protected int vacationDays;

    public Employee(String lastName, String firstName, String email, String address, String phone, double salary, int vacationDays) {
        super(lastName, firstName, email, address, phone);
        this.salary = salary;
        this.vacationDays = vacationDays;
    }
}
