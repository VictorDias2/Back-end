//49) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "while".
package exerciciosjava;
import java.util.*;

public class Ex049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número: ");
        int n = sc.nextInt();
        int num = n;
        int c = 1;

        while (n >= 1) {
            n--;
            c += n*c;
        }
        System.out.println("O fatorial de " + num + " é = " + c);
    }
}
