package com.company;

public class VIPCustomer extends AbstractCustomer {
    private static final double BASE_BONUS = 150;

    public VIPCustomer(String name, String email, String address, Account account) {
        super(name, email, address, account);
    }

    /**
     * На счета вип-клиетов начисляется базовый процент
     * плюс бонус
     */
    @Override
    public void increaseInterest() {
        this.getAccount().increaseBalanceByPercent(BASE_PERCENT);
        this.getAccount().increaseBalanceByValue(BASE_BONUS);
    }
}
