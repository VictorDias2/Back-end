// ATIVIDADE 12- Usando o objeto Telefone Celular, desenvolva um programa em Java, onde seja encontrada um métod0 principal (Void Main), onde sejam exibidos 5 atributos instanciados, utilizando também os getters e os setters para a construção.
//Coloque aqui o link do exercício no Github.

package exerciciosjava;
import java.util.Scanner;

public class ExTelefone {
    private int numero;
    private String qtdContatos;
    private String marca;
    private String nomeDono;
    private String estadoFisico;

    @Override
    public String toString() {
        return "ExTelefone{" + "numero=" + numero + ", qtdContatos="
                + qtdContatos + ", marca=" + marca + ", nomeDono=" + nomeDono + ", estadoFisico=" + estadoFisico + '}';
    }


    public ExTelefone(int numero, String qtdContatos, String marca, String nomeDono, String estadoFisico) {
        this.numero = numero;
        this.qtdContatos = qtdContatos;
        this.marca = marca;
        this.nomeDono = nomeDono;
        this.estadoFisico = estadoFisico;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getQtdContatos() {
        return qtdContatos;
    }

    public void setQtdContatos(String qtdContatos) {
        this.qtdContatos = qtdContatos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(String estadoFisico) {
        this.estadoFisico = estadoFisico;
    }
}