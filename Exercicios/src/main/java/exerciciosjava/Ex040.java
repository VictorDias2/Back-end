//40) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "while".
package exerciciosjava;
import java.util.*;

public class Ex040 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual número deseja exibir a tabuada? ");
        int tabu = sc.nextInt();
        int c = 1;
        while(c <= 10){
            System.out.println( tabu + " x " + c + " = " + tabu*c);
            c++;
        }
    }
}
