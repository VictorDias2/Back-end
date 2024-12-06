//55) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "do-while".
package exerciciosjava;
import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int n = sc.nextInt();

        int c = 0;
        do{
            System.out.println(n + " x " + c + " = " + (n*c));
            c++;
        } while(c<=10);
    }
}
