package com.company;

abstract public class AbstractCustomer {
    public static final double BASE_PERCENT = 0.10;

    private String email;
    private String name;
    private String address;
    private Account account;

    public AbstractCustomer(String name, String email, String address, Account account) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    /**
     * начисление процентов
     */
    abstract public void increaseInterest();
}
