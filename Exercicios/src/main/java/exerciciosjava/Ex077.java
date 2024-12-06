//77) Crie um programa que exiba os números ímpares de 50 a 1.
package exerciciosjava;
import java.util.*;

public class Ex077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int c = 49; c>=1; c-=2) {
            System.out.println(c);
        }
    }
}
