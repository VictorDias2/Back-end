package comandoscondicionais;
import java.util.Scanner;

public class Cargo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cargo;
        String menasagem;
        float salario;
        System.out.println("1 = Programador estagiário");
        System.out.println("2 = Programador Junior");
        System.out.println("3 = Programador Pleno");
        System.out.println("4 = Programador Seniôr");
        System.out.println("5 = Programador Master");


        System.out.println("Digite o número do seu cargo: ");
        cargo = entrada.nextInt();

        switch (cargo) {
            case 1: salario = (float) 1400;
                menasagem = "de R$1.400,00 com aumento de 10% (Programador estagiário) você passará a ganhar + R$" + salario/10 + " sendo um salário total de R$" + salario + 1400;
            break;

            case 2: salario = (float) 3000;
                menasagem = "de R$3.000,00 com aumento de 12% (Programador Junior) você passará a ganhar + R$" + salario/12 + " sendo um salário total de R$" + salario + 3000;
            break;

            case 3: salario = (float) 5500;
                menasagem = "de R$5.500,00 com aumento de 13% (Programador Pleno) você passará a ganhar + R$" + salario/13 + " sendo um salário total de R$" + salario + 5500;
            break;

            case 4: salario = (float) 8000;
                menasagem = "de R$8.000,00 com aumento de 15% (Programador Seniôr) você passará a ganhar + R$" + salario/15 + " sendo um salário total de R$" + salario + 8000;
            break;

            case 5: salario = (float) 12000;
                menasagem = "de R$12.000,00 com aumento de 18% (Programador Master) você passará a ganhar + R$" + salario/18 + " sendo um salário total de R$" + salario + 12000;
            break;
            default: menasagem = "Cargo inexistente!";
        }
        System.out.println(menasagem);
    }
}
