package com.multiply;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc;
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void multiplyTest1() {
        assertEquals(36, calc.multiply(12, 3));
    }

    @Test
    void multiplyTest2() {
        assertEquals(70, calc.multiply(10, 7));
    }
}
