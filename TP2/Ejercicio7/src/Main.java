import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean notaIngresada = false;
        int nota;

        while (!notaIngresada) {

            System.out.println("Ingrese una nota [0-10] :");
            nota = Integer.parseInt(input.nextLine());

            if (nota >= 0 && nota <= 10){
                System.out.println("Nota ingresada correctamente!");
                notaIngresada = true;
            } else {
                System.out.println("Valor inválido");
            }

        }

    }
}