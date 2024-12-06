//89) Crie um programa que leia 10 números inteiros e exiba a quantidade de números positivos e a quantidade de números negativos.
package exerciciosjava;
import java.util.*;

public class Ex089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;
        int[] num = new int[10];
        for (int contador = 0; contador <= 9; contador++) {
            System.out.println("Número " + (contador + 1) + ": ");
            num[contador] = sc.nextInt();
            if (num[contador] > 0) {
                positivo++;
            }
            else if (num[contador] < 0) {
                negativo++;
            }
        }

        System.out.println("Existem " + positivo + " números positivos");
        System.out.println("Existem " + negativo + " números negativos");
    }
}
