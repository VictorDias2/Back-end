//71) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número.
package exerciciosjava;
import java.util.*;

public class Ex071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exiba um número: ");
        int n = sc.nextInt();


        for(int c = n; c != 0; c--) {
            if (n % c == 0) {
                System.out.println(n + " é divisivel por " + c);
            }
        };
    }
}
