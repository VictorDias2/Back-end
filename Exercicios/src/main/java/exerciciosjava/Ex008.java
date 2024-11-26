//8) Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja,
// o primeiro deve ficar com o valor do segundo e vice-versa.
package exerciciosjava;
import java.util.*;

public class Ex008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor1 = entrada.nextInt();
        System.out.println("Outro valor:");
        int valor2 = entrada.nextInt();
        int valor3 = valor1;
        valor2 = valor3;
        valor1 = valor2;
        System.out.println("O primeiro valor digitado foi o " + valor2 + " e o segundo: " + valor1);
    }
}
