//85) Escreva um programa que leia 5 números inteiros e exiba o maior e o menor valor digitado.
package exerciciosjava;
import java.util.*;

public class Ex085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = 0;
        int maior = 0;
        int[] array = new int[5];
        for (int cont = 0; cont <= 4; cont++) {
            System.out.println("Número " + (cont + 1) + ": ");
            array[cont] = sc.nextInt();

            if (cont == 0) {
                menor = array[0];
                maior = array[0];
            }
            else{
                if (maior < array[cont]) {
                    maior = array[cont];
                }
                if (menor > array[cont]) {
                    menor = array[cont];
                }
            }
        }
        System.out.println("O maior valor digitado foi o " + maior);
        System.out.println("O menor valor digitado foi o " + menor);
    }
}
