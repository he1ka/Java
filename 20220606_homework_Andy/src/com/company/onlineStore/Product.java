package com.company.onlineStore;

public class Product {
    private String title;
    private double price;
    private double discountPercent;

    public Product(String title, double price, double discountPercent) {
        this.title = title;
        this.price = price;
        this.discountPercent = discountPercent;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Invoice purchase() {
        double purchasePrice = price;
        double discount = 0;

        if (this.discountPercent > 0) {
            discount = price * this.discountPercent;
        }

        return new Invoice(purchasePrice, discount);
    }
}
