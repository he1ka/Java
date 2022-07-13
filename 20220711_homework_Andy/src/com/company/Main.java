package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        /* Задача 1 */
        Map<String, String> abMap = new HashMap<>();
        abMap.put("a", "Hi");
        abMap.put("b", "There");

        System.out.println(sumNewKeyValues(abMap));

        /* Задача 2 */
        List<Book> books = new ArrayList<>();
        books.add(new Book("Tolkien", "Lord of the Ring"));
        books.add(new Book("Tolkien", "Hobbit"));
        books.add(new Book("Erin Hunter", "Warrior Cats"));
        books.add(new Book("Erin Hunter", "Survival Dogs"));
        books.add(new Book("Stevenson ", "Treasure Island"));

        // {"Tolkien, {"Lord of the Ring", "Hobbit"}}, {"Erin Hunter", {"Warrior Cats", ..}}, ...}
        System.out.println(getAuthorsWithBooks(books));

        /* Задача 3 **/
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


        Map<Author, List<AdvancedBook>> authorsWithBooks = getAdvancedAuthorsWithBooks(advancedBooks);
        System.out.println(authorsWithBooks);

        /* Задача 4 */
        advancedBooks.add(
                new AdvancedBook(
                        "Lord of the Ring",
                        new ArrayList<>(Arrays.asList(tolkien)),
                        "ISB123"
                )
        );

        advancedBooks.add(
                new AdvancedBook(
                        "Lord of the Ring",
                        new ArrayList<>(Arrays.asList(tolkien)),
                        "ISB123"
                )
        );

        System.out.println(booksList(advancedBooks));

        /* Задача 5 */

        // создаем неправильную запись
        AdvancedBook b1 = new AdvancedBook(
                "Warrior Cats",
                new ArrayList<>(Arrays.asList(vHolmes, kCary, bCherith)),
                "ISB333"
        );
        AdvancedBook b2 = new AdvancedBook(
                "Lord of the Ring",
                new ArrayList<>(Arrays.asList(tolkien)),
                "ISB123"
        );

        authorsWithBooks.put(tolkien, Arrays.asList(b1,b2));

        advancedBooks.add(
                new AdvancedBook(
                        "Lord of the Ring",
                        new ArrayList<>(Arrays.asList(tolkien)),
                        "ISB123"
                )
        );

        System.out.println("Authors with books (with error):");
        System.out.println(authorsWithBooks);

        // Проверяем есть ли ошибки в списке авторов с книгами
        System.out.println(isMapContainsError(authorsWithBooks));

        // Исправляем ошибки с неправильными авторами
        fixMapError(authorsWithBooks);

        System.out.println("Authors with books (fixed error):");
        System.out.println(authorsWithBooks);
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

    /**
     * 4) Предположим, дан список поступивших в библиотеку книг. Если пришло
     * несколько экземпляров одной и той же книг, в списке присутствует соответствующее
     * количество одинаковых записей. Необходимо сформировать Map<Book, Integer>,
     * где ключ это книга, значение, сколько раз она встречается в списке,
     * т.е. сколько пришло экземпляров.
     */
    public static Map<AdvancedBook, Integer> booksList(List<AdvancedBook> books) {
        Map<AdvancedBook, Integer> booksCount = new HashMap<>();

        for (AdvancedBook book : books) {
            // для правильной работы containsKey, нам надо чтобы AdvancedBook
            // имплементировал Comparable
            // методы hashCode и equals должны быть добавлены

            if (!booksCount.containsKey(book)) {
                // Если ключа book еще нет - добавляем его и ставим количество 1
                // (книги еще нет в списке)
                booksCount.put(book, 1);
            } else {
                // Если книга в списке уже есть
                // Получаем количество и увеличиваем на 1
                booksCount.put(book, booksCount.get(book) + 1);
            }
        }

        return booksCount;
    }

    /**
     * 5)Дан map<Author, List<Book>> (например, сформированный в задаче №3).
     * Но в него вкрались ошибки, в список книг некоторых авторов попали книги,
     * которые они не писали.
     * Необходимо:
     * a) написать метод, который проверит, есть ли в map такие ошибки.
     * b) написать метод, который исправит ошибки в исходном map.
     */

    /**
     * Проверяем есть ли в Map неправильные записи
     */
    public static boolean isMapContainsError(Map<Author, List<AdvancedBook>> authorsWithBooks) {
        for (Map.Entry entry : authorsWithBooks.entrySet()) {
            // получаем каждый элемент из списка авторов с книгами
            Author author = (Author) entry.getKey();
            List<AdvancedBook> bookList = (List<AdvancedBook>) entry.getValue();

            // внутри списка книг ищем автора
            for (AdvancedBook book: bookList) {
                if (!book.getAuthors().contains(author)) {
                    // Нашего автора нет в списке авторов книги - это ошибка
                    return true;
                }
            }
        }

        return false;
    }

    public static void fixMapError(Map<Author, List<AdvancedBook>> authorsWithBooks) {
        for (Map.Entry entry : authorsWithBooks.entrySet()) {
            Author author = (Author) entry.getKey();
            List<AdvancedBook> bookList = (List<AdvancedBook>) entry.getValue();

            // Создаем новый список - правильных книг
            List<AdvancedBook> correctBookList = new ArrayList<>();

            for (AdvancedBook book: bookList) {
                // Если у книги совпадает автор
                if (book.getAuthors().contains(author)) {
                    // мы добавляем ее в правильный список книг
                    correctBookList.add(book);
                }
            }

            // заменяем у автора - список книг на правильный
            authorsWithBooks.put(author, correctBookList);
        }
    }
}
