package comandoscondicionais;
import java.util.Scanner;

public class ComboBK {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int combo;
        String mensagem;

        System.out.println("Qual o combo que quer pedir?");
        combo = entrada.nextInt();

        switch (combo) {
            case 1: mensagem = "costelinha pombo branco da paz acompanhado de um belissímo Rato (vivo ou morto, opcional)";
            break;
            case 2: mensagem = "batata frita (vencida à 2 anos), com caldo de capivara do sul e um limão siciliano";
            break;
            case 3: mensagem = "prato com o quadro da monalisa, + esse jantar com o sócia do Pablo Picasso";
            break;
            case 4: mensagem = "Melhor uma capivara na mão, do que duas voando, o combo 4 vem com uma delíciosa e grande capivara (obs: damos garfo e faca para você corta-la, o que não tem nos outros combos";
            break;
            case 5: mensagem = "Para você vegano temos o bolo vegano, feito de farinha e Graviola";
            break;
            case 6: mensagem = "se tiver com pouca fome, para o pior combo da noite, temos um péssimo arroz e um simples frango";
            break;
            default: mensagem = "vá no Mc'Donalds se quiser pedir esse!";
        }
        System.out.println("Parabéns pelo pedido o combo " + combo + " com: " + mensagem + " está sendo preparado!");
    }
}
