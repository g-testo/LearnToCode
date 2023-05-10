package com.gt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getDescription() {
        // Arrange
        String brand1 = "Honda";
        String model1 = "Accord";

        String brand2 = "Dodge";
        String model2 = "Neon";

        String brand3 = "Honda";
        String model3 = "Fit";

        // Act
        Car actual1 = new Car(brand1, model1);
        Car actual2 = new Car(brand2, model2);
        Car actual3 = new Car(brand3, model3);

        // Assert
        assertEquals("Description: Brand: Honda, Model: Accord", actual1.getDescription());
        assertEquals("Description: Brand: Dodge, Model: Neon", actual2.getDescription());
        assertEquals("Description: Brand: Honda, Model: Fit", actual3.getDescription());
    }
}