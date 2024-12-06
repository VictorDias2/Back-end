//61) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido usando o loop "do-while".
package exerciciosjava;
import java.util.*;

public class Ex061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int max = sc.nextInt();

        int c = 1;
        do {
            System.out.println(c + " + " + c + " = " + (c+c));
            c++;
        } while (c <= max);
    }
}
