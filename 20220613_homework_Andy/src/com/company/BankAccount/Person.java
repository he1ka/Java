package com.company.BankAccount;

import java.util.List;

public class Person {
    String name;
    List<BankAccount> accounts;

    public Person(String name, List<BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Person{" + name + ", " + accounts + '}';
    }
}
