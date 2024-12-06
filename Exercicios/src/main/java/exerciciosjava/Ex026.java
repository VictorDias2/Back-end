//26) Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor total a ser pago. Considere que cada produto tem um preço diferente.
package exerciciosjava;
import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - R$5");
        System.out.println("2 - R$7");
        System.out.println("3 - R$10");
        System.out.println("4 - R$12");

        System.out.print("Qual código você comprou? ");
        int codigo = sc.nextInt();

        System.out.print("Quantos comprou? ");
        int quantidade = sc.nextInt();

        int preco = 0;
        switch (codigo) {
            case 1:
                preco = 5;
                break;
            case 2:
                preco = 7;
                break;
            case 3:
                preco = 10;
                break;
            case 4:
                preco = 12;
                break;

            default:
                System.out.println("Não existe esse, digite outro!");
                return;
        }

        float total = preco * quantidade;

        System.out.println("Valor total a ser pago: R$" + total);



    }
}
