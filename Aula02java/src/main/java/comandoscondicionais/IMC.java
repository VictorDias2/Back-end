package comandoscondicionais;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu IMC: ");
        float imc = entrada.nextFloat();

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }
        else if(imc <= 24.9){
            System.out.println("Peso ideal");
        }
        else if(imc <= 29.9){
            System.out.println("Um pouco acima do peso");
        }
        else if(imc <= 34.9){
            System.out.println("Obesidade Grau I");
        }
        else if(imc <= 39.9){
            System.out.println("Obesidade Grau II (severa");
        }
        else{
            System.out.println("Obesidade Grau III (mórbida");
        }
    }
}
