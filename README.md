# Java Calculator Example with JUnit Testing

## Overview
This exercise demonstrates the implementation of a simple Java calculator application alongside unit tests using JUnit. It includes three main components:

1. **Main Class**: A simple `Main` class to print a welcome message and demonstrate basic iteration.
2. **Calculator Class**: The core logic of the calculator, including methods for basic arithmetic operations.
3. **CalculatorTest Class**: Unit tests for verifying the functionality of the `Calculator` methods.

## Project Structure

### 1. `Main` Class
**File:** `Main.java`

The `Main` class includes a simple `main` method to demonstrate a for-loop and print a welcome message.
```java
package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
```

### 2. `Calculator` Class
**File:** `Calculator.java`

This class provides methods to perform basic arithmetic operations:
- `add(int a, int b)`
- `subtract(int a, int b)`
- `multiply(int a, int b)`
- `divide(int a, int b)` (throws `IllegalArgumentException` if dividing by zero).

```java
package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract (int a, int b) {
        return a - b;
    }
    public int multiply (int a, int b) {
        return a * b;
    }
    public int divide (int a, int b) {
        if (b == 0) throw new IllegalArgumentException();
        return a / b;
    }
}
```

### 3. `CalculatorTest` Class
**File:** `CalculatorTest.java`

This class uses JUnit 5 to perform unit tests on the methods of the `Calculator` class. Key features:
- `@BeforeEach` to initialize the `Calculator` object before each test.
- Multiple test methods (`add`, `subtract`, `multiply`, `divide`) to validate the expected outputs.
- Assertions like `assertEquals`, `assertNotEquals`, and `assertThrows` are used to verify the functionality and handle edge cases like division by zero.

```java
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
        assertEquals(1, calculator.subtract(4,3));
        assertNotEquals(9, calculator.subtract(5,5));
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
```

## How to Run

1. **Prerequisites**:
   - Java Development Kit (JDK) installed.
   - IntelliJ IDEA or another Java IDE.
   - JUnit 5 library included in the project dependencies.

2. **Steps to Execute**:
   - Open the project in your Java IDE.
   - Run the `Main` class to see the welcome message and loop demonstration.
   - Run the `CalculatorTest` class to execute all unit tests and verify the calculator's functionality.

## Key Learning Objectives
- Understand basic Java syntax and structure.
- Learn to write and test Java classes using JUnit.
- Gain experience with assertions and handling edge cases like division by zero.

---
This exercise provides a foundation for building more complex applications and ensures robust testing practices for Java projects.


## Testing and CI/CD Demo!

This repository is a demo of how to use GitHub Actions to run tests and build a Java project!

[![Java CI](https://github.com/HTL-Warrior/ContinousIntegration/actions/workflows/ci.yml/badge.svg)](https://github.com/HTL-Warrior/ContinousIntegration/actions/workflows/ci.yml)



