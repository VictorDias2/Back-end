//42) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "while".
package exerciciosjava;
import java.util.*;

public class Ex042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exiba um número para verificar se ele é primo: ");
        int n = sc.nextInt();

        int c = n-1;
        while(c != 1) {
            if(n % c == 0){
                System.out.println(n + " não é um número primo, pois é divísivel por " + c);
                break;
            }
            c--;
        }
        if(c == 1){
            System.out.println(n + " é um número primo");
        }
    }
}
