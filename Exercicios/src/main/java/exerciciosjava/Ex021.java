//21) Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade e quantas são maiores de idade.
package exerciciosjava;
import java.util.*;

public class Ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        for(int c=1; c<=5; c++){
            System.out.println("Digite a idade da " + c + " ª pessoa: ");
            int idade = sc.nextInt();
            if(idade >= 18){
                maior++;
            }
            else{
                menor++;
            }
        }
        System.out.println("Existem " + menor + " pessoas menores de idades.");
        System.out.println("Existem " + maior + " pessoas maiores de idades.");
    }
}
