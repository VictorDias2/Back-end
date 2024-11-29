//9) Crie um programa que leia o valor do depósito mensal em uma poupança e a taxa de juros mensal,
// e calcule o montante após 12 meses.
package exerciciosjava;
import java.util.*;

public class Ex009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor que irá depositar nos próximos 12 meses, sendo a taxa de juros de 0,5%: R$");
        float depositado = entrada.nextFloat();
        float total = 0;

        for (int c = 0; c <= 12; c++) {
            if(c == 0){
                total += depositado + (depositado * 0.05f);
            }
            else {
                total += depositado * 0.05f;
            }
        }

        System.out.println("....O valor daqui 12 meses com o juros de 0,5%, será de R$" + total);
    }
}