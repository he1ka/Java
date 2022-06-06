package com.company.onlineStore;

public class MobilePhone extends Electronic {
    private boolean mobilePhoneWithContract;

    private static final double mobilePhoneContractCost = 20.20;

    public MobilePhone(String title, double price, double discountPercent, boolean withWarranty) {
        super(title, price, discountPercent, withWarranty);

        mobilePhoneWithContract = true;
    }

    @Override
    public Invoice purchase() {
        Invoice invoice = super.purchase();

        if (mobilePhoneWithContract) {
            invoice.addPrice(mobilePhoneContractCost);
        }

        return invoice;
    }
}
