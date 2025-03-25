import java.util.Scanner;

public class Main {

    public static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precio = Integer.parseInt(input.nextLine());

        calcularDescuentoEspecial(precio);

    }

    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado =  precio * DESCUENTO_ESPECIAL;
        System.out.println("Descuento aplicado: " + descuentoAplicado);
        System.out.println("Precio final con descuento: " + (precio - descuentoAplicado));
    }

}