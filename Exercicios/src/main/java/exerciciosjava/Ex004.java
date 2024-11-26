//4) Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a média ponderada considerando pesos 2, 3 e 5 para as notas, respectivamente.
package exerciciosjava;
import java.util.*;

public class Ex004 {
    public static void main(String[] args) {
        Scanner entradad = new Scanner(System.in);

        System.out.println("Descreva a primeira nota do aluno:");
        int nota1 = entradad.nextInt();
        System.out.println("Descreva a segunda nota do aluno:");
        int nota2 = entradad.nextInt();
        System.out.println("Descreva a terceira nota do aluno:");
        int nota3 = entradad.nextInt();

        float soma = nota1 + nota2 + nota3;
        float media = soma / 3;
        System.out.println("A média das notas: " + nota1 + ", " + nota2 + ", " + nota3 + " é = " + media);

    }
}
