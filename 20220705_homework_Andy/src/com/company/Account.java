package com.company;

public class Account {
    private String iban;
    private double balance;

    public Account(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Увеличиваем баланс счета на процент
     * percent 0 .. 1
     */
    public void increaseBalanceByPercent(double percent) {
        balance = balance * (1.0 + percent);
    }

    /** Увеличить баланс счет на фиксированное значение */
    public void increaseBalanceByValue(double value) {
        balance = balance + value;
    }

    @Override
    public String toString() {
        return "{ " + iban  + ", balance=" + balance + " }";
    }
}
