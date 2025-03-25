import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su edad : ");
        int edad = Integer.parseInt(input.nextLine());

        if (edad >= 0 && edad <= 12) {
            System.out.println("Usted es un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Usted es un adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Usted es un adulto");
        } else if (edad >= 60 && edad <= 105){
            System.out.println("Usted es un adulto mayor");
        } else {
            System.out.println("La edad introducida no es valida...");
        }

    }
}