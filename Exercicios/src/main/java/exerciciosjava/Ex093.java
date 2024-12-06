//93) Faça um programa que leia 10 números inteiros e exiba quantos deles estão no intervalo de 10 a 50.
package exerciciosjava;
import java.util.*;

public class Ex093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intervalo = 0;
        int[] num = new int[10];
        for (int contador = 0; contador <= 9; contador++) {
            System.out.println("Número " + (contador + 1) + ": ");
            num[contador] = sc.nextInt();
            if (num[contador] >= 10 && num[contador] <= 50) {
                intervalo++;
            }
        }

        System.out.println("Existem " + intervalo + " no intervalo de 10 a 50");
    }
}
