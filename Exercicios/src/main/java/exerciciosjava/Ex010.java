//10) Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.
package exerciciosjava;
import java.util.*;

public class Ex010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um número inteiro: ");
        int num = entrada.nextInt();

        for (int c=0; c<=10; c++){
            System.out.println(num + " x " + c + " = " + c*num);
        }
    }
}
