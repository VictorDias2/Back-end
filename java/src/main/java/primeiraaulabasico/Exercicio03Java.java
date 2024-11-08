package primeiraaulabasico;
import java.util.Scanner;

public class Exercicio03Java {
    //tabuada:
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Veja a tabuada de algum número: ");
        int tabuada = entrada.nextInt();

        System.out.println(tabuada + " x " + 1 + " = " + tabuada);
        System.out.println(tabuada + " x " + 2 + " = " + 2*tabuada);
        System.out.println(tabuada + " x " + 3 + " = " + 3*tabuada);
        System.out.println(tabuada + " x " + 4 + " = " + 4*tabuada);
        System.out.println(tabuada + " x " + 5 + " = " + 5*tabuada);
        System.out.println(tabuada + " x " + 6 + " = " + 6*tabuada);
        System.out.println(tabuada + " x " + 7 + " = " + 7*tabuada);
        System.out.println(tabuada + " x " + 8 + " = " + 8*tabuada);
        System.out.println(tabuada + " x " + 9 + " = " + 9*tabuada);
        System.out.println(tabuada + " x " + 10 + " = " + 10*tabuada);
    }
}
