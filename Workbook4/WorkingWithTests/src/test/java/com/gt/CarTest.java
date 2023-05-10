package com.gt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getDescription_should_returnMakeModel() {
        // Arrange
        String brand1 = "Honda";
        String model1 = "Accord";
        String owner1 = "Greg";

        String brand2 = "Dodge";
        String model2 = "Neon";
        String owner2 = "Greg";

        String brand3 = "Honda";
        String model3 = "Fit";
        String owner3 = "Greg";

        // Act
        Car actual1 = new Car(brand1, model1, owner1);
        Car actual2 = new Car(brand2, model2, owner2);
        Car actual3 = new Car(brand3, model3, owner3);

        // Assert
        assertEquals("Description: Brand: Honda, Model: Accord", actual1.getCarDescription());
        assertEquals("Description: Brand: Dodge, Model: Neon", actual2.getCarDescription());
        assertEquals("Description: Brand: Honda, Model: Fit", actual3.getCarDescription());
    }

    @Test
    void isStringOwnerIfOwner_should_returnTrue() {
        // Arrange
        // Act
        Car gregsCar = new Car("", "", "Greg");
        Car scarletsCar = new Car("", "", "Scarlet");
        Car juliansCar = new Car("", "", "Julian");

        // Assert
        assertEquals(true, gregsCar.isStringOwner("Greg"));
        assertEquals(true, scarletsCar.isStringOwner("Scarlet"));
        assertEquals(true, juliansCar.isStringOwner("Julian"));
    }

    @Test
    void isStringOwnerIfNotOwner_should_returnFalse() {
        // Arrange
        // Act
        Car gregsCar = new Car("", "", "Greg");
        Car scarletsCar = new Car("", "", "Scarlet");
        Car juliansCar = new Car("", "", "Julian");

        // Assert
        assertEquals(false, gregsCar.isStringOwner("Scarlet"));
        assertEquals(false, scarletsCar.isStringOwner("Julian"));
        assertEquals(false, juliansCar.isStringOwner("Greg"));
    }

    @Test
    void accelerate_should_setSpeedHigherByAmount () {
        // Arrange
        // Act
        // Assert
    }

    @Test
    void brake_should_setSpeedLowerByAmount() {
        // Arrange
        // Act
        // Assert
    }

    @Test
    void brake_should_setSpeedToZeroWhenAmountIsGreaterThanSpeed() {
        // Arrange
        // Act
        // Assert
    }

}