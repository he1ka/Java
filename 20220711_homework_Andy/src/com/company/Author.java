package com.company;

public class Author {
    private String fName;
    private String lName;

    public Author(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    @Override
    public String toString() {
        return "{" + fName + ' ' + lName + '}';
    }
}
