package bloque4;
public class Errores {
    public static void main(String[] args) {
        // Punto 1: Usa excepciones en lugar de código de retorno
        try {
            int resultado = dividir(10, 0); // Intentamos dividir por cero
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Punto 2: Escribe primero el try-catch-finally
        try {
            int[] array = new int[5];
            System.out.println(array[10]); // Intentamos acceder a un índice fuera de rango
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocurrió un error al acceder al índice del array");
        } finally {
            System.out.println("Se ejecuta el bloque finally");
        }

        // Punto 3: Usa excepciones unchecked
        try {
            int numero = Integer.parseInt("abc"); // Intentamos convertir una cadena no numérica a entero
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir la cadena a entero");
        }

        // Punto 4: No devuelvas Null
        String mensaje = obtenerMensaje(true); // Obtener un mensaje
        if (mensaje != null) {
            System.out.println("Mensaje obtenido: " + mensaje);
        } else {
            System.out.println("No se pudo obtener el mensaje");
        }
    }

    // Método para dividir dos números y lanzar una excepción en lugar de devolver un código de error
    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }

    // Método que devuelve un mensaje y no devuelve null
    public static String obtenerMensaje(boolean condicion) {
        if (condicion) {
            return "Hola, mundo!";
        } else {
            return ""; // Se podría lanzar una excepción en lugar de devolver una cadena vacía
        }
    }
}

