//3) Crie um programa que leia a base e a altura de um triângulo e calcule sua área.
package exerciciosjava;
import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Base do triângulo:");
        float base = entrada.nextFloat();
        System.out.println("A Altura:");
        float altura = entrada.nextFloat();

        float area = (base*altura)/2;

        System.out.println("A área do triangulo é = " + area);
    }
}
