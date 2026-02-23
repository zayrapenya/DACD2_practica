package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.calculate(Operation.ADD, 2, 3));
    }
    @Test
    public void testSubtract() {
        assertEquals(5, calculator.calculate(Operation.SUBSTRACT, 10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(35, calculator.calculate(Operation.MULTIPLY, 7, 5));
    }
    @Test
    public void testDivide() {
        assertEquals(2, calculator.calculate(Operation.DIVIDE, 10, 5));
    }
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () ->
                calculator.calculate(Operation.DIVIDE, 5, 0));
    }

    @Test
    public void testAddByDecimal() {
        assertEquals(5, calculator.calculate(Operation.ADD, 2.5, 2.5));
    }
    @Test
    public void testMultiplyByDecimal() {
        assertEquals(11.25, calculator.calculate(Operation.MULTIPLY, 2.5, 4.5));
    }
    @Test
    public void testSubstractByNegative() {
        assertEquals(-10, calculator.calculate(Operation.SUBSTRACT, -5, 5));
    }

}
