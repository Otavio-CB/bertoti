import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.Calculadora;
import junit.Test2;

public class TestSuite {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(4, 3);
        assertEquals(12, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(8, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10, 0);
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
