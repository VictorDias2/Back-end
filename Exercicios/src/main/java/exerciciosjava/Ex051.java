//  ESTRUTURAS DE REPETIÇÃO “DO WHILE”:
//51) Faça um programa que exiba os números de 1 a 10 usando o loop "do-while".
package exerciciosjava;
import java.util.Scanner;

public class Ex051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 1;
        do{
            System.out.println(c);
            c++;
        } while(c<=10);
    }
}
