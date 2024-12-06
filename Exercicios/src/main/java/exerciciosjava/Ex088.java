//88) Escreva um programa que leia 5 números inteiros e calcule a média dos valores pares e a média dos valores ímpares.
package exerciciosjava;
import java.lang.reflect.Array;
import java.util.*;

public class Ex088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pares = new int[5];
        int qtdPar = 0;
        int[] impares = new int[5];
        int qtdImp = 0;

        int[] num = new int[5];

        for (int contador = 0; contador <= 4; contador++) {
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

        System.out.println("Média: " + somaPar/qtdPar + " dos números pares");
        System.out.println("Média: " + somaImpar/qtdImp + " dos números ímpares");

    } //UAUU
}
