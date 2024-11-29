//12) Crie um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC).
package exerciciosjava;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é seu Peso? Kg");
        float peso = sc.nextFloat();
        System.out.println("Sua altura: m");
        float altura = sc.nextFloat();

        float imc = (altura*altura)/peso;

        System.out.println("Seu IMC é de " + imc);
    }
}
