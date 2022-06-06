package com.company.onlineStore;

public class Food extends Product {
    private static final double FAST_SHIPPING_COST = 2.99;

    public Food(String title, double price, double discountPercent) {
        super(title, price, discountPercent);
    }

    @Override
    public Invoice purchase() {
        Invoice invoice = super.purchase();

        // дополнительная цена за срочность доставки
        invoice.addPrice(FAST_SHIPPING_COST);

        return invoice;
    }
}
