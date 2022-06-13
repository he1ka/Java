package com.company.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountTransformer {

    public List<BankAccountWithOwner> getBankAccountWithOwner(List<Person> persons) {
        ArrayList<BankAccountWithOwner> returnArray = new ArrayList<>();

        for (int i = 0; i < persons.size(); i++) {
            Person owner = persons.get(i);
            List<BankAccount> bankAccounts = owner.accounts;

            for (int j = 0; j < bankAccounts.size(); j++) {
                BankAccount bankAccount = bankAccounts.get(j);

                BankAccountWithOwner bankAccountWithOwner = new BankAccountWithOwner();
                bankAccountWithOwner.owner = owner;
                bankAccountWithOwner.iban = bankAccount.iban;
                bankAccountWithOwner.balance = bankAccount.balance;

                returnArray.add(bankAccountWithOwner);
            }
        }

        return returnArray;
    }
}
