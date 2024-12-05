//29) Escreva um programa que leia o nome e a nota de um aluno e exiba sua situação na disciplina.
// Se a nota for maior ou igual a 7, o aluno está aprovado. Caso contrário, está em recuperação.
package exerciciosjava;
import java.util.*;

public class Ex029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do aluno? ");
        String nome = sc.nextLine();
        System.out.println("Qual a nota de " + nome + "? ");
        float nota = sc.nextFloat();
        if (nota >= 7) {
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Reprovado!");
        }

    }
}
