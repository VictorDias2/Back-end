// 7) Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido,
// considerando que o funcionário recebe 5% de comissão sobre o salário base.
package exerciciosjava;
import java.util.*;

public class Ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu salário: R$");
        float salario = entrada.nextFloat();

        float total = (salario*0.05f)+salario;
        System.out.println("Seu salário líquido é de **R$" + total +"**");

    }
}
