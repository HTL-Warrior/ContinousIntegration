package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(3, 4));
        assertNotEquals(9, calculator.add(5, 5));
    }

    @Test
    void subtract() {
        assertEquals(1,calculator.subtract(4,3));
        assertNotEquals(9,calculator.subtract(5,5));
    }

    @Test
    void multiply() {
        assertEquals(9,calculator.multiply(3,3));
        assertNotEquals(9,calculator.multiply(5,5));
    }

    @Test
    void divide() {
        assertEquals(7,calculator.divide(28,4));
        assertNotEquals(9,calculator.divide(5,5));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(12, 0));
    }

}