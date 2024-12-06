//65) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "do-while" até que o nome "fim" seja informado. Ao final, exiba a média das idades.
package exerciciosjava;
import java.util.*;

public class Ex065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int media = 0;
        int c = 0;
        do {
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            nome = nome.toLowerCase();
            if(nome.equals("fim")) {
                break;
            }

            System.out.println("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            media += idade;
            c++;
        } while (true);

        media /= c;
        System.out.println("Media: " + media);
    }
}
