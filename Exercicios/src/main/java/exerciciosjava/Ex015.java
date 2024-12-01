//15) Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.
package exerciciosjava;
import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você recebe? R$");
        float salario = sc.nextFloat();

        salario += salario*0.15f;
        System.out.println("Com aumento de 15% você passará a receber R$" + salario);
    }
}
