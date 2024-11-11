package comandoscondicionais;
import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um valor: ");
        int v1 = entrada.nextInt();
        System.out.println("Escolha outro valor: ");
        int v2 = entrada.nextInt();
        System.out.println("Escolha mais um valor:");
        int v3 = entrada.nextInt();

        if (v1 > v2 && v1 > v3){
            System.out.println(v1 + ", o primeiro valor é o maior deles");
        } else if (v2 > v1 && v2 > v3) {
            System.out.println(v2 + ", o segundo valor é o maior deles");
        }
        else if (v3 > v1 && v3 > v2){
            System.out.println(v3 + ", o terceiro valor é o maior deles");
        }
        else if(v1 == v2 && v1 == v3){
            System.out.println("Você digitou números iguais");
        }
        else {
            System.out.println("Por favor, tente não repetir os números");
        }
    }
}
