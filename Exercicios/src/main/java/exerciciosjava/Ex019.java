//19) Faça um programa que receba três notas de um aluno e exiba se ele foi aprovado ou reprovado. A média para aprovação é 7.
package exerciciosjava;
import java.util.*;

public class Ex019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com a primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.println("Entre com a segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.println("Entre com a terceira nota: ");
        int nota3 = sc.nextInt();

        float soma = nota1 + nota2 + nota3;

        System.out.println("Dado as notas: " + nota1 + ", " + nota2 + ", " + nota3 + ". ");
        System.out.println("A média é = " + soma/3);

        if(soma/3 >=7){
            System.out.println("Aluno aprovado!");
        }
        else {
            System.out.println("Aluno reprovado!");
        }
    }
}
