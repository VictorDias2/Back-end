//91) Escreva um programa que leia 10 números inteiros e exiba a soma dos valores positivos e a soma dos valores negativos.
package exerciciosjava;
import java.util.*;

public class Ex091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pares = new int[10];
        int qtdPar = 0;
        int[] impares = new int[10];
        int qtdImp = 0;

        int[] num = new int[10];

        for (int contador = 0; contador <= 9; contador++) {
            System.out.println("Número " + (contador + 1) + ": ");
            num[contador] = sc.nextInt();

            if (num[contador] % 2 == 0) {
                pares[qtdPar] = num[contador];
                qtdPar++;
            }
            else{
                impares[qtdImp] = num[contador];
                qtdImp++;
            }
        }

        int somaPar = 0;
        for (int n = 0; n < qtdPar; n++) {
            somaPar += pares[n];

        }

        int somaImpar = 0;
        for (int n = 0; n < qtdImp; n++) {
            somaImpar += impares[n];
        }

        System.out.println("Soma é = " + somaPar + " dos números pares");
        System.out.println("Soma é = " + somaImpar + " dos números ímpares");
    }
}
