//44) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "while" e exiba a média das idades.
package exerciciosjava;
import java.util.*;

public class Ex044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        int media = 0;
        while(c <= 5){
            System.out.println(c + "º idade: ");
            int idade = sc.nextInt();
            media += idade;
            c++;
        }
        media /= 5;
        System.out.println("Média: " + media);
    }
}
