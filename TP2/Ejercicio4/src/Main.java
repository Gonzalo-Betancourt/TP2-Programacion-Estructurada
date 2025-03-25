import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int DESCUENTO_CATEGORIA_A = 10;
        final int DESCUENTO_CATEGORIA_B = 15;
        final int DESCUENTO_CATEGORIA_C = 20;

        System.out.println("Ingrese el precio del producto : ");
        double producto = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese que categoria es el producto [A, B o C] : ");
        String categoria = input.nextLine().toLowerCase(Locale.ROOT);

        double descuento = 0;

        if (categoria.equals("a")) {
            descuento = (producto * DESCUENTO_CATEGORIA_A) / 100;
        } else if (categoria.equals("b")) {
            descuento = (producto * DESCUENTO_CATEGORIA_B) / 100;
        } else if (categoria.equals("c")) {
            descuento = (producto * DESCUENTO_CATEGORIA_C) / 100;
        } else {
            System.out.println("Categoria desconocida");
        }

        System.out.println("Descuento aplicado " + categoria);

        double precioFinal = producto - descuento;

        System.out.println("Precio final : " + precioFinal);

    }
}