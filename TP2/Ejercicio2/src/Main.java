import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número : ");
        int numero1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el segundo número : ");
        int numero2 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el primer número : ");
        int numero3 = Integer.parseInt(input.nextLine());

        int mayor = Math.max(numero1, Math.max(numero2, numero3));

        System.out.println("El mayor número es " + mayor);
    }

}