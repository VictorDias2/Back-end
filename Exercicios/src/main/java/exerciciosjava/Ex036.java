//  ESTRUTURAS DE REPETIÇÃO WHILE:
//36) Faça um programa que exiba os números de 1 a 10 usando o loop "while".
package exerciciosjava;
import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int c = 1;
        while(c <= 10){
            System.out.println(c);
            c++;
        }
    }
}
