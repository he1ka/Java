package com.company;

import com.company.Person.Person;
import com.company.mailDelivery.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        workWithInterfaces();

        workWithArrays();
    }

    /**
     * Your program should ask user (use Scanner) how to send mail: by DHL,
     * by E-mail or by Pigeon and send mail by using the appropriate service.
     * • Create interface MailDeliveryService with one method void sendMail ()
     * • Create class DHL that should implement the interface MailDeliveryService.
     * Its way to send mail is print something like: “Put a letter in an envelope,
     * put a stamp, send”
     * • Create class Email that should implement the interface MailDeliveryService.
     * Its way to send mail is print something like: “Send by internet”
     * • Create class Pigeon that should implement the interface MailDeliveryService.
     * Its way to send mail is print something like: “ Pigeon?! In the twenty-first century,
     * really?!!! You are crazy! I'm flying away ”
     * • Create class Sender with the method send in it. As argument this method takes the
     * MailDeliveryService and send the mail using given service.
     */
    public static void workWithInterfaces()
    {
        System.out.println("How to send mail?");
        System.out.println("1) DHL");
        System.out.println("2) Email");
        System.out.println("3) Pigeon");

        Scanner input = new Scanner(System.in);
        MailDeliveryService deliveryService;

        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                deliveryService = new Dhl();
                break;
            case 2:
                deliveryService = new Email();
                break;
            case 3:
                deliveryService = new Pigeon();
                break;
            default:
                System.out.println("Wrong delivery method selected");
                return;
        }

        Sender sender = new Sender();
        sender.send(deliveryService);
    }

    /**
     * Create an array of Person (firstName, lastName, age). Sort the by Person’s
     * age using the Arrays.sort() method.
     */
    public static void workWithArrays() {
        Person p1 = new Person("Nick", "Walnut", 12);
        Person p2 = new Person("Jack", "Wolf", 56);
        Person p3 = new Person("Ia", "Vogel", 47);

        Person[] persons = {p1, p2, p3};

        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons);

        System.out.println(Arrays.toString(persons));
    }
}
