//33) Crie um programa que leia o nome e o turno (M ou V) de um aluno e exiba uma mensagem de saudação de acordo com o turno.
// Matutino: "Bom dia, aluno", Vespertino: "Boa tarde, aluno".
package exerciciosjava;
import java.util.*;

public class Ex033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do aluno? ");
        String nome = sc.nextLine();
        System.out.println("Qual turno " + nome + " estuda? (M ou V)");
        String turno = sc.nextLine();

        turno = turno.toUpperCase();

        while (!turno.equals("M") && !turno.equals("V")) {
            System.out.println("Qual turno " + nome + " estuda? 'M' para Matutino ou 'V' para Vespertino: ");
            turno = sc.nextLine();

            turno = turno.toUpperCase();
        };


        if(turno.equals("M")){
            System.out.println("Bom dia, " + nome + "!");
        }
        else {
            System.out.println("Boa tarde, " + nome +"!");
        }

    } //esse eu gostei
}
