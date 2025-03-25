import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el stock actual del producto:");
        int stock = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la cantidad vendida:");
        int ventas = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la cantidad recibida:");
        int recibos = Integer.parseInt(input.nextLine());

        int nuevoStock = actualizarStock(stock, ventas, recibos);
        System.out.println("El nuevo stock del producto es: " +  nuevoStock);

    }

    public static int actualizarStock(int stockActual, int ventas, int recibos){
        return stockActual - ventas + recibos;
    }

}