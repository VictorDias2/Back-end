package comandoscondicionais;
import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
}
