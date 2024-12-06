//82) Escreva um programa que leia 10 números inteiros e exiba a soma deles.
package exerciciosjava;
import java.util.*;


public class Ex082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float soma = 0;
        int[] a = new int[10];
        for (int c = 0; c <= 9; c++) {
            System.out.println("Número " + (c+1) + ": ");
            a[c] = sc.nextInt();
            soma += a[c];

        }
        System.out.println("Soma: " + soma);
    }
}