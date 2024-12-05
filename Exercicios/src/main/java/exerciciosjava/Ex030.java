//30) Crie um programa que leia o número de maçãs compradas e exiba o valor total a ser pago.
// O preço das maçãs é de R$ 0,50 cada se a quantidade for menor que 12 e R$ 0,40 cada se a quantidade for igual ou maior que 12.
package exerciciosjava;
import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas maças foram compradas? ");
        int maca = sc.nextInt();

        if (maca >11){
           float preco = maca * 0.4f;
            System.out.println("O total a pagar é de R$" + preco);
        }
        else{
            float preco = maca *0.5f;
            System.out.println("O total a pagar é de R$" + preco);
        }
    }
}
