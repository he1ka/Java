package com.company.WebShop;

public class Price {
    // список валют (константы)
    public static final String CURRENCY_USD = "USD";
    public static final String CURRENCY_EUR = "EUR";
    public static final String CURRENCY_UAH = "UAH";

    // цена в центах
    private int value;
    private String currencyCode;

    public Price(int value, String currencyCode) {
        this.value = value;
        this.currencyCode = currencyCode;
    }

    public int getValue() {
        return value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getFormattedPrice() {
        return (double)value/100 + " " + currencyCode;
    }

    @Override
    public String toString() {
        return getFormattedPrice();
    }
}
