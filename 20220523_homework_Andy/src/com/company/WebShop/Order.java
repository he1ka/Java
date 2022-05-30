package com.company.WebShop;

public class Order {
    public static final String STATUS_ACTIVE = "Active";
    public static final String STATUS_REFUND = "Refund";
    public static final String STATUS_PAID = "Paid";
    public static final String STATUS_SHIPPED = "Shipped";

    String orderNumber;
    Customer customer;
    Product product;
    int quantity;
    Price totalAmount;
    String orderStatus;

    public Order(String orderNumber, Customer customer, Product product, int quantity, Price totalAmount, String orderStatus) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }
}
