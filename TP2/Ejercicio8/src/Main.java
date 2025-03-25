import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):");
        double impuesto = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):");
        double descuento = Double.parseDouble(input.nextLine());

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("Precio final : " + precioFinal);

    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
       return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }

}