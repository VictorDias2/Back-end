//53) Crie um programa que exiba os números pares de 1 a 50 usando o loop "do-while".
package exerciciosjava;
import java.util.*;

public class Ex053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 2;
        do{
            System.out.println(c);
            c+=2;
        } while(c<=50);
    }

}
