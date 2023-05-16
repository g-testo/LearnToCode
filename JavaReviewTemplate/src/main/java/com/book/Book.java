package com.book;

public class Book {
    private String title;
    private String genre;
    private long isbn;
    private boolean isFirstEdition;
    private static int totalNumberOfBooksCreated;

    public Book(){}
    public Book(String title, String genre, long isbn, boolean isFirstEdition) {
        this.title = title;
        this.genre = genre;
        this.isbn = isbn;
        this.isFirstEdition = isFirstEdition;

        this.totalNumberOfBooksCreated++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public boolean isFirstEdition() {
        return isFirstEdition;
    }

    public void setFirstEdition(boolean firstEdition) {
        isFirstEdition = firstEdition;
    }

    public String getDescription(){
        return "This book is called " + this.title + " and it's in the " + this.genre + " genre";
    }

    public static int getTotalNumberOfBooksCreated(){
        return totalNumberOfBooksCreated;
    }

    public String checkout(){
        return "You have checked out the book today";
    }

    public String checkout(String date){
        return "You have checked out the book " + date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", isbn=" + isbn +
                ", isFirstEdition=" + isFirstEdition +
                '}';
    }
}
