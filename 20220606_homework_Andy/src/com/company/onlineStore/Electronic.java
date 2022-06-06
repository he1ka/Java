package com.company.onlineStore;

public class Electronic extends Product {
    private boolean withWarranty = false;

    protected static final double warrantyCost = 12.20;

    public Electronic(String title, double price, double discountPercent, boolean withWarranty) {
        super(title, price, discountPercent);

        this.withWarranty = withWarranty;
    }

    public boolean isWithWarranty() {
        return withWarranty;
    }

    @Override
    public Invoice purchase() {
        Invoice invoice = super.purchase();

        if (withWarranty) {
            invoice.addPrice(warrantyCost);
        }

        return invoice;
    }
}
