package com.book;

import java.util.ArrayList;

public class Library {
    private String name;

    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void printBookList(){
        System.out.println(this.books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                '}';
    }
}
