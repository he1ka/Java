package com.company.BankAccount;

public class BankAccountWithOwner {
    Person owner;
    String iban;
    double balance;

    @Override
    public String toString() {
        return "BankAccountWithOwner{" + owner.name + ", " + iban + ", " + balance + "}";
    }
}
