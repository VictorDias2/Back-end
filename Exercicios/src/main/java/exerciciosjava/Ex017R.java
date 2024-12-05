//17) Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem indicando se ela é criança, adolescente, adulto ou idoso.
package exerciciosjava;
import java.util.Scanner;

public class Ex017R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();

        if(idade <=14){
            System.out.println("Criança");
        } else if (idade <= 24) {
            System.out.println("Adolescente");
        } else if (idade <= 50) {
            System.out.println("Adulto");
        } else{
            System.out.println("Idoso");
        }

    }
}
