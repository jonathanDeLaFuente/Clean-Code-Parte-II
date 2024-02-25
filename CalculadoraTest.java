import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(3, 5);
        assertEquals(8, resultado);
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    public void testUnAssertPorTest() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testUnicoConceptoPorTest() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(8, 4);
        assertEquals(4, resultado);
    }

    @Test(timeout = 100)
    public void testRapido() {
        Calculadora calc = new Calculadora();
        calc.sumar(2, 3);
    }
}
