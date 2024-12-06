//64) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "do-while".
package exerciciosjava;
import java.util.*;

public class Ex064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número: ");
        int n = sc.nextInt();
        int num = n;
        int c = 1;

        do {
            n--;
            c += n*c;
        } while(n >= 1);
        System.out.println("O fatorial de " + num + " é = " + c);
    }
}
