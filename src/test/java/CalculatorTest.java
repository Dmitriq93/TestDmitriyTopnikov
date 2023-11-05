import calculator.Calculator;
    import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void addsTwoNumbers() {
        assertEquals(8.0, calculator.makeCalculation(6.0, 2.0, '+'),1);
    }

    @Test
    public void subtractsTwoNumbers() {
        assertEquals(4.00, calculator.makeCalculation(6.0, 2.0, '-'),1);
    }

    @Test
    public void multipliesTwoNumbers() {
        assertEquals(12.0, calculator.makeCalculation(6.0, 2.0, '*'),1);
    }

    @Test
    public void dividesTwoNumbers() {
        assertEquals(3.0, calculator.makeCalculation(6.0, 2.0, '/'),1);

    }
}

