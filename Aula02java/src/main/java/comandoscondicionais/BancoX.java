package comandoscondicionais;
import java.util.Scanner;

public class BancoX {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont = 1;
        float media = 0;
        while (cont <=6) {
            System.out.println("Digite o sálario do " + cont + "º mês: R$");
            float salario = entrada.nextFloat();
            media += salario;
            cont++;
        }
        media = media/6;
        System.out.println("Com salário médio de R$" + media); //queria saber como limitar o float, media %.2f?
        if(media <= 500){
            System.out.println("Você não terá nenhum crédito");
        } else if (media <= 1000) {
            media *= 0.3f;
            System.out.println("Você terá um percentual de 30%");
        } else if (media <=3000) {
            media *= 0.4f;
            System.out.println("Você terá um percentual de 40%");
        } else {
            media *= 0.5f;
            System.out.println("Você terá um percentual de 50%:");
        }

        System.out.println("Sendo ele = R$" + media);
    }
}
