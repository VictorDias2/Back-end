//5) Escreva um programa que leia o preço de um produto e a quantidade comprada,
// e calcule o valor total a ser pago com desconto de 10% se a quantidade for maior que 10 unidades.
package exerciciosjava;
import java.util.*;

public class Ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual foi o preço do produto? R$");
        float preco = entrada.nextFloat();
        System.out.println("Quantas comprou?");
        int qtde = entrada.nextInt();

        float total = preco * qtde;

        if(qtde > 10){
            float desc = total*0.90f;
            System.out.println("O preço total a pagar é de R$" + desc);
        }
        else{
            System.out.println("O preço total a pagar é de R$" + total);
        }
    }
}

