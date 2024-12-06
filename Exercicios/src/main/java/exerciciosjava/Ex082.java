//82) Escreva um programa que leia 10 números inteiros e exiba a soma deles.
package exerciciosjava;
import java.util.*;


public class Ex082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float media = 0;
        int[] a = new int[10];
        for (int c = 1; c <= 10; c++) {
            System.out.println("Número " + c + ": ");

            a[c] = sc.nextInt();
            media += a[c];
        }
        System.out.println("Media: " + media/10);
    }
}