package com.company;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return (getName() + ' ' + getEmail()).hashCode();
    }
}
