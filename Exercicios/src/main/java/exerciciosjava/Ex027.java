//27) Crie um programa que leia a idade de uma pessoa e seu sexo (M ou F) e exiba uma mensagem indicando se ela pode ou não se aposentar.
// Homens podem se aposentar com 65 anos ou mais, e mulheres com 60 anos ou mais.
package exerciciosjava;
import java.util.Locale;
import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é sua idade? ");
        int idade = sc.nextInt();
        System.out.println("Qual é seu sexo? (M ou F)");
        String sexo = sc.next();
        sexo = sexo.toUpperCase();
        if(sexo.equals("M") && idade >= 65 || sexo.equals("F") && idade >= 60){
            System.out.println("Você pode se aposentar");
        } else  {
            System.out.println("Você não pode se aposentar");
        }
    }
}
