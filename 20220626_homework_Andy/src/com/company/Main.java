package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Author tolkien = new Author("J.R.R.", "Tolkien");

        books.add(new Book("Warrior Cats", new Author("Erin", "Hunter")));
        books.add(new Book("Hobbit", tolkien));
        books.add(new Book("Lord of the Ring", tolkien));
        books.add(new Book("Harry Potter", new Author("Joan", "Rowling")));
        books.add(new Book("Wings of Fire", new Author("Tui T.", "Sutherland")));
        books.add(new Book("The Silmarillion", tolkien));

        System.out.println(getAuthorList(books));

        List<User> users = new ArrayList<>();

        users.add(new User("Alex", "alex@gmail.com"));
        users.add(new User("Oleg", "oleg@gmail.com"));
        users.add(new User("Alex", "alex@gmail.com"));
        users.add(new User("Irina", "irina@gmail.com"));
        users.add(new User("Jan", "jan@gmail.com"));
        System.out.println(isDuplicatesInList(users));

        List<EmailUser> emailUsers = new ArrayList<>();
        emailUsers.add(new EmailUser("Nina", "Orlovska", "nina@gmail.com"));
        emailUsers.add(new EmailUser("Arina", "Nuss", "arina@gmail.com"));
        emailUsers.add(new EmailUser("Valeria", "Nuss", "arina@gmail.com"));
        emailUsers.add(new EmailUser("Polina", "Huber", "polina@gmail.com"));
        emailUsers.add(new EmailUser("Nikolina", "Huber", "polina@gmail.com"));
        emailUsers.add(new EmailUser("Barbara", "Maler", "barbara@gmail.com"));

        System.out.println(getDistributionListEmail(emailUsers));
    }

    /**
     * Дан лист Вook{String title, Author author}. Естественно, один автор
     * Author{firstName, lastName} может б
     * ыть автором нескольких книг.
     * Необходимо получить список всех авторов.
     */
    public static List<Author> getAuthorList(List<Book> books) {
        List<Author> authors = new ArrayList<>();

        for (Book b : books) {
            Author author = b.getAuthor();
            // если автора еще нет в списке авторов - добавляем его
            // authors.contains(author); - возращает true если объект author есть в списоке authors
            if (!authors.contains(author)) {
                authors.add(author);
            }
        }

        return authors;
    }

    /**
     * Дан список User<name, email>, необходимо написать метод, который определит,
     * есть ли в списке дубли.
     */
    public static boolean isDuplicatesInList(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            User first = users.get(i);
            for (int j = i + 1; j < users.size(); j++) {
                User second = users.get(j);

                if (first.compareTo(second) == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Дано несколько списков User-ов{fFame, lName, email}, необходимо написать
     * метод, который подготовит список всех email-ов для рассылки
     */
    public static List<String> getDistributionListEmail(List<EmailUser> emailUsers) {
        List<String> emails = new ArrayList<>();

        for (EmailUser e : emailUsers) {
            String email = e.getEmail();

            if (!emails.contains(email)) {
                emails.add(email);
            }
        }

        return emails;
    }
}
