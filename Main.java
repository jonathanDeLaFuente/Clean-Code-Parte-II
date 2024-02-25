public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la calculadora y realizar algunas operaciones
        CalculadoraBloqueVII calc = new CalculadoraBloqueVII();
        int suma = calc.sumar(5, 3);
        int resta = calc.restar(10, 4);

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}