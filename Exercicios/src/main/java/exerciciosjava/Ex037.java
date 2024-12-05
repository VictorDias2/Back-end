//37) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while".
package exerciciosjava;
import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int c = 1;
        while(c <= 100){
            System.out.println(c + " + " + c + " = " + (c + c));
            c++;
        }
    }
}
