package com.company.mailDelivery;

public class Dhl implements MailDeliveryService{

    @Override
    public void sendMail() {
        System.out.println("Put a letter in an envelope, put a stamp, send");
    }
}
