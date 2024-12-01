//14) Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias de vida ela tem.
package exerciciosjava;
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos de vida você tem? ");
        int anos = sc.nextInt();
        System.out.println("Quantos meses? ");
        int meses = sc.nextInt();
        System.out.println("E quantos dias? ");
        int dias = sc.nextInt();

        anos *= 365;
        meses *= 30;
        dias += anos;
        dias += meses;

        System.out.println("Você já viveu " + dias + " dias");
    }
}
