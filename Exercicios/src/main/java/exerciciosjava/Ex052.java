//52) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "do-while".
package exerciciosjava;
import java.util.*;

public class Ex052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 1;
        do{
            System.out.println(c + " + " + c + " = " + (c+c));
            c++;
        } while(c <= 100);
    }
}
