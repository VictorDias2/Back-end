//11) Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.
package exerciciosjava;
import java.util.*;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota:");
        float n1 = sc.nextFloat();
        System.out.println("Insira a segunda nota:");
        float n2 = sc.nextFloat();
        System.out.println("Insira a terceira nota:");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;
        System.out.println("Media de: " + n1 + ", " + n2 + ", " + n3 + " = " + media);
    }
}
