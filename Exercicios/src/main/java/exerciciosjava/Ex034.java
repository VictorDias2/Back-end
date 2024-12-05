//34) Faça um programa que leia a idade de uma pessoa e exiba se ela pode ou não votar.
// O voto é obrigatório para pessoas entre 18 e 70 anos, e facultativo para pessoas entre 16 e 18 anos e com mais de 70 anos.
package exerciciosjava;
import java.util.Scanner;

public class Ex034 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Qual a sua idade: ");
            int idade = sc.nextInt();

            if (idade >=70 || idade >=16 && idade <=18){
                System.out.println("Seu voto é opcional");
            }
            else{
                System.out.println("Seu voto é obrigatório");
            }

        }
    }
