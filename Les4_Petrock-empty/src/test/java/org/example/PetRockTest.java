package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    PetRock petRock;

    @BeforeEach
    void setUp() {
        // Arrange
        this.petRock = new PetRock("Hans");
    }

    @Test
    void getName() {
        // Act
        String result = petRock.getName();
        // Assert
        assertEquals("Hans", result);
    }

    @Test
    void isHappy_AtStart_ReturnsFalse() {
        // Act
        boolean result = petRock.isHappy();
        // Assert
        assertFalse(result);
    }

    @Test
    void isHappy_AfterPlay_ReturnsTrue() {
        // Act
        petRock.play();
        boolean result = petRock.isHappy();
        // Assert
        assertTrue(result);
    }

}