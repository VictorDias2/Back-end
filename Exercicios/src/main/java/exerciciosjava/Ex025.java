//25) Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua situação.
// Se o número de faltas for maior que 15, ele é reprovado por falta.
package exerciciosjava;
import java.util.*;

public class Ex025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas faltas o aluno possui em Matemática? ");
        int mat = sc.nextInt();
        System.out.println("Quantas faltas têm em Português? ");
        int por = sc.nextInt();
        System.out.println("Quantas faltas em Geografia: ");
        int geo = sc.nextInt();
        System.out.println("Em História: ");
        int his = sc.nextInt();
        System.out.println("Ciências: ");
        int cie = sc.nextInt();

        int faltas = mat+por+geo+his+cie;
        if(faltas >= 15){
            System.out.println("Alunos REPROVADO com sucesso! Com " + faltas + " faltas");
        }
        else {
            System.out.println("O aluno possui " + faltas + " faltas. Aluno Aprovado");
        }

    }
}
