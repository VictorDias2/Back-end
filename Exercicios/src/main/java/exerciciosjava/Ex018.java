//18) Crie um programa que leia dois números inteiros e exiba o maior deles.
package exerciciosjava;
import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Outro número: ");
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println("O primeiro número digitado (" + n1 + ") é maior que o segundo");
        }
        else if (n2 > n1){
            System.out.println("O segundo número digitado (" + n2 + ") é maior que o primeiro");
        }
        else{
            System.out.println("Os dois números são iguais");
        }
    }
}
