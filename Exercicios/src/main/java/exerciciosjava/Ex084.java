//84) Faça um programa que leia 5 números inteiros e exiba quantos deles são pares.
package exerciciosjava;
import java.util.*;

public class Ex084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par = 0;
        int[] a = new int[5];
        for (int c = 0; c <= 4; c++) {
            System.out.println("Número " + (c + 1) + ": ");
            a[c] = sc.nextInt();
            if (a[c] % 2 == 0) {
                par++;
            }
            }

        System.out.println("Existem " + par + " números pares");
    }
}
