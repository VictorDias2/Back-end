//59) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "do-while" e exiba a média das idades.
package exerciciosjava;
import java.util.*;

public class Ex059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 1;
        float  media = 0;
        do {
            System.out.println("Idade da " + c + "ª pessoa: ");
            int idade = sc.nextInt();
            media += idade;

            c++;
        } while (c <= 5);
        media /= 5;
        System.out.println("Media: " + media);
    }
}
