//76) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido.
package exerciciosjava;
import java.util.*;

public class Ex076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int n = sc.nextInt();

        for(int c = 2; c<=n; c+=2) {
            System.out.println(c + " + " + c + " = " + (c+c));
        }
    }
}
