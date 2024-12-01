//20) Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
package exerciciosjava;
import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}
