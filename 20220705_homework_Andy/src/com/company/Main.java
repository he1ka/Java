package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Допустим, вы пишите банковскую программу. У вас есть клиенты:
     * юридические лица, физические лица, вип-клиеты.
     * У каждого клиента есть Account{String iban, double balance}.
     *
     * Условиями бизнеса предусмотрено, что по каждому счету начисляются
     * проценты и после начисления, клиентов информируют о балансе.
     *
     * На счета физических лиц проценты начисляется базовый процент.
     *
     * На счета юр.лиц начисляется процент, но при условие что остаток на
     * счете не менее 10000.
     *
     * На счета вип-клиетов начисляется базовый процент
     * плюс бонус.
     *
     * Информирование тоже осуществляется по разному: юр.лица и
     * физ.лица получают выписку письмом, вип клиеты получают письмом и емэйлом.
     *
     * Вам необходимо разработать систему классов, реализовать метод начисления и
     * метод информирования. Естественно, программа должна иметь возможность
     * обрабатывать клиентов\счета списком.
     */
    public static void main(String[] args) {
        List<AbstractCustomer> customers = new ArrayList<>();
        CustomerNotifier notifier = new CustomerNotifier();

        customers.add(
                new PrivateCustomer(
                        "Jack Sparrow",
                        "jack@sparrow.com",
                        "Black Pearl",
                        new Account("CA11221111", 77.12)
                )
        );

        customers.add(
                new VIPCustomer(
                        "Harry Potter",
                        "harry@hogwart.com",
                        "Hogwart 12/22",
                        new Account("GB112211122", 718277.88)
                )
        );

        customers.add(
                new BusinessCustomer(
                        "Nick Warrior",
                        "nick@warrior.com",
                        "Bank 121",
                        new Account("PL11211", 8887)
                )
        );

        customers.add(
                new BusinessCustomer(
                        "John Winks",
                        "john@winks.com",
                        "Winks av.",
                        new Account("DE0011121", 11177.12)
                )
        );

        for (AbstractCustomer c : customers) {
            c.increaseInterest();
            notifier.notify(c);
        }

    }
}
