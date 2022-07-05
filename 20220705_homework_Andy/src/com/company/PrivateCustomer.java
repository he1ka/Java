package com.company;

public class PrivateCustomer extends AbstractCustomer {
    public PrivateCustomer(String name, String email, String address, Account account) {
        super(name, email, address, account);
    }

    /**
     * На счета физических лиц проценты начисляется базовый процент.
     */
    @Override
    public void increaseInterest() {
        this.getAccount().increaseBalanceByPercent(BASE_PERCENT);
    }
}
