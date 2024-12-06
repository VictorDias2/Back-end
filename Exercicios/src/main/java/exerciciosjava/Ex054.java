//54) Faça um programa que leia 5 números inteiros usando o loop "do-while" e exiba a média aritmética dos valores lidos.
package exerciciosjava;
import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 1;
        float media = 0;
        do{
            System.out.println("Número: ");
            int n = sc.nextInt();
            media += n;
            c++;
        } while(c <= 5);
        media /= 5;
        System.out.println("Media: " + media);
    }
}
