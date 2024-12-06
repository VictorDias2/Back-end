//46) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido usando o loop "while".
package exerciciosjava;
import java.util.*;

public class Ex046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        int c = 2;
        while(c <= n){
            System.out.println(c + " + " + c + " = " + (c + c));
            c+=2;
        }
    }
}
