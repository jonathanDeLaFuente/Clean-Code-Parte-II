
// Clase que representa una calculadora básica
public class CalculadoraBloqueVII {
    // Constantes públicas
    public static final int MAX_OPERANDO = 100;
    public static final int MIN_OPERANDO = 0;

    // Variables privadas
    private int resultado;

    // Funciones públicas
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    // Funciones privadas
    private void actualizarResultado(int nuevoResultado) {
        this.resultado = nuevoResultado;
    }
}