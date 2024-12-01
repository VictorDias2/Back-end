//23) Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui. Considere apenas meses válidos.
package exerciciosjava;
import java.util.*;

public class Ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String m;
        String mensagem;

        System.out.println("Escreva um mês: ");
        m = sc.nextLine();
        m = m.toLowerCase();

        switch (m) {
            case "janeiro": mensagem = "Janeiro tem 31 dias ";
                break;
            case "fevereiro": mensagem = "Fevereiro tem 28 dias (Nos anos bissextos têm 29)!";
                break;
            case "março": mensagem = "Março tem 31 dias!";
                break;
            case "abril": mensagem = "Abril tem 30 dias";
            break;
            case "maio": mensagem = "Maio tem 31 dias";
            break;
            case "junho": mensagem = "Junho tem 30 dias";
            break;
            case "julho": mensagem = "Julho tem 31 dias";
            break;
            case "agosto": mensagem = "Agosto tem 31 dias";
            break;
            case "setembro": mensagem = "Setembro tem 30 dias";
            break;
            case "outubro": mensagem = "Outubro tem 31 dias";
            break;
            case "novembro": mensagem = "Novembro tem 30 dias";
            break;
            case "dezembro": mensagem = "Dezembro tem 31 dias";
            break;

            default:
                mensagem = "Mês inválido!";
        }
        System.out.println(mensagem);
    }
}
