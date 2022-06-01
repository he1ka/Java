package com.company;

public class User extends Person {
    protected String cardNumber;
    protected double currentDebt;

    public User(String lastName, String firstName, String email, String address, String phone, String cardNumber, double currentDebt) {
        super(lastName, firstName, email, address, phone);
        this.cardNumber = cardNumber;
        this.currentDebt = currentDebt;
    }
}
