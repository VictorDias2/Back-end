//95) Crie um programa que leia 5 nomes e exiba-os em ordem alfabética.
package exerciciosjava;
import java.util.*;

public class Ex095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        for (int contador = 0; contador < 5; contador++) {
            System.out.println((contador + 1) + "º Nome: ");
            nomes[contador] = sc.nextLine();
        }

            Arrays.sort(nomes);

            System.out.println("Os nomes em ordem alfabética são:");
            for (String nome : nomes) {
                System.out.println(nome);

        }

    }
}
