import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraPostfixTest {
    private CalculadoraPostfix calculadora;

    @Before
    public void setUp() {
        StackInterface<Integer> stack = new Module<>(); // Puedes cambiar a VectorStack
        calculadora = new CalculadoraPostfix(stack);
    }

    @Test
    public void testSuma() {
        assertEquals(15, calculadora.evaluar("1 2 + 4 * 3 +"));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(30, calculadora.evaluar("6 2 3 + *"));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {
        calculadora.evaluar("10 0 /");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperadorInvalido() {
        calculadora.evaluar("5 2 &");
    }
}
