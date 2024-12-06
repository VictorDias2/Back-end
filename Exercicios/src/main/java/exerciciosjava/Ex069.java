//69) Faça um programa que leia 5 números inteiros e exiba a média aritmética dos valores lidos.
package exerciciosjava;
import java.util.*;

public class Ex069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.println("Número " + c + ": ");
            int n = sc.nextInt();

            media += n;

        }
        media /= 5;
        System.out.println("Media: " + media);
    }
}