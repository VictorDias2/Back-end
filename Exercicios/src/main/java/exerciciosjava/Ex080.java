//80) Crie um programa que leia o nome e a idade de várias pessoas até que o nome "fim" seja informado. Ao final, exiba a média das idades.
package exerciciosjava;
import java.util.*;

public class Ex080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int media = 0;
        int c = 0;
        while(true) {
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
        }

        media /= c;
        System.out.println("Media: " + media);
    }
}
