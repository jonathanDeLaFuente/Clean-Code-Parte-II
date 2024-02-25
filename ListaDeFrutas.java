package bloque4;
import java.util.ArrayList;
import java.util.List;
public class ListaDeFrutas {
    private List<String> frutas;

    public ListaDeFrutas() {
        frutas = new ArrayList<>();
    }

    public void agregarFruta(String fruta) {
        frutas.add(fruta);
    }

    public void mostrarFrutas() {
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    public static void main(String[] args) {
        ListaDeFrutas lista = new ListaDeFrutas();
        lista.agregarFruta("Manzana");
        lista.agregarFruta("Plátano");
        lista.agregarFruta("Uva");

        lista.mostrarFrutas();
    }
}
