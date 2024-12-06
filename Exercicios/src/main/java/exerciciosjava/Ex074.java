//74) Crie um programa que leia o nome e a idade de 5 pessoas e exiba a média das idades.
package exerciciosjava;
import java.util.*;

public class Ex074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float media = 0;
        for(int c = 1; c<=5; c++) {
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            media += idade;
        }
        media /= 5;
        System.out.println("Media: " + media);
    }
}
