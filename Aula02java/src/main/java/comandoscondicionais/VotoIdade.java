package comandoscondicionais;
import java.util.Scanner;

public class VotoIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade: ");
        int idade = entrada.nextInt();

        if (idade <=15){
            System.out.println("Não pode votar");
        }
        else if (idade <=18 || idade >=70){
            System.out.println("Seu voto é opcional");
        }
        else {
            System.out.println("Seu voto é obrigatório");
        }

    }
}
