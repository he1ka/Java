package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Map<String, String> abMap = new HashMap<>();
        abMap.put("a", "Hi");
        abMap.put("b", "There");

        System.out.println(sumNewKeyValues(abMap));

        List<Book> books = new ArrayList<>();
        books.add(new Book("Tolkien", "Lord of the Ring"));
        books.add(new Book("Tolkien", "Hobbit"));
        books.add(new Book("Erin Hunter", "Warrior Cats"));
        books.add(new Book("Erin Hunter", "Survival Dogs"));
        books.add(new Book("Stevenson ", "Treasure Island"));

        // {"Tolkien, {"Lord of the Ring", "Hobbit"}}, {"Erin Hunter", {"Warrior Cats", ..}}, ...}
        System.out.println(getAuthorsWithBooks(books));

        Author tolkien = new Author("JRR", "Tolkien");

        Author vHolmes = new Author("Victoria", "Holmes");
        Author kCary = new Author("Kate", "Cary");
        Author bCherith = new Author("Cherith", "Baldry");

        List<AdvancedBook> advancedBooks = new ArrayList<>();

        advancedBooks.add(
                new AdvancedBook(
                        "Lord of the Ring",
                        new ArrayList<>(Arrays.asList(tolkien)),
                        "ISB123"
                )
        );
        advancedBooks.add(
                new AdvancedBook(
                        "Warrior Cats",
                        new ArrayList<>(Arrays.asList(vHolmes, kCary, bCherith)),
                        "ISB333"
                )
        );

        advancedBooks.add(
                new AdvancedBook(
                        "Survival Dogs",
                        new ArrayList<>(Arrays.asList(vHolmes, kCary, bCherith)),
                        "ISB4444"
                )
        );

        System.out.println(getAdvancedAuthorsWithBooks(advancedBooks));
    }

    /**
     * 1) Дана Map<String, String>, если в ней есть ключ ‘a’ и ‘b’, то нужно
     * создать новый ключ ‘ab’ с суммой значений от ключей a и b.
     * Примеры:
     * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
     * mapAB({"a": "Hi"}) → {"a": "Hi"}
     * mapAB({"b": "There"}) → {"b": "There"}
     */
    public static Map<String, String> sumNewKeyValues(Map<String, String> input) {
        if (input.containsKey("a") && input.containsKey("b")) {
            input.put("ab", input.get("a") + input.get("b"));
        }

        return input;
    }

    /**
     * 2) Дан список Book{String author, String title}. Необходимо сформировать
     * Map<String, List<String>> , где ключом будет автор, а значением -
     * список книг данного автора.
     */
    public static Map<String, List<String>> getAuthorsWithBooks(List<Book> books) {
        Map<String, List<String>> authorsWithBooks = new HashMap<>();

        for (Book book : books) {
            String author = book.getAuthor();
            List<String> authorBooks = authorsWithBooks.containsKey(author)
                    ? authorsWithBooks.get(author) // автор есть - получаем его книги из Map
                    : new ArrayList<>(); // автора нет - создаем пустой список книг

            authorBooks.add(book.getTitle());
            authorsWithBooks.put(author, authorBooks);
        }

        return authorsWithBooks;
    }

    /**
     * 3) Предположим, что дан список Book, но в отличие от предыдущей задачи
     * Author – класс {String fName, String lName} и книга более сложный объект,
     * у которого есть список авторов, название и ISBN (International Standard
     * Book Number) т.е. {String title, List<Author> authors, String ISBN}.
     * Необходимо сформировать map<Author, List<Book>>,  где ключ - автор,
     * а значение список его книг. Естественно, если у книги несколько авторов,
     * то книга должна отразиться в списке книг всех авторов данной книги.
     */
    public static Map<Author, List<AdvancedBook>> getAdvancedAuthorsWithBooks(List<AdvancedBook> books) {
        Map<Author, List<AdvancedBook>> authorsWithBooks = new HashMap<>();

        for (AdvancedBook book : books) {

            for (Author author : book.getAuthors()) {
                List<AdvancedBook> authorBooks = authorsWithBooks.containsKey(author)
                        ? authorsWithBooks.get(author) // автор есть - получаем его книги из Map
                        : new ArrayList<>(); // автора нет - создаем пустой список книг

                authorBooks.add(book);
                authorsWithBooks.put(author, authorBooks);
            }
        }

        return authorsWithBooks;
    }
}
