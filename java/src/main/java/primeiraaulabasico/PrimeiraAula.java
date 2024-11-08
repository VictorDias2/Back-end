package primeiraaulabasico;
import java.util.Scanner;


public class PrimeiraAula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //entrada de dados EX: teclado

        System.out.println("entre com o primeiro number: ");
        int numero1 = entrada.nextInt();

        System.out.println("Entre com o segundo number: ");
        int numero2 = entrada.nextInt();


        int soma = numero1 + numero2;

        System.out.println("O valor do número é = " + numero1);
        System.out.println("O valor do 2º número é = " + numero2);
        System.out.println("A soma dos dois número é = " + soma);

    }

}
