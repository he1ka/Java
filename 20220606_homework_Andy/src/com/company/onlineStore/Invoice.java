package com.company.onlineStore;

public class Invoice {
    private double price;
    private double discount;

    public Invoice(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void addPrice(double price) {
        this.price += price;
    }

    public double getPriceWithDiscount()
    {
        return price - discount;
    }

    @Override
    public String toString() {
        return "Invoice with final price: " + getPriceWithDiscount() + "( Discount: " + discount + ")";
    }
}
