//39) Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética dos valores lidos.
package exerciciosjava;
import java.util.*;

public class Ex039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 1;
        float soma = 0;
        while(c <= 5){
            System.out.println("Número " + c + ": ");
            float n = sc.nextFloat();
            soma += n;
            c++;
        }
        soma /= 5;
        System.out.println("Média: " + soma);
    }
}
