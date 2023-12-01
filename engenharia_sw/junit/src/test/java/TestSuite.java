import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.Calculator;
import junit.Test2;

public class TestSuite {

    @Test
    public void testSomar() {
        Calculator calculator = new Calculator();
        int resultado = calculator.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtrair() {
        Calculator calculator = new Calculator();
        int resultado = calculator.subtrair(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        Calculator calculator = new Calculator();
        int resultado = calculator.multiplicar(4, 3);
        assertEquals(12, resultado);
    }

    @Test
    public void testDividir() {
        Calculator calculator = new Calculator();
        int resultado = calculator.dividir(8, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void testDividirPorZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.dividir(10, 0);
        });
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
