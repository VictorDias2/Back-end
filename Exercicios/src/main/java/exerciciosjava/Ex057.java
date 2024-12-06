//57) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "do-while".
package exerciciosjava;
import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Exiba um número para verificar se ele é primo: ");
        int n = ent.nextInt();

        int c = n-1;
        do {
            if(n % c == 0){
                System.out.println(n + " não é um número primo, pois é divísivel por " + c);
                break;
            }
            c--;
        } while(c != 1);
        if(c == 1){
            System.out.println(n + " é um número primo");
        }
    }
}
