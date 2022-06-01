package com.company;

public class Film extends Item {
    public static final String TYPE_DVD = "DVD";
    public static final String TYPE_CD = "CD";

    protected String type;

    public Film(String title, String barCode, String genre, String type) {
        super(title, barCode, genre);

        this.type = type;
    }

    public boolean isDvd() {
        return type == TYPE_DVD;
    }

    public boolean isCd() {
        return type == TYPE_CD;
    }
}
