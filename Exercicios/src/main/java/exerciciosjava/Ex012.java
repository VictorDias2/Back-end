//12) Crie um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC).
package exerciciosjava;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é seu Peso? Kg");
        float peso = sc.nextFloat();
        System.out.println("Sua altura: cm");
        float altura = sc.nextFloat();

        altura = altura/100; //convertendo para metros
        float imc = peso / (altura * altura);

        System.out.println("Seu IMC é de " + imc);

                if(imc <= 18.5){
                    System.out.println("Abaixo do peso");
                }
                else if(imc <= 24.9){
                    System.out.println("Peso ideal");
                }
                else if(imc <= 29.9){
                    System.out.println("Um pouco acima do peso");
                }
                else if(imc <= 34.9){
                    System.out.println("Obesidade Grau I");
                }
                else if(imc <= 39.9){
                    System.out.println("Obesidade Grau II (severa");
                }
                else{
                    System.out.println("Obesidade Grau III (mórbida");
                }
            }
        }
