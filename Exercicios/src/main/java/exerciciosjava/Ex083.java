//83) Crie um programa que leia 7 números inteiros e exiba a média aritmética dos valores lidos.
package exerciciosjava;
import java.util.*;

public class Ex083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float media = 0;
        int[] a = new int[7];
        for (int c = 0; c <= 6; c++) {
            System.out.println("Número " + (c+1) + ": ");
            a[c] = sc.nextInt();
            media += a[c];

        }
        System.out.println("Média: " + media/7);
    }
}
