import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<>();

        final int FIN_CICLO = 10;
        int contador = 0;

        int numero = 0;

        while (contador < FIN_CICLO) {
            contador ++;
            System.out.println("Ingrese el número " + contador + " :");
            numero = Integer.parseInt(input.nextLine());
            listaNumeros.add(numero);
        }

        int ceros = 0;
        int negativos = 0;
        int positivos = 0;

        for (int numeroLista : listaNumeros) {
            if (numeroLista == 0) {
                ceros ++;
            } else if (numeroLista > 0) {
                positivos ++;
            } else {
                negativos ++;
            }
        }

        System.out.println("Ceros : " + ceros);
        System.out.println("Negativos : " + negativos);
        System.out.println("Positivos : " + positivos);

    }
}