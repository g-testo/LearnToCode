package com.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void checkoutWithoutArgs_should_returnStaticString() {
        // Arrange
        Book book = new Book();

        // Act
        String actual = book.checkout(); // No arguments

        // Assert
        String expected = "You have checked out the book today";

        assertEquals(expected, actual);
    }

    @Test
    void checkoutWithArg_should_returnStringWithArg() {
        // Arrange
        Book book = new Book();
        String date = "May 14 2023";

        // Act
        String actual = book.checkout(date);

        // Assert
        String expected = "You have checked out the book " + date;

        assertEquals(expected, actual);
    }
}