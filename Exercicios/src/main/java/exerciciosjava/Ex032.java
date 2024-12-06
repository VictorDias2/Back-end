//32) Escreva um programa que leia a nota de um aluno em uma prova e exiba a sua conceituação conforme a tabela de notas.
package exerciciosjava;
import java.util.*;

public class Ex032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Exiba a primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.println("Exiba a segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.println("A terceira: ");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        if(media >= 7 && media <= 10){
            System.out.println("Aprovado!");
        } else if (media >= 5 && media <= 10) {
            System.out.println("Recuperação");
        } else if (media >= 0 && media <= 10) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Nota inexistente!");
        }

    }
}
