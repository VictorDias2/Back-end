//90)Faça um programa que leia 5 números inteiros e verifique se algum deles é igual a zero.
package exerciciosjava;
import java.util.*;

public class Ex090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zero = 0;
        int[] num = new int[5];
        for (int contador = 0; contador <= 4; contador++) {
            System.out.println("Número " + (contador + 1) + ": ");
            num[contador] = sc.nextInt();
            if (num[contador] == 0) {
                zero++;
            }
        }
            if (zero > 0) {
                System.out.println("Existem " + zero + " número(s) zero(s)");
        }
            else{
                System.out.println("Não existem número zeros");
            }
    }
}
