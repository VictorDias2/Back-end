package comandoscondicionais;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Outro número:");
        int num2 = entrada.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro número digitado (" + num1 + ") é maior que o segundo");
        } else if (num1 == num2) {
            System.out.println("Você digitou número idênticos!");
        } else{
            System.out.println("O segundo número digitado (" + num2 + ") é maior que o primeiro");
        }
    }
}
