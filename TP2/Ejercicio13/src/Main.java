import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> listaPrecios = new ArrayList<>(Arrays.asList(199.99, 49.99, 149.99, 399.99, 89.99));

        System.out.println("Precios originales:");
        mostrarPrecios(listaPrecios, 0);

        listaPrecios.set(1, 65.99);
        listaPrecios.set(2, 315.99);
        listaPrecios.set(3, 639.99);

        System.out.println("Precios originales:");
        mostrarPrecios(listaPrecios, 0);

    }

    public static void mostrarPrecios( ArrayList<Double> precios, int index) {
        if (index >= precios.size()) return; // Caso base: cuando el índice supera el tamaño del array

        System.out.println("Precio: " + precios.get(index));
        mostrarPrecios(precios, index + 1); // Llamada recursiva al siguiente índice
    }

}