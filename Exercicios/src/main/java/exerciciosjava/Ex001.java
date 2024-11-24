//1) Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.
package exerciciosjava;
import java.util.*;

public class Ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int num = entrada.nextInt();

        System.out.println("Outro número: ");
        int num2 = entrada.nextInt();

        int soma = num + num2;
        int subtracao = num - num2;
        int multiplicacao = num * num2;
        int divisao = num / num2;


        System.out.println(num + " + " + num2 + " = " + soma);
        System.out.println(num + " - " + num2 + " = " + subtracao);
        System.out.println(num + " x " + num2 + " = " + multiplicacao);
        System.out.println(num + " ÷ " + num2 + " = " + divisao);

    }
}
