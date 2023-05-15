package com.gt;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Green eggs and ham");

        Library library = new Library("New York City Library");
        library.addBook(book);

        library.printBookList();

    }
}
