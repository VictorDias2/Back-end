//56) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "do-while".
package exerciciosjava;
import java.util.*;

public class Ex056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exiba um número: ");
        int n = sc.nextInt();

        int c = n;
        do {
            if (n % c == 0) {
                System.out.println(n + " é divisivel por " + c);
            }
            c--;
        } while (c != 0);
    }
}
