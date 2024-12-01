//22) Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus.
// Se o salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.
package exerciciosjava;
import java.util.*;

public class Ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você ganha? R$");
        float salario = sc.nextFloat();

        if (salario >= 2000) {
            salario += salario*0.10f;
            System.out.println("Ao receber mais R$2000. Passará a receber R$" + salario);
        }
        else{
            salario += salario*0.05f;
            System.out.println("Você recebendo menos de R$2000. Passará a receber R$" + salario);
        }
    }
}
