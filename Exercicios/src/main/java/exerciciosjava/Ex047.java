//47) Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "while".
package exerciciosjava;
import java.util.*;

public class Ex047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 1;
        while(c <=50){
            System.out.println(c);
            c += 2;
        }
    }
}
