import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.Test1;
import junit.Test2;

public class TestSuite {

    @Test
    public void testAdd() {
        Test1 calculator = new Test1();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        Test1 calculator = new Test1();
        int result = calculator.add(-3, 5);
        assertEquals(2, result);
    }

    @Test
    public void testFunctionWithinRange() {
        Test2 test2 = new Test2();

        for (int input = -32567; input <= 32567; input++) {
            int result = test2.function(input);
            int expect = (input -1) / 30000;
            assertEquals(result, expect);
        }
    }
}
