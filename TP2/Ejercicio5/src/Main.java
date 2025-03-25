import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número (0 para terminar) : ");
        int numero = Integer.parseInt(input.nextLine());

        List<Integer> listaNumeros = new ArrayList<>();

        while (numero != 0) {
            listaNumeros.add(numero);
            System.out.println("Ingrese un número (0 para terminar) : ");
            numero = Integer.parseInt(input.nextLine());
        }

        int sumaPares = 0;

        for (int numeroLista : listaNumeros) {
            if (numeroLista % 2 == 0) {
                sumaPares += numeroLista;
            }
        }

        System.out.println("La suma de los números pares es : " + sumaPares);

    }
}