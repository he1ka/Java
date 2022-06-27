package com.company;

public class User implements Comparable<User> {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(User o) {
        return email == o.email && name == o.name
                ? 0  // оба пользователя одинаковые
                : -1; // нам без разницы как сортировать
    }
}
