//86) Crie um programa que leia 10 números inteiros e exiba-os em ordem crescente.
package exerciciosjava;
import java.util.*;

public class Ex086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par = 0;
        int[] numeros = new int[10];
        for (int cont = 0; cont <= 9; cont++) {
            System.out.println("Númeno " + (cont + 1) + ": ");
            numeros[cont] = sc.nextInt();

            }
        Arrays.sort(numeros);
        System.out.println("Em crescente ficará:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
