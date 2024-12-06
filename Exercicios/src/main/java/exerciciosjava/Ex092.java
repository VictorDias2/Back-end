//92) Crie um programa que leia 5 números inteiros e exiba-os em ordem decrescente.
package exerciciosjava;
import java.util.*;

public class Ex092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par = 0;
        int[] numeros = new int[5];
        for (int cont = 0; cont <= 4; cont++) {
            System.out.println("Númeno " + (cont + 1) + ": ");
            numeros[cont] = sc.nextInt();

        }
        Arrays.sort(numeros);
        System.out.println("Em descrescente ficará:");
        for (int num = 4; num >= 0; num--) {
            System.out.println(numeros[num]);
        }
    }
}
