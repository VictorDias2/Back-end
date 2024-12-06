//72) Faça um programa que leia um número inteiro e exiba se ele é um número primo.
package exerciciosjava;
import java.util.*;

public class Ex072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner ent = new Scanner(System.in);
        System.out.println("Exiba um número para verificar se ele é primo: ");
        int n = ent.nextInt();

        int c = n;
        for (c = n-1;c != 1;c--){
            if(n % c == 0){
                System.out.println(n + " não é um número primo, pois é divísivel por " + c);
                break;
            }
        }
        if(c == 1){
            System.out.println(n + " é um número primo");
        }
    }
}
