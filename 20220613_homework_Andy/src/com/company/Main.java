package com.company;

import com.company.ArrayProgramm.ArrayProviderSelector;
import com.company.ArrayProgramm.ArrayProvider;
import com.company.BankAccount.BankAccount;
import com.company.BankAccount.BankAccountTransformer;
import com.company.BankAccount.BankAccountWithOwner;
import com.company.BankAccount.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        arrayProvider();
        bankAccount();
    }

    /**
     * Imagine in our program we process an array (for example, an array of integers,
     * or an array of Employee if you want). In production environment we read this array
     * from User (use Scanner), in test environment we get it as random array or use an array
     * defined in the code. So, you need to implement a method getArray() witch as argument
     * takes the way, how the array will be created and as a result returns the array.
     * Implement this program (hint: use knowledge about interface)
     */
    public static void arrayProvider()
    {
        Scanner sc = new Scanner(System.in);

        int arrayType = sc.nextInt();

        ArrayProviderSelector selector = new ArrayProviderSelector();
        ArrayProvider arrayWithData = selector.getArrayProvider(arrayType);

        System.out.println(arrayWithData.getArray());
    }

    /**
     * Given a list of Person (String name, List<BankAccount> accounts) .
     * BankAccount is the class with following fields: String iban, double balance.
     * Create class BankAccountWithOwner (Person owner, String iban, double balance).
     * Implement the method that returns the List of BankAccountWithOwner.
     */
    public static void bankAccount()
    {
        List<BankAccount> p1Accounts = new ArrayList<>();

        p1Accounts.add(new BankAccount("DE0101010101", 12.11));
        p1Accounts.add(new BankAccount("DE077171711", 12321.77));
        p1Accounts.add(new BankAccount("DE092781291", -71.22));

        Person p1 = new Person("Nick", p1Accounts);

        List<BankAccount> p2Accounts = new ArrayList<>();

        p2Accounts.add(new BankAccount("DE0203040501", 1211.81));
        p2Accounts.add(new BankAccount("DE032222222", 761.11));
        p2Accounts.add(new BankAccount("DE040404040", 0.11));
        p2Accounts.add(new BankAccount("DE050704040", 1230.11));

        Person p2 = new Person("Maria", p2Accounts);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);

        BankAccountTransformer bankAccountTransformer = new BankAccountTransformer();
        List<BankAccountWithOwner> bankAccountWithOwners = bankAccountTransformer.getBankAccountWithOwner(persons);

        System.out.println(bankAccountWithOwners);
    }
}
