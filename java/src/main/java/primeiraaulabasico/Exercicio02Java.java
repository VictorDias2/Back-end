package primeiraaulabasico;
import java.util.Scanner;


public class Exercicio02Java {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("entre com a primeira nota: ");
        int nota1 = entrada.nextInt();
        System.out.println("Entre com a segunda nota: ");
        int nota2 = entrada.nextInt();
        System.out.println("Entre com a terceira nota: ");
        int nota3 = entrada.nextInt();
        System.out.println("Entre com a quarta nota: ");
        int nota4 = entrada.nextInt();

        float soma = nota1 + nota2 + nota3 + nota4;

        System.out.println("Dado as notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + ".");
        System.out.println("A soma dos dois número é = " + soma/4);

    }

}
