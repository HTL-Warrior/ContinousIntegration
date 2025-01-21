# Java Calculator Example with Custom Exception and JUnit Testing

## Overview
This exercise demonstrates the implementation of a Java calculator application with enhanced error handling using a custom exception (`DivideByZeroException`). Unit tests using JUnit are also included to ensure the reliability of the calculator's functionality.

## Project Structure

### 1. `Calculator` Class
**File:** `Calculator.java`

The `Calculator` class provides methods for basic arithmetic operations. It includes a custom exception `DivideByZeroException` to handle division by zero.

#### Methods:
- `add(int a, int b)` - Adds two integers.
- `subtract(int a, int b)` - Subtracts the second integer from the first.
- `divide(int a, int b)` - Divides the first integer by the second. Throws `DivideByZeroException` if the divisor is zero.
- `multiply(int a, int b)` - Multiplies two integers.

```java
package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) throw new DivideByZeroException();
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
```

### 2. `DivideByZeroException` Class
**File:** `DivideByZeroException.java`

This custom exception is thrown when an attempt is made to divide a number by zero.

```java
package org.example;

public class DivideByZeroException extends Exception {
}
```

### 3. `CalculatorTest` Class
**File:** `CalculatorTest.java`

This class tests the `Calculator` methods using JUnit 5. It includes:

- `@BeforeEach` to initialize the `Calculator` object before each test.
- Tests for all arithmetic methods, including handling division by zero using `assertThrows`.

```java
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(8, calculator.add(3, 5));
        assertNotEquals(8, calculator.add(3, 4));
    }

    @Test
    void subtract() {
        assertEquals(-8, calculator.subtract(10, 18));
        assertNotEquals(10, calculator.subtract(2, 3));
    }

    @Test
    void divide() {
        try {
            assertEquals(5, calculator.divide(20, 4));
        } catch (DivideByZeroException e) {
            throw new RuntimeException();
        }

        try {
            assertNotEquals(3, calculator.divide(4, 1));
        } catch (DivideByZeroException e) {
            throw new RuntimeException();
        }

        assertThrows(DivideByZeroException.class, () -> calculator.divide(12, 0));
    }

    @Test
    void multiply() {
        assertEquals(12, calculator.multiply(3, 4));
        assertNotEquals(12, calculator.multiply(3, 3));
    }
}
```

## Key Features
- **Custom Exception**: Handles division by zero gracefully.
- **Unit Testing**: Verifies the correctness of all arithmetic methods.
- **Edge Cases**: Ensures robustness by testing with unexpected inputs, like zero division.

## How to Run

1. **Prerequisites**:
   - Java Development Kit (JDK) installed.
   - JUnit 5 library included in the project dependencies.

2. **Steps to Execute**:
   - Compile and run the `Calculator` class to use its methods interactively.
   - Run `CalculatorTest` to execute all unit tests.

## Key Learning Objectives
- Implement and utilize custom exceptions in Java.
- Write unit tests to validate application functionality.
- Understand how to handle edge cases effectively in a program.

---
This exercise introduces the use of exceptions and unit testing to build a more robust and maintainable Java application.


## Testing and CI/CD Demo!

This repository is a demo of how to use GitHub Actions to run tests and build a Java project!

[![Java CI](https://github.com/HTL-Warrior/ContinousIntegration/actions/workflows/ci.yml/badge.svg)](https://github.com/HTL-Warrior/ContinousIntegration/actions/workflows/ci.yml)


Hier ist eine neue Dokumentation!