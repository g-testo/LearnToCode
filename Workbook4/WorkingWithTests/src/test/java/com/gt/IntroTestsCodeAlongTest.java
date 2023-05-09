package com.gt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroTestsCodeAlongTest {
    @Test
    void sum_should_addBothNumbers() {
        // Arrange
        int firstNumber = 50;
        int secondNumber = 100;

        // Act
        int actual = IntroTestsCodeAlong.sum(firstNumber, secondNumber);

        // Assert
        assertEquals(150, actual);
    }
    @Test
    void subOfTwoZeros_should_beZero() {
        // Arrange
        int firstNumber = 0;
        int secondNumber = 0;

        // Act
        int actual = IntroTestsCodeAlong.sum(firstNumber, secondNumber);

        // Assert
        assertEquals(0, actual);
    }


}