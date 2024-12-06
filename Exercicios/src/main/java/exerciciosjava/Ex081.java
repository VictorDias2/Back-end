//  VETORES:
//81) Faça um programa que leia 5 números inteiros e exiba-os na ordem inversa em que foram digitados.
package exerciciosjava;
import java.util.*;

public class Ex081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite mais um número: ");
        int n3 = sc.nextInt();
        System.out.println("Digita outro nímero: ");
        int n4 = sc.nextInt();
        System.out.println("O último: ");
        int n5 = sc.nextInt();

        int[] numeros = {n5, n4, n3, n2, n1};

        System.out.println("Ficará:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
