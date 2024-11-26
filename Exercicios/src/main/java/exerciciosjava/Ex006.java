//6) Crie um programa que leia um número inteiro e exiba se ele é par ou ímpar.
package exerciciosjava;
import java.util.*;

public class Ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = entrada.nextInt();

        if(n%2==0){
            System.out.println(n + " é um número par");
        }
        else{
            System.out.println(n + " é um número ímpar");
        }
    }
}
