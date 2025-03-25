import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> listaPrecios = new ArrayList<>();

        listaPrecios.add(199.99);
        listaPrecios.add(49.99);
        listaPrecios.add(79.99);
        listaPrecios.add(399.99);
        listaPrecios.add(299.99);

        System.out.println("Precios originales:");
        for (double precio : listaPrecios){
            System.out.println("Precio: " + precio);
        }

        listaPrecios.set(1, 65.99);
        listaPrecios.set(2, 315.99);
        listaPrecios.set(3, 639.99);

        System.out.println("Precios modificados:");
        for (double precio : listaPrecios){
            System.out.println("Precio: " + precio);
        }


    }
}