package com.company;

public class BusinessCustomer extends AbstractCustomer {
    public static final double LOW_BALANCE_VALUE = 10000;

    public BusinessCustomer(String name, String email, String address, Account account) {
        super(name, email, address, account);
    }

    /**
     * На счета юр.лиц начисляется процент, но при условие, что остаток на
     * счете не менее 10000.
     */
    @Override
    public void increaseInterest() {
        Account account = this.getAccount();

        if (account.getBalance() >= LOW_BALANCE_VALUE) {
            account.increaseBalanceByPercent(BASE_PERCENT);
        }
    }
}
