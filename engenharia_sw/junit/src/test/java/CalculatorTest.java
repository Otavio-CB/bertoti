import org.junit.Test;

import junit.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-3, 5);
        assertEquals(2, result);
    }
}
