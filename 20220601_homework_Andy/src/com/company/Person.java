package com.company;

public class Person {
    protected String lastName;
    protected String firstName;
    protected String email;
    protected String address;
    protected String phone;

    public Person(String lastName, String firstName, String email, String address, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
}
