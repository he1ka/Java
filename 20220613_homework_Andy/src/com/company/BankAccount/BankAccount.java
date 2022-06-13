package com.company.BankAccount;

public class BankAccount {
    String iban;
    double balance;

    public BankAccount(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + iban + ", " + balance + '}';
    }
}
