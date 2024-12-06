//94) Escreva um programa que leia 7 números inteiros e exiba apenas os números pares.
package exerciciosjava;
import java.util.*;

public class Ex094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pares = new int[7];
        int qtdPar = 0;

        int[] num = new int[7];

        for (int contador = 0; contador <= 6; contador++) {
            System.out.println("Número " + (contador + 1) + ": ");
            num[contador] = sc.nextInt();

            if (num[contador] % 2 == 0) {
                pares[qtdPar] = num[contador];
                qtdPar++;

                    }

                }
        System.out.println("Os número pares são: ");
        for (int n = 0; n < qtdPar; n++) {
            System.out.println(pares[n]);
        }
    }
}