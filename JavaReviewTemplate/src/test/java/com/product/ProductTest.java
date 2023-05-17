package com.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void calcIsOnSale_ifProductIsOnSale_should_returnTrue() {
        // Arrange
        Product product = new Product("Frosted flakes", "Cereal", 3.0f);

        // Act
        boolean actual = product.calcIsOnSale();

        // Assert
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void calcIsOnSale_ifProductIsNotOnSale_should_returnFalse() {
        // Arrange
        Product product = new Product("Orange", "Fruit", .5f);

        // Act
        boolean actual = product.calcIsOnSale();

        // Assert
        boolean expected = false;
        assertEquals(expected, actual);
    }
}