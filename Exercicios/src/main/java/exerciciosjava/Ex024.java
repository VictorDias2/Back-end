//24) Crie um programa que leia três números inteiros e exiba-os em ordem crescente.
package exerciciosjava;
import java.util.*;

public class    Ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite mais um número: ");
        int n3 = sc.nextInt();

        int[] numeros = {n1, n2, n3};
        Arrays.sort(numeros);


        System.out.println("Em crescente ficará:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
