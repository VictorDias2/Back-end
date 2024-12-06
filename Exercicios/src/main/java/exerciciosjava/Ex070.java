//70) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor.
package exerciciosjava;
import java.util.*;

public class Ex070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para exibir sua tabuada: ");
        int tab = sc.nextInt();
        for(int c = 1; c<=10; c++) {
            System.out.println(c + " x " + tab + " = " + tab * c);
        }
    }
}
