//16) Faça um programa que verifique se um número é positivo, negativo ou zero.
package exerciciosjava;
import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (n>0){
            System.out.println("O número é maior que 0");
        } else if (n<0) {
            System.out.println("O número é menor que 0");
        }
        else{
            System.out.println("O número é 0");
        }
    }
}
