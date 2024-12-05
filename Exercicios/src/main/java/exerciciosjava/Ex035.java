//35) Escreva um programa que leia três números inteiros e exiba a média aritmética.
// Se a média for maior ou igual a 7, exiba a mensagem "Aprovado", caso contrário, exiba a mensagem "Reprovado".
package exerciciosjava;
import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Exiba a primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.println("Exiba a segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.println("A terceira: ");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        if(media>=7){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }

    }
}
