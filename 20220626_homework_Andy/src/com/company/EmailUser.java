package com.company;

public class EmailUser {
    private String fFame;
    private String lName;
    private String email;

    public String getfFame() {
        return fFame;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public EmailUser(String fFame, String lName, String email) {
        this.fFame = fFame;
        this.lName = lName;
        this.email = email;
    }

}
