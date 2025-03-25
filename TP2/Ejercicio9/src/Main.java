import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precio = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el peso del paquete en kg:");
        double peso = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la zona de envío (Nacional/Internacional):");
        String zonaEnvio = input.nextLine().toLowerCase();

        double costoEnvio = calculcarCostoEnvio(peso, zonaEnvio);
        System.out.println("Costo de envio: " + costoEnvio);

        double totalCompra = calcularTotalCompra(precio, costoEnvio);
        System.out.println("Costo total : " + totalCompra);

    }

    public static double calculcarCostoEnvio(double peso, String zonaEnvio){
        if(zonaEnvio.equals("nacional")){
            return peso * 5;
        } else if(zonaEnvio.equals("nacional")){
            return peso * 10;
        } else {
            return 0;
        }
    }

    public static double calcularTotalCompra (double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }

}