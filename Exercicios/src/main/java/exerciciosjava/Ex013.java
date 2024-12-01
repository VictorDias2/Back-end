//13) Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo.
package exerciciosjava;
import java.util.*;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Outro número: ");
        int n2 = sc.nextInt();

        if (n1%n2==0){
            System.out.println("O primeiro é multiplo do segundo");
        }
        else{
            System.out.println("O primeiro não é multiplo do segundo");
        }
    }
}
