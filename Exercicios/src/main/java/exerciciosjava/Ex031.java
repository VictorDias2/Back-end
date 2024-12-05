//31) Faça um programa que leia o valor do salário-mínimo e o salário de um funcionário, e exiba quantos salários-mínimos ele recebe.
package exerciciosjava;
import java.util.*;

public class Ex031 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o salário mínimo? R$");
        float min = sc.nextFloat();

        System.out.println("Qual é o seu salário? R$");
        float func = sc.nextFloat();

        float resposta = func/min;

        if (resposta >=2){
            System.out.println("Você recebe " + func/min + " sálarios mínimos");
        }
        else{
            System.out.println("Você recebe " + func/min + " sálario mínimo");
        }
    }
}
