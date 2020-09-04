package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add() {
        int expected = 5;
        int actual = calc.add(2, 3);
        assertEquals(expected,actual);
    }
}
