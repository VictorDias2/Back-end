//87) Faça um programa que leia 10 números inteiros e exiba quantos deles são positivos.
package exerciciosjava;
import java.util.*;

public class Ex087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivo = 0;
        int[] num = new int[10];
        for (int contador = 0; contador <= 9; contador++) {
            System.out.println("Número " + (contador + 1) + ": ");
            num[contador] = sc.nextInt();
            if (num[contador] > 0) {
                positivo++;
            }
        }

        System.out.println("Existem " + positivo + " números positivos");
    }
}
