import calculator.Calculator;
import calculator.CalculatorApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void addsTwoNumbers() {
        assertEquals("8.0", calculator.makeCalculation(6.0, 2.0, '+'));
    }

    @Test
    public void subtractsTwoNumbers() {
        assertEquals("4.0", calculator.makeCalculation(6.0, 2.0, '-'));
    }

    @Test
    public void multipliesTwoNumbers() {
        assertEquals("12.0", calculator.makeCalculation(6.0, 2.0, '*'));
    }

    @Test
    public void dividesTwoNumbers() {
        assertEquals("3.0", calculator.makeCalculation(6.0, 2.0, '/'));

    }

    @Test
    void dividesNullArithmeticException() {
        Assertions.assertThrows(AssertionFailedError.class, () -> {
            assertEquals("3.0", calculator.makeCalculation(6.0, 0, '/'));
        });
    }





}

