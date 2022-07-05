package com.company;

public class CustomerNotifier {
    public void notify(AbstractCustomer customer) {
        // Каждый тип пользователя получает уведомление письмом
        sendPostNotification(customer);

        if (customer instanceof VIPCustomer) {
            // VIP клиент дополнительно получает Email уведомление
            sendEmailNotification(customer);
        }
    }

    private void sendEmailNotification(AbstractCustomer customer) {
        System.out.println();
        System.out.println("=======================");
        System.out.println("Send Email Notification");
        System.out.println("From: bank@superbank.de");
        System.out.println("To:" + customer.getName() + "<" + customer.getEmail() + ">");
        System.out.println("Title: Your account balance");
        System.out.println(customer.getAccount());
        System.out.println("=======================");
        System.out.println();
    }

    private void sendPostNotification(AbstractCustomer customer) {
        System.out.println();
        System.out.println("=======================");
        System.out.println("Send Post Notification");
        System.out.println("From: Superbankstr 12, Berlin");
        System.out.println("To:" + customer.getName());
        System.out.println("Address:" + customer.getAddress());
        System.out.println("Attachment: Your account balance");
        System.out.println(customer.getAccount());
        System.out.println("=======================");
        System.out.println();
    }
}
