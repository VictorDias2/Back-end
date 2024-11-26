//2) Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro.
package exerciciosjava;
import java.util.*;

public class Ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a raio do círculo?");
        float raio = entrada.nextFloat();

        float area = 3.14f * (raio*raio);
        float perimetro = 2 * 3.14f * raio;

        System.out.println("Sendo Raio igual a " + raio + " e dado 3,14 ao π. Então...");
        System.out.println("A Área = " + area);
        System.out.println("o Perímetro = " + perimetro);
    }
}
